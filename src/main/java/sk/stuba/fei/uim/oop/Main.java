package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var pole = new ArrayList<Zviera>();
        pole.add(new Pes("Dunco"));
        pole.add(new Macka("Murko"));

        for (var zver: pole) {
            System.out.println("pred try");
            try {
                System.out.println("zaciatok try");
                kontrola(zver);
                System.out.println("koniec try");
            } catch (NotPesException e) {
                System.out.println("catch pes");
                System.out.println(e.getMessage());
            } catch (NotMackaException e) {
                System.out.println("catch macka");
                System.out.println(e.toString());
            } finally {
                System.out.println("finally");
            }
            System.out.println("po");
            System.out.println("----");
        }
    }

    private static void kontrola(Zviera zver) throws NotPesException, NotMackaException {
        if (zver instanceof Pes) {
            throw new NotMackaException("nie je to Macka!");
        } else {
            throw new NotPesException("nie je to pes");
        }
    }
}
