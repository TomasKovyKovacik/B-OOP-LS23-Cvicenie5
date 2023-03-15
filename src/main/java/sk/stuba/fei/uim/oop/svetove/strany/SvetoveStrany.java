package sk.stuba.fei.uim.oop.svetove.strany;

import java.util.Locale;

public enum SvetoveStrany {
    SEVER(false),
    JUH(true),
    ZAPAD(false),
    VYCHOD(false);

    private boolean jeJuh;

    SvetoveStrany(boolean jeJuh) {
        this.jeJuh = jeJuh;
    }

    public static SvetoveStrany fromString(String s) {
        return SvetoveStrany.valueOf(s.toUpperCase(Locale.ROOT));
    }

    public boolean isJeJuh() {
        return jeJuh;
    }
}
