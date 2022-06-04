package com.company;

public class FigurasCompuestas {
    Figuras [] Figuras;

    public FigurasCompuestas(Figuras[] figurasSimples) {

        Figuras = figurasSimples;
    }
    public double areaFinal() {
        double resultado = 0.0;
        for (int i = 0; i < Figuras.length; i++) {
            resultado = resultado + Figuras[i].calcularArea();
        }
        return resultado;
    }

    public void imprimirArea() {

        System.out.println("El area de la figura compleja es: "+areaFinal());
    }
    public double perimetroFinal() {
        double resultado = 0.0;
        for (int i = 0; i < Figuras.length; i++) {
            resultado = resultado + Figuras[i].calcularPerimetro();
        }
        return resultado;
    }

    public void imprimirPerimetro() {

        System.out.println("El perimetro de la figura compleja es: "+perimetroFinal());
    }



}
