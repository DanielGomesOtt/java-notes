package error;

public class StackOverFlow {

    public static void main(String[] args) {
        recursividade();
    }

    //essa função irá causar um estouro de stack e isso irá causar um StackOverflowError
    public static void recursividade(){
        recursividade();
    }
}
