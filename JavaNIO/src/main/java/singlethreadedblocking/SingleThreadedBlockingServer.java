package singlethreadedblocking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreadedBlockingServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket s = ss.accept(); // this blocks and s can never be null
            handle(s);
        }
    }

    private static void handle(Socket socket) throws IOException {
        System.out.printf("Connected to %s%n", socket);
        try (
                socket;
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream()
        ) {
            //in.transferTo(out); // default buffer size is 8192
            int data;
            while ((data = in.read()) != -1) { // read 1 byte at a time and -1 means EOF
                out.write(transmogrify(data));
            }
        } finally {
            System.out.printf("Disconnected from %s%n", socket);
        }
    }

    private static int transmogrify(int data) {
        return Character.isLetter(data) ? data ^ ' ' : data;
    }

}
