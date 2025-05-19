package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResource {

    public static void main(String[] args) {
        try(Reader reader = new BufferedReader((new FileReader("teste.txt")))) { //faz a refferencia dessa variavel no catch e da a exceção por aquqi caso de merda nessa ação

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
