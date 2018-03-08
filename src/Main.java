import socket.TCPSocket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DTO dto = new DTO();
		TCPSocket tcp = new TCPSocket();
		IO io = new IO(tcp, dto);
	}

}
