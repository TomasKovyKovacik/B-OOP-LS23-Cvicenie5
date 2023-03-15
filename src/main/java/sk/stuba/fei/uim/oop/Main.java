package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hlavneMesta = new HashMap<>();
        hlavneMesta.put("Slovensko", "Bratislava");
        hlavneMesta.put("Cesko", "Praha");
        hlavneMesta.put("Madarsko", "Budapest");
        hlavneMesta.put("Polsko", "Varsava");

        System.out.println(hlavneMesta);
        System.out.println(hlavneMesta.get("Slovensko"));
        System.out.println("Mapa je velka : " + hlavneMesta.size());
        System.out.println(hlavneMesta);

        System.out.println("----");

        System.out.println(hlavneMesta);
        hlavneMesta.remove("Slovensko");
        System.out.println(hlavneMesta);

        System.out.println("----");

//        System.out.println(hlavneMesta);
//        hlavneMesta.clear();
//        System.out.println(hlavneMesta);

        System.out.println("----");

        System.out.println("Mapa obsahuje slovensko :" + hlavneMesta.containsKey("Slovensko"));

        for (String s : hlavneMesta.keySet()) {
            System.out.println(hlavneMesta.get(s));
        }
    }
}
