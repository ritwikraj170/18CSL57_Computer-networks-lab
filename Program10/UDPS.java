import java.io.*;
 import java.net.*;
public class UDPS
{
	public static void main(String[] args)
	{
		DatagramSocket skt=null;
		try
		{
		skt=new DatagramSocket(6789); 	
		byte[] buffer = new byte[1000];
		while(true)
		{
		DatagramPacket request = new DatagramPacket(buffer,buffer.length);
		skt.receive(request);
		String[] message = (new String(request.getData())).split(" ");
		byte[] sendMsg= (message[1]+ " server processed").getBytes();
		DatagramPacket reply	=	new DatagramPacket(sendMsg,sendMsg.length,request.getAddress (),request.getPort());
		skt.send(reply);
		}
		}
		catch(Exception ex)
		{
		}
	}
}
