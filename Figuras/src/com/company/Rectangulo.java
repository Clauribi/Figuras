package com.company;

public class Rectangulo extends Figuras {
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base*this.altura;
    }

    public double calcularPerimetro() {

        return (2*this.base);
    }

}

