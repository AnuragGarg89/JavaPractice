package com.practice.output.exceptionHandling;

public class ReturnValueFromTryCatchFinally1 {

	public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }
	static int methodReturningValue()
    {
        int i = 0;
 
        try
        {
            i = 1;
            System.out.println("hello"+ i);
            return i;
        }
        catch (Exception e)
        {
            i = 2;
        }
        finally
        {
            i = 4;
            System.out.println("hello"+ i);
        }
 
     return i;
    }

}
