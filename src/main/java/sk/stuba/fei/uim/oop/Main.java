package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.svetove.strany.SvetoveStrany;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany juh = SvetoveStrany.JUH;

        for (SvetoveStrany s: SvetoveStrany.values()) {
            if (s.isJeJuh()) {
                System.out.println("Je to juh");
            } else {
                System.out.println("Nie je to juh");
            }
        }

        System.out.println(SvetoveStrany.fromString("juh"));

    }
}
