package sk.stuba.fei.uim.oop.zvierata;

public abstract class Zviera {
    protected String meno;

    public Zviera(String meno) {
        this.meno = meno;
    }

    public abstract void zvukZvierata();

    public void pohladkat() {
        System.out.println("Pohladkal som " + this.meno);
        this.zvukZvierata();
    }
}
