package edu.ingsw.mstulicfontan.tpCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
@EnableAutoConfiguration
public class App {
    Random random = new Random();

    public App() {}

    protected int sumar(int a, int b) {
        return a * b;
    }

    protected int dividir(int a, int b) {
        return a / b;
    }

    @RequestMapping("/")
    String index() {
        String display;
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        display = "Suma random: "+ a + " + " + b + " = " + this.sumar(a,b);
        return display;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}