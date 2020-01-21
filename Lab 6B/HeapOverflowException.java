//Donark Patel
//CSC 236-01
//Lab 6

public class HeapOverflowException extends HeapException
{
	/**
		Default Constructor
		Display the HeapOverflowException's default message.
	**/
	public HeapOverflowException()
	{
		super("Overflow");
	}

	/**
		Overloaded Constructor
		Display the HeapOverflowException's message passed by the user.
	**/
	public HeapOverflowException(String message)
	{
		super(message);
	}
}