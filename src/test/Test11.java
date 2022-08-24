package test;

public class Test11 {

	public static void main(String[] args) {


		String a=null;
		
		
		try
		{
			System.out.println(a.length());
		}
        catch(NullPointerException e)
		{
        	System.out.println("String Is Null proceed further");
		}
		
	}

}
