package sk.stuba.fei.uim.oop.zvierata;

import java.util.Comparator;

public class ZvieraComparator implements Comparator<Zviera> {
    @Override
    public int compare(Zviera o1, Zviera o2) {
        return o1.getMeno().compareTo(o2.getMeno());
    }
}
