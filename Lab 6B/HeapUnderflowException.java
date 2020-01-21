//Donark Patel
//CSC 236-01
//Lab 6

public class HeapUnderflowException extends HeapException
{
	/**
		Default Constructor
		Display the HeapUnderflowException's default message.
	**/
	public HeapUnderflowException()
	{
		super("Underflow");
	}

	/**
		Overloaded Constructor
		Display the HeapUnderflowException's message passed by the user.
	**/
	public HeapUnderflowException(String message)
	{
		super(message);
	}
}