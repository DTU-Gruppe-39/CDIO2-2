import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import socket.Connection;

public class IO {
	private Connection conn;
	private Socket clientSocket;
	private DataOutputStream sendToServer;
	private BufferedReader getFromServer;
	private String responseFromServer, messageToServer, name = "Marcus", status = "";
	private DTO dto;
	
	public IO(DTO dto) throws UnknownHostException, IOException {
		this.dto = dto;
		conn = new Connection("127.0.0.1", 8000);
		clientSocket = conn.SocketConn();
		sendToServer = conn.getWriter();
		getFromServer = conn.getReader();
	}
	
	public void run() throws IOException 
	{
	sendToServer.writeBytes("RM20 8 ”Indtast operatør nr” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();		
	responseFromServer = getFromServer.readLine();		
	dto.setOperatorId(responseFromServer); //saves in DTO
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”" + this.name + "” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Indtast batch nr” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	responseFromServer = getFromServer.readLine();		//Save
	dto.setBatchId(responseFromServer); //converts to the corresponding values if it contains chars.
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Vægten skal være ubelastet” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Placer tara” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("S" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	responseFromServer = getFromServer.readLine();		//Save
	//dto.setTaraWeight(Integer.parseInt(responseFromServer)); //converts to the corresponding values if it contains chars.
	dto.setTaraWeight(responseFromServer);
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Placer netto” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("S" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	responseFromServer = getFromServer.readLine();		//Save
	//dto.setNetWeight(Integer.parseInt(responseFromServer)); //converts to the corresponding values if it contains chars.
	dto.setNetWeight(responseFromServer);
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Fjern brutto” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("S" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	responseFromServer = getFromServer.readLine();		//Save
	//dto.setBruttoWeight(Integer.parseInt(responseFromServer)); //converts to the corresponding values if it contains chars.
	dto.setBruttoWeight(responseFromServer);
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”" + status + "” “” “&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	dto.toString();
	}
}