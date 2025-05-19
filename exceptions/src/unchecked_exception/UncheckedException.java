package unchecked_exception;

public class UncheckedException {

    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Finalizando o programa");
    }

    private static int divisao (int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("O segundo argumento não pode ser 0");
        }
        return a / b;
    }
}
