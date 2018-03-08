package socket;
import java.io.*;
import java.net.*;

public class Connection 
{
	private BufferedReader br;
	private DataOutputStream dos;
	private int port = 0;
	private String LocalHost = "";
	private Socket clientSocket = null;

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
		this.clientSocket = new Socket(this.LocalHost, this.port);
		return clientSocket;
	}
	
	public BufferedReader getReader() throws IOException {
		br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		return br;
	}
	
	public DataOutputStream getWriter() throws IOException{
		dos = new DataOutputStream(clientSocket.getOutputStream());
		return dos;
	}
}