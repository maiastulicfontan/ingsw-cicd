package edu.ingsw.mstulicfontan.tpCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {

    public App() {}

    protected int sumar(int a, int b) {
        return a + b;
    }

    protected int dividir(int a, int b) {
        return a / b;
    }

    @RequestMapping("/")
    String index() {
        return "4 + 3 = " + this.sumar(4, 3);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}