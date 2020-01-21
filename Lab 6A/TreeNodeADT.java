//Donark Patel
//CSC 236-01
//Lab 6A

public interface TreeNodeADT<T>
{
	public void setValue(T newValue);
	public void setLeft(TreeNode<T> newLeft);
	public void setRight(TreeNode<T> newRight);
	public T getValue();
	public TreeNode<T> getLeft();
	public TreeNode<T> getRight();
	public String toString();
}