package sk.stuba.fei.uim.oop.zvierata;

public abstract class Zviera implements Comparable<Zviera>{
    protected String meno;

    public Zviera(String meno) {
        this.meno = meno;
    }

    public abstract void zvukZvierata();

    public void pohladkat() {
        System.out.println("Pohladkal som " + this.meno);
        this.zvukZvierata();
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    @Override
    public String toString() {
        return meno;
    }

    @Override
    public int compareTo(Zviera o) {
        return meno.compareTo(o.meno);
    }
}
