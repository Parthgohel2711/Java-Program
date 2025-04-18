import java.io.*;
import java.net.*;

public class javanet {
    public static void main(String[] args) {
        try {
            // 1. Create a ServerSocket object to listen for connections on a specific port
            ServerSocket serverSocket = new ServerSocket(12345); // Replace 12345 with the same port as the client

            // 2. Accept a connection from a client
            Socket clientSocket = serverSocket.accept();

            // 3. Get Input/Output Streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // 4. Read data from the client
            String clientMessage = in.readLine();
            System.out.println("Client: " + clientMessage);

            // 5. Send data back to the client
            out.println("Hello, Client! I received your message.");

            // 6. Close the socket and streams
            clientSocket.close();
            serverSocket.close();
            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}