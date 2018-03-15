package func;
import java.io.IOException;
import java.net.UnknownHostException;

import data.DTO;

public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		DTO dto = new DTO();
//		TCPSocket tcp = new TCPSocket();
		IO io = new IO(dto);
		io.run();
	}

}
