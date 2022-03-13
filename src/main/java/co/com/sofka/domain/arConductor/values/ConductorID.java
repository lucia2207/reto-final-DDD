package co.com.sofka.domain.arConductor.values;

import co.com.sofka.domain.generic.Identity;

public class ConductorID extends Identity {
    private ConductorID (String uid) {
        super(uid);
    }

    public ConductorID () {}

    public static co.com.sofka.domain.arConductor.values.ConductorID of (String uid) {
        return new co.com.sofka.domain.arConductor.values.ConductorID(uid);
    }
}