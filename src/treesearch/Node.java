/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treesearch;

/**
 *
 * @author 12101145
 */
public class Node {
    
    //this node's parent node
    private Node parent;
    //this node's children nodes
    private Node[] children;
    //this node's total number of child nodes
    private int totalNodes;
    //this node's value
    private int value;
    
    //creates a Node with no parent, value or children
    public Node(){
        
        this.parent = null;
        this.children = null;
        this.totalNodes = 0;
        this.value = -1;
        
    }
    
    //creates a node with no parent or children but a value (val)
    public Node(int val){
        
        this.parent = null;
        this.children = null;
        this.totalNodes = 0;
        this.value = val;
        
    }
    
    //creates a node with a parent (pred), a value (val) and an array of child nodes (child)
    public Node(Node pred, int val, Node[] child){
        
        this.parent = pred;
        this.children = child;
        this.totalNodes = child.length;
        this.value = val;
        
    }
    
    //creates a node with a parent (pred), value (val) and an empty number of child nodes (nodeNo)
    public Node(Node pred, int val, int nodeNo){
        
        this.parent = pred;
        this.children = new Node[nodeNo];
        this.value = val;
        this.totalNodes = nodeNo;
        
    }
    
    //returns the index of the next child node to be inserted
    public int nextFreeChildNode(){
        
        for (int i = 0; i < totalNodes; i++){
            
            if (children[i] == null){
                
                return i;
                
            }
            
        }
        
        return -1;
    }
    
    //returns true if a child node is appended to this node
    //else returns false
    public boolean appendChildNode(Node n){
        
        if (this.totalNodes >0){
            
            int location = this.nextFreeChildNode();
        
            if (location >= 0){

                children[location] = n;
                return true;

            }else{

                return false;

            }
            
        }else{
            
            return false;
            
        }
        
    }
    
    //sets the child node of this node at index location to n
    public boolean setChildNodeAt(Node n, int location){
        
        if (totalNodes >0 && location >=0){
            
            this.children[location] = n;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    //sets the value of this node
    public boolean setValue(int val){
        
        if (val >= 0){
            
            this.value = val;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    //returns the value of this node
    public int getValue(){
        
        return this.value;
        
    }
    
    //returns the parent of this node
    public Node getParent(){
        
        return this.parent;
        
    }
    
    //returns the children of this node
    public Node[] getChildren(){
        
        return this.children;
        
    }
    
    //sets the parent of this node to pred
    public boolean setParent(Node pred){
        
        if (pred != null){
            
            this.parent = pred;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
}
