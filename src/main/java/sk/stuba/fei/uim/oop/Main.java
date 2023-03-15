package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>();
        zveri.add(new Pes("Dunco"));
        zveri.add(new Pes("Luna"));
        zveri.add(new Macka("Murko"));
        zveri.add(new Macka("Garfield"));

        System.out.println(zveri);
        zveri.sort(null);
        System.out.println(zveri);


    }
}
