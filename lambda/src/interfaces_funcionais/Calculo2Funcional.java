package interfaces_funcionais;

// essa anotação mostra que é uma interface funcional, aonde só pode ter um metodo sem implementacao
// isso para saber qual função sera usada na hora da lambda expression
@FunctionalInterface
public interface Calculo2Funcional {

    double executar (int a, int b);
}
