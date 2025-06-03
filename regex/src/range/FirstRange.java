package range;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstRange {

    // \d = Todos os digitos
    // \D = Tudo que não for digito
    // \s = Espaços em branco
    // \S = Todos caracteres excludindo os espaços em branco
    // \w = Todas as letras e underscore
    // \W = Tudo que não for letra nem underscore
    // [] = Cada item aqui é procurado separadamente, exemplo: [abc] = procurar ou por a ou por b ou por c e não pela junção de abc
    // ? Zero ou uma ocorrencia
    // * zero ou mais ocorrencias
    // + uma ou mais ocorrencias
    // {n, m} de n até m
    // () agrupamento de caracteres
    // | o(v | c) o = ovo ou oco
    // $ representa fim da linha
    // . caracter coringa. exemplo 1.3 -> 123 ou 1a3 ou qualquer coisa entre 1 e 3
    // ^ verifica o começo da linha. exemplo ^\w+ -> verifica se começa com letra ou underscore. Da pra usar como negação. exemplo [^abc] -> tudo que não começa com a, b ou c
    public static void main(String[] args) {
        //regex criado
        String regex = "[a-zA-C]";
        String text = "azheatyzjaAklejKEJEGcC";
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
