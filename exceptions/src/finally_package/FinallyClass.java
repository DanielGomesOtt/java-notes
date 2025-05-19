package finally_package;

public class FinallyClass {

    public static void main(String[] args) {
        try {
            System.out.println("Liberando processo");
            System.out.println("Executando processo");
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Encerrando processo");
        }
    }
}
