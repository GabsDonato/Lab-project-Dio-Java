import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidosException e) {
            System.out.println("O primeiro parametro deve ser maior que o segundo: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidosException("O primeiro parametro deve ser maior que o segundo");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
}

class ParametroInvalidosException extends Exception {
    public ParametroInvalidosException(String message) {
        super(message);
    }
}
