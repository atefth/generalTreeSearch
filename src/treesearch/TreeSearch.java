/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treesearch;

/**
 *
 * @author 12101145
 */
public class TreeSearch {

    static Node root;
    static int key;
    int currentChildNode;
    int currentChildNodeLength;
    Node currentNode;
    Node parentNode;
    Node[] childNodes;
    
    public TreeSearch(){
        
        root = null;
        key = -1;
        currentChildNode = -1;
        currentNode = null;
        parentNode = null;
        childNodes = null;
        
    }
    
    public TreeSearch(Node start, int val){
        
        root = start;
        key = val;
        currentChildNode = -1;
        currentNode = root;
        parentNode = null;
        childNodes = currentNode.getChildren();
        
    }
    
    public void init(Node n){
        
       this.currentNode = n;
       this.parentNode = n.getParent();
       this.childNodes = n.getChildren();
       this.currentChildNodeLength = this.childNodes.length;
        
    }
    
    public boolean search(Node[] children){
        
        Node n = children[0];
        
        Node divide[] = new Node[children.length - 1];
        for (int i = 0; i < divide.length; i++){
            
            divide[i] = children[i+1];
            
        }
        
        if (search(n)){
            
            return true;
            
        }else{
            
            if (divide.length != 0)
                return search(divide);
            else
                return false;
            
        }
        
    }
    
    //Take each child node and recursively search the node's first child node
    //untill there is such a node that has no other child nodes
    // or all it's child nodes have been checked.
    //Then recursively move up the tree checking all of the nodes siblings.
    public boolean search(Node n){
        
       init(n);
       
       if (check()){
           
           return true;
           
       }else if(currentChildNodeLength == 0){
           
           return false;
           
       }else{
           
           return search(currentNode.getChildren());
           
       }
        
    }
    
    public boolean check(){
        
        if (key == currentNode.getValue()){
            
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
}
