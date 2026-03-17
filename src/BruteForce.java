import java.util.ArrayList;
import java.util.List;

public class BruteForce {

    public static void main(String[] args) {

        String senhaCorreta = "admin123";

        List<String> dicionario = new ArrayList<>();

        dicionario.add("123456");
        dicionario.add("admin");
        dicionario.add("senha");
        dicionario.add("admin123");
        dicionario.add("12345678");

        for (String tentativa : dicionario) {

            System.out.println("Testando senha: " + tentativa);

            if (tentativa.equals(senhaCorreta)) {

                System.out.println("Senha encontrada: " + tentativa);
                break;
            }
        }
    }
}