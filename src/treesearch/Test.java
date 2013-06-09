/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treesearch;

import java.util.Scanner;

/**
 *
 * @author 12101145
 */
public class Test {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Node Tree = new Node(null, 5, 4);
        Node firstChild = new Node(Tree, 2, 2);
        Node secondChild = new Node(Tree, 7, 1);
        Node thirdChild = new Node(Tree, 12, 3);
        Node fourthChild = new Node(Tree, 1, 0);
        
        Node first1Child = new Node(firstChild, 14, 0);
        Node first2Child = new Node(firstChild, 23, 0);
        
        Node second1Child = new Node(secondChild, 13, 0);
        
        Node third1Child = new Node(thirdChild, 21, 0);
        Node third2Child = new Node(thirdChild, 34, 0);
        Node third3Child = new Node(thirdChild, 38, 0);
        
        Tree.appendChildNode(firstChild);
        Tree.appendChildNode(secondChild);
        Tree.appendChildNode(thirdChild);
        Tree.appendChildNode(fourthChild);
        
        firstChild.appendChildNode(first1Child);
        firstChild.appendChildNode(first2Child);
        
        secondChild.appendChildNode(second1Child);
        
        thirdChild.appendChildNode(third1Child);
        thirdChild.appendChildNode(third2Child);
        thirdChild.appendChildNode(third3Child);
        
        Scanner k = new Scanner(System.in);
        boolean count = true;
        
        while(count){
            
            System.out.println("Please enter the number you want to search.");
            int key = k.nextInt();

            TreeSearch t = new TreeSearch(Tree, key);

            System.out.println("Searching for " + key + " in the tree...");
            if (t.search(Tree)){

                System.out.println(key + " was found!");

            }else{

                System.out.println(key + " was not found!");

            }
            
            System.out.println("Continue Searching? Input -1 to exit.");
            key = k.nextInt();
            
            if (key == -1)
                count = false;
            else
                count = true;
            
        }
        
    }
    
}
