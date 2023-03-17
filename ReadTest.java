//What are the inputStream and outputStream classes are available to deal with files
//Program to read from a file using BufferedReader class 
import java.io.*;
class ReadTest
 {
   public static void main(String []args)
 {
try
 {
	File f1=new File("C:/my file.txt");
	BufferedReader br=new BufferedReader(new FileReader(f1));
	String str;
 while((str=br.readline())!=null)
 {
	System.out.println(str);
 }
	br.close();
	f1.close();
 }
catch(IOException e)
 {
	e.printStacktrace();
 }
 }
 }
 //Program to write to a File using FileWriter class
 import java. Io *;
class WriteTest
{
 public static void main(String[] args)
 {
  try
  {
   File fl = new File("c:/my file.txt");
   String str="Write this string to my file";
   FileWriter fw = new FileWriter(fl) ;
   fw.write(str);
   fw.close();
   fl.close();
  }
  catch (IOException  e)
  { e.printStackTrace(); }
 }
}
//Program to take String input from Keyboard 
import java.io.*;
class MyInput
{
  public static void main(String[] args)
  {
    String text;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    text = br.readLine();    //Reading String
    System.out.println(text);
  }
}