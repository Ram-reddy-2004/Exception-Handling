package Exceptions;

public class ExceptionClass {

	public static void main(String[] args) {
		int a =10;
		int b=0;
		try {} // blocks
		catch(Exception e) {}// blocks
		try {
			String s="ramkumar";
			System.out.println(s);
			System.out.println(s.length());
			String s1="";
			System.out.println(s1.length());
			String s2=null;
			//System.out.println(s2.length());
			try {
				int[] arr= {10,20,30};
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				//System.out.println(e);
				System.out.println("Array Index out of bounds of exception....");
			}
			int result = a / b;
			System.out.println(result);
			System.out.println("Hi ram...");
		}catch(ArithmeticException e) {
			System.out.println(" zero division error.....");
			//System.out.println(e);
			//e.printStackTrace();
			//System.err.println(e);
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		try {
			String s1="ramkumar";
			System.out.println(s1.charAt(0));
			System.out.println(s1.charAt(9));
		}catch(StringIndexOutOfBoundsException e ) {
			System.out.println("String Index OutOf Bounds Exception getting .....");
		}
		try {
			String s1="ram";
			int value=Integer.parseInt(s1);
			System.out.println(value);
		}catch(NumberFormatException e){
			//System.out.println(e);
			System.out.println("Number format Exception ....");
		}finally{
			System.out.println("program completed ....."); // prints wether try or catck blocks executed
		}
		System.out.println(a);
		System.out.println(b);
		
	}

}
