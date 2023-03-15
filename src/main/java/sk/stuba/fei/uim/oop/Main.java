package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;
import sk.stuba.fei.uim.oop.zvierata.ZvieraComparator;

import javax.crypto.Mac;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>();
        zveri.add(new Pes("Dunco"));
        zveri.add(new Pes("Luna"));
        zveri.add(new Macka("Murko"));
        zveri.add(new Macka("Garfield"));

        List<String> mena = zveri.stream().map(Zviera::getMeno).collect(Collectors.toList());
        mena.add("Tomas");
        for (var meno: mena) {
            System.out.println(meno);
        }
        System.out.println("-----");

        List<Pes> psi = zveri.stream().filter(zviera -> zviera instanceof Pes).map(pes -> (Pes) pes).collect(Collectors.toList());
        psi.forEach(Pes::zvukZvierata);

        System.out.println("----");

        List<Pes> psi2 = Collections.nCopies(5, new Pes("Dunco"));

        System.out.println("----");

        List<Macka> macky = Stream.generate(() -> new Macka("Murko")).limit(5).collect(Collectors.toList());

        System.out.println("----");
    }
}
