import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void startServer() throws IOException {
        //Create a server to receive connection to this port.
        ServerSocket server = new ServerSocket(12345);
        System.out.println("Port 12345 up!");

        //Waits a client to connect and accept
        Socket client = server.accept();
        System.out.println("New Connection with client "+client.getInetAddress().getHostAddress());

        //Lets read whatever the client may send
        Scanner s = new Scanner(client.getInputStream());

        while(s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
        //Close stream
        s.close();
        //close server
        server.close();
        //close client connection
        client.close();
    }
}
