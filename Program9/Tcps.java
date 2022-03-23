import java.net.*; 
import java.io.*; 
public class Tcps 
{ 	
    public static void main(String args[]) throws IOException 	
    { 		
        ServerSocket sersock=new ServerSocket(5000);
        System.out.println("server ready for connection");
        Socket sock=sersock.accept(); 		
        System.out.println("connection is successful"); 		
        InputStream istream=sock.getInputStream(); 		
        BufferedReader fileRead=new BufferedReader(new InputStreamReader(istream)); 		
        String fname=fileRead.readLine(); 		
        BufferedReader contentRead=new BufferedReader(new FileReader(fname)); 		
        OutputStream ostream=sock.getOutputStream(); 		
        PrintWriter pwrite=new PrintWriter(ostream,true); 		
        String str; 		
        while((str=contentRead.readLine())!=null) 
		{ 			
                    pwrite.println(str); 		
                } 
		sock.close(); 		
                sersock.close(); 		
                pwrite.close();  		
                fileRead.close(); 		
                contentRead.close(); 	
    } 
} 