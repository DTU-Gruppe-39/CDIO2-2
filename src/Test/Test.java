package Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import data.socket.Connection;

public class Test {
	
	@org.junit.Test
	public void test2() throws UnknownHostException, IOException
	{
		Connection c = new Connection("127.0.0.1", 8000);
		Socket s = c.SocketConn();
		BufferedReader b = c.getReader();
		DataOutputStream d = c.getWriter();
		
		d.writeBytes("RM20 4 ”Indtast operator nr” ”” ”&3”" + '\n');
		String responseFromServer = b.readLine();		
		System.out.println(responseFromServer);
		responseFromServer = b.readLine();		
		//dto.setOperatorId(responseFromServer); //saves in DTO
		System.out.println(responseFromServer);
		//press OK on weight
		d.writeBytes("Q" + '\n');
		s.close(); //closes socket
		d.close(); //closes out
		b.close(); //closes in
		assertEquals("RM20 A " + '"' + '"', responseFromServer);
	}
}
