//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null)
			tree = new TreeNode(val);
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		
		if(dirTest < 0) // you need to fix that, the <= in the labs is wrong
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}

   public void inOrder()
	{
	   System.out.println("IN ORDER");
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	//add preOrder, postOrder, and revOrder
	
	public void preOrder()
	{
		System.out.println("PRE ORDER");
		preOrder(root); //honestly, the only reason we need to do this is because 
		//TreeNode called root is a private and this is the the only why to acess it by making two methods with different parameters
		
		System.out.println(); //for spacing purposes
		System.out.println();
		System.out.println();
	}
	
	//I write private so it's good practice, because I don't want the user to use it
	private void preOrder(TreeNode tree)
	{
		if(tree != null) //it gives me a java.lang.NullPointerException, so to prevent that i did this - side note, you cannot do tree.getValue() != null, getValue() is suppose to return a number
		{
			System.out.print(tree.getValue() + " "); //the parent
			preOrder(tree.getLeft()); //acorrding to the output in the labs, the tree is going to the left as much as it can
			preOrder(tree.getRight()); //then it goes back up the tree, but not after checking if there is one on the right
		}
		
	}
	
	public void postOrder()
	{
		System.out.println("POST ORDER");
		postOrder(root);
		
		System.out.println(); //for spacing purposes
		System.out.println();
		System.out.println();
	}
	public void postOrder(TreeNode tree)
	{
		if(tree != null)
		{
			postOrder(tree.getLeft()); //keeps going left
			postOrder(tree.getRight()); //usually gets to the node where the parent has 'null' childs, so going to the right won't do anything for now
			System.out.print(tree.getValue() + " ");
		}
		
		
	}
	
	public void revOrder()
	{
		System.out.println("REVERSE ORDER");
		revOrder(root);
		
		System.out.println(); //for spacing purposes
		System.out.println();
		System.out.println();
	}
	public void revOrder(TreeNode tree)
	{
		//go to the right
		if(tree != null)
		{
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}
	



	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}



	//add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull














	
	//add extra credit options here - 10 points each
	
	//search
	
//	public boolean search(Comparable val, TreeNode tree)
//	{
//		int differ = root.getValue().compareTo(val);
//		if( differ == 0)
//		{
//			return true;
//		}
//		else if(differ > 0)
//		{
//			return search(val, tree.getLeft());
//		}
//		else
//		{
//			return search(val, tree.getRight());
//		}
//		
//	}
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		return "";
	}
}