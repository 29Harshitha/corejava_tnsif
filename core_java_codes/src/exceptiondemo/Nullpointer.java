package exceptiondemo;

public class Nullpointer {
	public static void main(String[] args) {
		String words=null;
		try {
			System.out.println(words.length());
		}catch(NullPointerException e)
		{
			System.out.println("caught Exception:"+e);
		}
		finally
		{
			System.out.println("No matterwhat this block will get executed");
		}
		
	}

}
