package com.practice.output.exceptionHandling;

public class ReturnValueFromTryCatchFinally3 {

	public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }
 
    @SuppressWarnings("finally")
	static int methodReturningValue()
    {
        try
        {
            int i = Integer.parseInt("12334");   //This statement throws NumberFormatException
            return i;
        }
        finally
        {
        	//return 12;
        }
      
    }

}
