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
	
	/**
	 * In RM20 8 there needs to be exactly 3 words in the message for some reason
	 * @throws IOException
	 */
	public void run() throws IOException 
	{
	sendToServer.writeBytes("RM20 8 ”Indtast operator nr” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();		
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();		
	dto.setOperatorId(responseFromServer); //saves in DTO
	System.out.println(responseFromServer);

	sendToServer.writeBytes("RM20 8 ”t Navn: " + name + "” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();		
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();		
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Indtast batch nr” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();		//Save
	dto.setBatchId(responseFromServer); //converts to the corresponding values if it contains chars.
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Vaegten skal ubelastes” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Placer venligst tara” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("S" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	//dto.setTaraWeight(Integer.parseInt(responseFromServer)); //converts to the corresponding values if it contains chars.
	dto.setTaraWeight(Double.parseDouble(responseFromServer));					//NEEDS TO STRIP RETURN		RETURNS fx. 1.000 kg but saves as double (ASCII 46-57)
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Placer venligst netto” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("S" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	//dto.setNetWeight(Integer.parseInt(responseFromServer)); //converts to the corresponding values if it contains chars.
	dto.setNetWeight(Double.parseDouble(responseFromServer));					//NEEDS TO STRIP RETURN		RETURNS fx. 1.000 kg but saves as double
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Fjern venligst brutto” ”” ”&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("S" + '\n');
	responseFromServer = getFromServer.readLine();		//Save
	//dto.setBruttoWeight(Integer.parseInt(responseFromServer)); //converts to the corresponding values if it contains chars.
	dto.setBruttoWeight(Double.parseDouble(responseFromServer));					//NEEDS TO STRIP RETURN		RETURNS fx. 1.000 kg but saves as double
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("RM20 8 ”Afvejnings status: " + status + "” “” “&3”" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	
	sendToServer.writeBytes("T" + '\n');
	responseFromServer = getFromServer.readLine();
	System.out.println(responseFromServer);
	dto.toString();
	}
}