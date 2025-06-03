package pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstPatternMatcher {

    // \d = Todos os digitos
    // \D = Tudo que não for digito
    // \s = Espaços em branco
    // \S = Todos caracteres excludindo os espaços em branco
    // \w = Todas as letras e underscore
    // \W = Tudo que não for letra nem underscore

    public static void main(String[] args) {
        //regex criado
        String regex = "\\d";
        String text = "abaa2ba6b";
        //padrao que o regex deve seguir
        Pattern pattern = Pattern.compile(regex);
        //meio que verifica se o padrão bate com partes do texto
        Matcher matcher = pattern.matcher(text);

        //procurando padrao
        while(matcher.find()) {
            System.out.println(matcher.start() + " ");
        }
    }
}
