package br.com.daniel.modulos;

import br.com.daniel.modulos.interno.OperacoesAritmeticas;

public class Calculadora {

    private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        return operacoesAritmeticas.soma(nums);
    }
}
