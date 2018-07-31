package com.practice.output.exceptionHandling;

public class ReturnValueFromTryCatchFinally2 {

	public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }
 
    @SuppressWarnings("finally")
	static String methodReturningValue()
    {
        String s = null;
        try
        {
            s = "return value from try block";
            int i = 10/0;
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
            //return s;
        }
        finally
        {
            s = s + "return value from finally block";
            //return s;
        }
		return s;
        
    }

}
