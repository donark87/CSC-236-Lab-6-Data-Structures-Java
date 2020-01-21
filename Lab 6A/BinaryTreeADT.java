//Donark Patel
//CSC 236-01
//Lab 6A

public interface BinaryTreeADT<T>
{
	public void setRoot(TreeNode<T> newNode);
	public TreeNode<T> getRoot();
	public boolean isEmpty();
	public void swapTrees();
	public String toString();
}