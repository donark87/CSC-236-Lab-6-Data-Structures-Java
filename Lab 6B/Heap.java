//Donark Patel
//CSC 236-01
//Lab 6B

public class Heap<T> implements HeapADT
{
	private T[] elements;
	private int heapSize;

	/**
	Default Constructor
	Postcondition: Create an array with deafult values
				   heapSize = 250
	**/
	public Heap()
	{
		this(250);
	}

	/**
	Overloaded constructor
	Postcondition: Create an array with user input
		   	       elements.length = maxsize
		   	       heapSize = 0;
	**/
	public Heap(int maxSize)
	{
		elements = (T[]) new Object [maxSize];
		heapSize = 0;
	}

	/**
	Method to add an element to a heap
	Precondition: A heap must exist
	Postcondition: An element is added to the heap
	**/
	public void add(Comparable newElement)
	{
		T swap;
		heapSize++;
		int insert = heapSize -1;
		int parent = (insert -1)/2;

		elements[insert] = (T) newElement;
		swap = elements[parent];

		while(newElement.compareTo(swap)> 0)
		{
			elements[insert] = swap;
			elements[parent] = (T) newElement;
			insert = parent;
			parent = (insert-1)/2;
			swap = elements[parent];
		}
	}

	/**
	Method to remove an element from a heap
	Precondition: A heap must exist
	Postcondition: An element is removed from a heap
	**/
	public void remove()
	{
		T move;
		int moveSubscript = 0;
		boolean leftBigger,
				rightBigger;

		move = elements[moveSubscript] = elements[heapSize - 1];
		heapSize --;

		leftBigger = ((2 * moveSubscript + 1) < heapSize)
					  &&(((Comparable)elements[2 * moveSubscript +1])
					  .compareTo(elements[moveSubscript])> 0);

		rightBigger = ((2 * moveSubscript + 2) < heapSize)
					   &&(((Comparable)elements[2 * moveSubscript + 2])
					   .compareTo(elements[moveSubscript]) > 0 );

		while(leftBigger || rightBigger)
		{
			if (((2 * moveSubscript + 2) < heapSize)
			&& ((Comparable) elements[2 * moveSubscript + 2])
			.compareTo(elements[2 * moveSubscript + 1]) > 0)
			{
				elements[moveSubscript] = elements[2 * moveSubscript + 2];
				elements[2 * moveSubscript + 2] = move;
				moveSubscript = 2 * moveSubscript + 2;

			}
			else
			{
				 elements[moveSubscript] = elements[2 * moveSubscript + 1];
				 elements[2 * moveSubscript + 1] = move;
				 moveSubscript = 2 * moveSubscript + 1;

			}

			leftBigger = ((2 * moveSubscript + 1) < heapSize)
			               && (((Comparable)elements[2 * moveSubscript + 1])
			               .compareTo(elements[moveSubscript]) > 0);

			rightBigger = ((2 * moveSubscript + 2) < heapSize)
			               && (((Comparable)elements[2 * moveSubscript + 2])
			               .compareTo(elements[moveSubscript]) > 0);

		}
	}

	/**
	Method to return an element from the heap
	Precondition: A heap must exist and not empty
	Postcondition: The element at a given subscript is returned
	**/
	public T getValue(int subscript)
	{
		return elements[subscript];
	}

	/**
	Method to return  the root of a heap
	Precondition: A heap must exist and not empty
	Postcondition: The element at subscript 0 is returned
	**/
	public T getRoot()
	{
		return getValue(0);
	}

	/**
	Method to check if the heap is empty
	Postcondition: Returns true if the heap is empty
				   Returns false if the heap is not empty
	**/
	public boolean isEmpty()
	{
		return heapSize == 0;
	}

	/**
	Method to check if the heap is full
	Postcondition: Returns true if the heap is full
				   Returns false if the heap is not full
	**/
	public boolean isFull()
	{
		return heapSize == elements.length;
	}

	/**
	Method to output an object of the Heap class
	**/
	public String toString()
	{
		String str = "";

		for(int i = 0; i <heapSize; i++)
		{
			str += elements[i] + " ";
		}

		return str;
	}
}