import java.io.*;
class filewriting
{
	public static void main(String[] args){
		try{
			FileWriter r=new FileWriter("demo.txt");
			try{
				r.write("Hello World! My Name is Debesh Das");
			}
			finally{
				r.close();
			}
			System.out.println("Successfully data is entered in fie...!");
		}
		catch(IOException i){
			System.out.println(i);
		}
	}
}