package sk.stuba.fei.uim.oop.zvierata;

/**
 * Tato trieda reprezentuje psa
 * @author Tomas
 */
public class Pes extends Zviera {
    /**
     * Konstruktor pomocou ktoreho nainicializujeme psa a jeho meno
     * @param meno - reprezentuje meno psa
     *
     */
    public Pes(String meno) {
        super(meno);
    }

    /**
     * Metoda ktora vypise na obrazovku zvuk psa
     */
    @Override
    public void zvukZvierata() {
        System.out.println("hau hau");
    }



}
