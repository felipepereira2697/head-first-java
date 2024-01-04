import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

    public static void startClient() throws IOException {
        Socket client = new Socket("127.0.0.1", 12345);
        System.out.println("Nice! Client has connected");

        Scanner keyboardInput = new Scanner(System.in);
        PrintStream output = new PrintStream(client.getOutputStream());

        while(keyboardInput.hasNextLine()) {
            output.println(keyboardInput.nextLine());
        }

        //Close connections
        output.close();
        keyboardInput.close();
        client.close();
    }
}
