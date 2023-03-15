package sk.stuba.fei.uim.oop;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> auta = new HashSet<>();
        auta.add("Volvo");
        auta.add("BMW");
        auta.add("Skoda");
        auta.add("BMW");

        System.out.println(auta);
    }
}
