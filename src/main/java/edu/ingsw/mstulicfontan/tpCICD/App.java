package edu.ingsw.mstulicfontan.tpCICD;

public class App {

    public App() {}

    protected int sumar(int a, int b) {
        return a + b;
    }

    protected int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        App app = new App();

        app.sumar(2,4);
    }

}