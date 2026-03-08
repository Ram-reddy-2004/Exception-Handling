package Exceptions;

import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
public class Exceptions {
	
	static void m1(int age) throws InvalidAgeException{
		if(age < 18) throw new InvalidAgeException("Ur Not Eligible...");
		else {
			System.out.println("Ur Allowed...");
		}
	}
	public static void main(String[] args){
		int age =11;
	
		try{
			m1(11);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Exceptions are Completed..");
		}
		
	}

}
