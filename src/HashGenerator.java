import java.security.MessageDigest;

public class HashGenerator {

    public static String gerarHash(String senha) throws Exception {

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] hash = md.digest(senha.getBytes());

        StringBuilder hex = new StringBuilder();

        for (byte b : hash) {
            String s = Integer.toHexString(0xff & b);

            if (s.length() == 1)
                hex.append('0');

            hex.append(s);
        }

        return hex.toString();
    }

    public static void main(String[] args) throws Exception {

        String senha = "admin123";

        String hash = gerarHash(senha);

        System.out.println("Senha: " + senha);
        System.out.println("Hash SHA-256: " + hash);
    }
}