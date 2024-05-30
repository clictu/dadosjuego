package com.ejemplo.juegodedados;

import java.util.Random;

class Dado {
    private int valor;

    public Dado() {
        this.valor = 1;
    }

    public int lanzar() {
        Random rand = new Random();
        this.valor = rand.nextInt(6) + 1;
        return this.valor;
    }

    public int getValor() {
        return valor;
    }
}

class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}

class JuegoDeDados {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public JuegoDeDados() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.calculadora = new Calculadora();
    }

    public void jugar() {
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();
        int suma = calculadora.sumar(valor1, valor2);
        System.out.println("Valores lanzados: " + valor1 + " y " + valor2 + ". Suma: " + suma);
        if (suma == 7) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }
    }
}

public class Juego {
    public static void main(String[] args) {
        JuegoDeDados juegoDeDados = new JuegoDeDados();
        juegoDeDados.jugar();
    }
}
