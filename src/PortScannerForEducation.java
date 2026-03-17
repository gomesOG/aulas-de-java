import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class PortScannerForEducation {

    // Mapa com portas conhecidas e seus serviços
    public static Map<Integer, String> portasConhecidas() {

        Map<Integer, String> portas = new HashMap<>();

        portas.put(20, "FTP (Transferência de arquivos - Data)");
        portas.put(21, "FTP (Transferência de arquivos - Control)");
        portas.put(22, "SSH (Acesso remoto seguro)");
        portas.put(23, "Telnet (Acesso remoto antigo)");
        portas.put(25, "SMTP (Envio de e-mails)");
        portas.put(53, "DNS (Resolução de nomes)");
        portas.put(67, "DHCP (Configuração automática de IP)");
        portas.put(68, "DHCP Client");
        portas.put(69, "TFTP (Transferência simples de arquivos)");
        portas.put(80, "HTTP (Servidor Web)");
        portas.put(110, "POP3 (Recebimento de e-mails)");
        portas.put(119, "NNTP (Grupos de notícias)");
        portas.put(123, "NTP (Sincronização de horário)");
        portas.put(137, "NetBIOS");
        portas.put(138, "NetBIOS Datagram");
        portas.put(139, "NetBIOS Session");
        portas.put(143, "IMAP (Recebimento de e-mails)");
        portas.put(161, "SNMP (Gerenciamento de rede)");
        portas.put(179, "BGP (Roteamento da internet)");
        portas.put(389, "LDAP (Diretório de rede)");
        portas.put(443, "HTTPS (Web segura)");
        portas.put(445, "SMB (Compartilhamento Windows)");
        portas.put(3306, "MySQL (Banco de dados)");
        portas.put(3389, "RDP (Acesso remoto Windows)");
        portas.put(5432, "PostgreSQL (Banco de dados)");
        portas.put(5900, "VNC (Controle remoto)");
        portas.put(8080, "HTTP Alternativo / Proxy");

        return portas;
    }

    public static void main(String[] args) {

        String host = "localhost";

        Map<Integer, String> servicos = portasConhecidas();

        System.out.println("====================================");
        System.out.println("Iniciando scan de portas em: " + host);
        System.out.println("====================================");

        for (int port = 1; port <= 1024; port++) {

            try {

                Socket socket = new Socket(host, port);

                String servico = servicos.getOrDefault(port, "Serviço desconhecido");

                System.out.println("Porta aberta: " + port + " | Serviço provável: " + servico);

                socket.close();

            } catch (Exception e) {
                // Porta fechada
            }
        }

        System.out.println("====================================");
        System.out.println("Scan finalizado.");
        System.out.println("====================================");
    }
}