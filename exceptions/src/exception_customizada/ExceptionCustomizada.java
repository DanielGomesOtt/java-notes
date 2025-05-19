package exception_customizada;

public class ExceptionCustomizada extends Exception{

    public ExceptionCustomizada() {
        super("Mensagem da exception");
    }

    public ExceptionCustomizada(String message) {
        super(message);
    }
}
// só importar e usar essa exception checked. da para usar unchecked herdando do runtimeexception