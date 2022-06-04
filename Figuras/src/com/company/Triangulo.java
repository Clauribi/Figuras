package com.company;

public class Triangulo extends Figuras {
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base*this.altura/2;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
