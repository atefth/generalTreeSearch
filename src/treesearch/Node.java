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
    
    public Node(){
        
        this.parent = null;
        this.children = null;
        this.totalNodes = 0;
        this.value = -1;
        
    }
    
    public Node(int val){
        
        this.parent = null;
        this.children = null;
        this.totalNodes = 0;
        this.value = val;
        
    }
    
    public Node(Node pred, int val, Node[] child){
        
        this.parent = pred;
        this.children = child;
        this.totalNodes = child.length;
        this.value = val;
        
    }
    
    public Node(Node pred, int val, int nodeNo){
        
        this.parent = pred;
        this.children = new Node[nodeNo];
        this.value = val;
        this.totalNodes = nodeNo;
        
    }
    
    private Node parent;
    private Node[] children;
    private int totalNodes;
    private int value;
    
    public int nextFreeChildNode(){
        
        for (int i = 0; i < totalNodes; i++){
            
            if (children[i] == null){
                
                return i;
                
            }
            
        }
        
        return -1;
    }
    
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
    
    public boolean setChildNodeAt(Node n, int location){
        
        if (totalNodes >0 && location >=0){
            
            this.children[location] = n;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    public boolean setValue(int val){
        
        if (val >= 0){
            
            this.value = val;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    public int getValue(){
        
        return this.value;
        
    }
    
    public Node getParent(){
        
        return this.parent;
        
    }
    
    public Node[] getChildren(){
        
        return this.children;
        
    }
    
    public boolean setParent(Node pred){
        
        if (pred != null){
            
            this.parent = pred;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
}
