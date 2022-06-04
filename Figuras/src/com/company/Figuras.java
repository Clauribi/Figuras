package com.company;

public abstract class Figuras {
    protected int base;
    protected int altura;
    abstract public double calcularArea();
    abstract public double calcularPerimetro();


}
 class Main {

 public static void main(String[] args) {
     // Figura 1: rectangulo + circulo. calcular Area y perimetro
     FigurasCompuestas figura1 = new FigurasCompuestas( new Figuras[]{new Rectangulo(10,5), new Semicirculo(5), new Semicirculo(5)});
     figura1.imprimirArea();
     figura1.imprimirPerimetro();
     System.out.println();
     // Figura 2: cuadrado+ 2 triangulos + semicirculo. Calcular area
     FigurasCompuestas figura2 = new FigurasCompuestas( new Figuras[]{new Cuadrado(4,4),new Triangulo(4,4), new Triangulo(4,4), new Semicirculo(4)});
     figura2.imprimirArea();







     }
 }