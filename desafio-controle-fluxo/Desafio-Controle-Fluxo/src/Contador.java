import java.util.Scanner;

// Exceção personalizada para validar os parâmetros
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(final String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(final String[] args) {
        final Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        final int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        final int parametroDois = terminal.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (final ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        terminal.close();
    }

    static void contar(final int parametroUm, final int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    
        }
        

        
        for (int i = 1; i <= (parametroDois - parametroUm); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
