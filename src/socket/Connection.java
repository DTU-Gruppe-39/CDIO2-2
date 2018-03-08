package socket;
import java.io.*;
import java.net.*;

public class Connection 
{
	int port = 0;
	String LocalHost = "";
	Socket clientSocket = null;

	/**
	 * Doesn't create connection but fills out values for when you want to make
	 * connection.
	 */
	public Connection(String localHost, int port)
	{
		this.LocalHost = localHost; this.port = port;		 
	}

	/**
	 * Makes connection and returns the connection socket.
	 */
	public Socket SocketConn () throws UnknownHostException, IOException
	{
		clientSocket = new Socket(LocalHost, port);
		return clientSocket;
	}
}