import java.net.Socket;

public class PortScanner {

    public static void main(String[] args) {

        String host = "localhost";

        System.out.println("Iniciando scan de portas em: " + host);

        for (int port = 1; port <= 1024; port++) {

            try {
                Socket socket = new Socket(host, port);
                System.out.println("Porta aberta: " + port);
                socket.close();

            } catch (Exception e) {
                // Porta fechada
            }
        }

        System.out.println("Scan finalizado.");
    }
}