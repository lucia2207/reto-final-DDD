package co.com.sofka.domain.arConductor.values;

import co.com.sofka.domain.generic.Identity;

public class CuentaID extends Identity {
    private CuentaID (String uid) {
        super(uid);
    }

    public CuentaID () {}

    public static co.com.sofka.domain.arConductor.values.CuentaID of (String uid) {
        return new co.com.sofka.domain.arConductor.values.CuentaID(uid);
    }
}
