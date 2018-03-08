import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import socket.Connection;
import socket.TCPSocket;

public class IO {

	public IO(TCPSocket tcp, DTO dto) throws UnknownHostException, IOException {
		// TODO Auto-generated constructor stub
		Connection conn = new Connection("127.0.0.1",8000);
		Socket clientSocket = conn.SocketConn();
		DataOutputStream sendToServer = conn.getWriter();
		BufferedReader getFromServer = conn.getReader();
	}

}
