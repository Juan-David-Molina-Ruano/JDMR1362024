package org.example;

public class OperacionesMatematicasJDMR {
    private double numero;
    private double resultado;
    public double calcularRaizCuadrada(double numero){

        this.numero = numero;

        resultado = Math.sqrt(numero);

        return resultado;

    }
}
