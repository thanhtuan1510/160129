import java.net.*;
import java.io.*;
public class ShowByteImage  {
	public static void main(String[] args) {
		FileInputStream inFile = null;



		try{
			in = new FileInputStream("1.jpg");
			int data =in.read();
			System.out.println(data);
			inFile.close();






		}catch(IOException e){

		System.err.println("Erros");
		System.exit(1);

		}
	}
	
}