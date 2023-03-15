package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Pes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pes> psi = new ArrayList<>();
        psi.add(new Pes("Dunco"));
        psi.add(new Pes("Luna"));

        psi.forEach(pes -> {
            pes.setMeno(pes.getMeno() + "haha");
        });

        psi.forEach(pes -> System.out.println(pes.getMeno()));
    }
}
