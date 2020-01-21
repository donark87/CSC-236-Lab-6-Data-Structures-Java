///Donark Patel
//CSC 236-01
//Lab 6A

public class TreeNode<T> implements TreeNodeADT<T>
{
	private T value;
	private TreeNode<T> left,right;

	/**
	Default Constructor
	Postcondition: value = initValue
				   left = null
				   right = null
	**/
	public TreeNode(T initValue)
	{
		value = initValue;
		left = null;
		right = null;
	}

	/**
	Overloaded Constructor
	Postcondition: value = initValue
				   left = initLeft
				   right = initRight
	**/
	public TreeNode(T initValue, TreeNode initLeft, TreeNode initRight)
	{
		value = initValue;
		left = initLeft;
		right = initRight;
	}

	/**
	Mthod to set a given value
	Postcondition: value = newValue
	**/
	public void setValue(T newValue)
	{
		value = newValue;
	}

	/**
	Mthod to set a given value to left node
	Postcondition: left = newLeft
	**/
	public void setLeft(TreeNode<T> newLeft)
	{
		left = newLeft;
	}

	/**
	Mthod to set a given value to right node
	Postcondition: right = newRight
	**/
	public void setRight(TreeNode<T> newRight)
	{
		right = newRight;
	}

	/**
	Method to return a value
	Postcondition: return value
	**/
	public T getValue()
	{
		return value;
	}

	/**
	Method to return the left node
	Postcondition: return left
	**/
	public TreeNode<T> getLeft()
	{
		return left;
	}

	/**
	Method to return the right node
	Postcondition: return right
	**/
	public TreeNode<T> getRight()
	{
		return right;
	}

	/**
	Method to output an object of TreeNode class
	**/
	public String toString()
	{
		 return getValue() + " " + (getLeft() != null ? getLeft() : "")
                + (getRight() != null ? getRight() : "");
	}
}