//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
 		
 		BinarySearchTree tree = new BinarySearchTree();
 		tree.add(90);
 		tree.add(100);
 		tree.add(80);
      	tree.add(70);
      	tree.add(85);
      	tree.add(98);
      	tree.add(120);
 		
      	tree.inOrder();
      	
      	tree.preOrder();
 		
 		tree.postOrder();
 		
 		tree.revOrder();
 		
 		System.out.println("Number Of Leaves is " + tree.getNumLeaves());
 		System.out.println("Number of Nodes is " + tree.getNumNodes());
 		System.out.println("Number of Levels is " + tree.getNumLevels());
 		System.out.println("The Width is " + tree.getWidth());
 		System.out.println("The Height is "+ tree.getHeight());
 		System.out.println("The tree is " + tree.isFull());
 		System.out.println(tree);
 
   }
}