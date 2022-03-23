import java.net.*;
import java.io.*;
public class Tcpc
{
	public static void main(String args[]) throws IOException
	{
                          Socket sock=new Socket("127.0.0.1",5000);
		System.out.println("Enter the File Name");
		BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
		String fname=keyRead.readLine();
		OutputStream ostream=sock.getOutputStream();
		PrintWriter pwrite=new PrintWriter(ostream,true);
		System.out.println();
		pwrite.println(fname);
		InputStream istream=sock.getInputStream();
		BufferedReader socketRead=new BufferedReader(new InputStreamReader(istream));
		String str;
		while((str=socketRead.readLine())!=null)
		{
			System.out.println(str);
		}
		sock.close();
		pwrite.close(); 
		keyRead.close();
		socketRead.close();
	}
}
