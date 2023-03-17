public class MultipleCatchBlock1
{
public static void main(String args[])
{
try
{
String s=null;
System.out.println(s.length());
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException");
}
catch(ArrayIndexOutOfBoundsException e)
		          {
				   System.out.println("ArrayIndexOutOfBounds Exception occurs");
				  }  
catch(Exception e)
{
System.out.println("Parent Exception");
}
System.out.println("twinkle");
}
}