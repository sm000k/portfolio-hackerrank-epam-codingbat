package portfolio.webserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHttpServer {

    static void giveDateStandalone() throws IOException {
        ServerSocket server = new ServerSocket(8080);
        while (true) {
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream()
                        .write(httpResponse.getBytes("UTF-8"));
            }
        }
    }

    static void giveDate(Socket socket) throws IOException {
        Date today = new Date();
        String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
            socket.getOutputStream()
                    .write(httpResponse.getBytes("UTF-8"));

    }

    static void giveResponse() throws IOException{
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for Connection on port 8080 ...");
        while (true) {
            final Socket client = server.accept();
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();
            while (!line.isEmpty()) {
                System.out.println(line);
                line = reader.readLine();

            }
            while (true) {
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    giveDate(client);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        giveResponse();
    }
}

