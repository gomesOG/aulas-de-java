public class BruteForceForEducation {

    // conjunto de caracteres usados no brute force
    static String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    static String senhaCorreta = "aB10";

    static boolean encontrada = false;

    public static void main(String[] args) {

        int tamanhoMaximo = 4; // limite de caracteres pra não explodir seu positivo

        System.out.println("Iniciando ataque de força bruta...\n");

        for (int tamanho = 1; tamanho <= tamanhoMaximo; tamanho++) {

            gerarCombinacoes("", tamanho);

            if (encontrada) {
                break;
            }
        }

        if (!encontrada) {
            System.out.println("\nSenha não encontrada até tamanho " + tamanhoMaximo);
        }

    }

    // função exemplo de RECURSIVIDADE
    public static void gerarCombinacoes(String tentativaAtual, int tamanhoRestante) {

        if (encontrada) {
            return;
        }

        if (tamanhoRestante == 0) {

            System.out.println("Testando senha: " + tentativaAtual);

            if (tentativaAtual.equals(senhaCorreta)) {

                System.out.println("\nSenha encontrada: " + tentativaAtual);
                encontrada = true;
            }

            return;
        }

        for (int i = 0; i < caracteres.length(); i++) {

            gerarCombinacoes(
                    tentativaAtual + caracteres.charAt(i),
                    tamanhoRestante - 1
            );

        }
    }
}