package com.company;

public class Cuadrado extends Figuras {
    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base*this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return base*4;
    }
}
