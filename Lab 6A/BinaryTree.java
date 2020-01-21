//Donark Patel
//CSC 236-01
//Lab 6A

public class BinaryTree<T> implements BinaryTreeADT<T>
{
	private TreeNode root;

	/**
	Default Constructor
	Postcondition: root = null
	**/
	public BinaryTree()
	{
		setRoot(null);
	}

	/**
	Overloaded Constructor
	Postcondition: root = newRoot
	**/
	public BinaryTree(TreeNode<T> newRoot)
	{
		root = newRoot;
	}

	/**
	Method to set a given value to root
	Postcondition: root = newNode
	**/
	public void setRoot(TreeNode<T> newNode)
	{
		root  = newNode;
	}

	/**
	Method to return the value of root
	Postcondition: return root
	**/
	public TreeNode<T> getRoot()
	{
		return root;
	}

	/**
	Method to check if the root node is empty
	Postcondition: returns true if root == null
				   returns false if root != null
	**/
	public boolean isEmpty()
	{
		return root == null;
	}

	/**
	Method to swap subtrees
	Postcondition: return swapped trees
	**/
	public void swapTrees()
	{
		setRoot(swapSubtreeMethod(getRoot()));
	}

	/**
	Private helper method to swap subtrees
	**/
	private TreeNode<T> swapSubtreeMethod(TreeNode<T> root)
	{
		if(root.getLeft() != null || root.getRight() != null)
		{
			return new TreeNode<T>(root.getValue(),
								  (root.getRight()
								  != null ? swapSubtreeMethod(root.getRight()) : null),
								  (root.getLeft()
								  != null ? swapSubtreeMethod(root.getLeft()) : null));
		}
		else
		{
			return root;
		}
	}

	/**
	Method to output objects of class BinaryTree
	**/
	public String toString()
	{
		return getRoot().toString();
	}
}