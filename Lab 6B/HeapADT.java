//Donark Patel
//CSC 236-01
//Lab 6B

public interface HeapADT<T>
{
	public void add(Comparable newElement);
	public void remove();
	public T getValue(int subscript);
	public T getRoot();
	public boolean isEmpty();
	public boolean isFull();
	public String toString();
}