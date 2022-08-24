package test;

public class Test22 {

	public static void main(String[] args) {


		String a="Laxman";
		
		try
		{
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String is null");
		}
		
	}

}
