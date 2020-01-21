//Donark Patel
//CSC 236-01
//Lab 6

public class HeapException extends RuntimeException
{
	/**
		Default Constructor
		Display the HeapException's default message.
	**/
	public HeapException()
	{
	}

	/**
		Overloaded Constructor
		Display the HeapException's message passed by the user.
	**/
	public HeapException(String message)
	{
		super(message);
	}
}