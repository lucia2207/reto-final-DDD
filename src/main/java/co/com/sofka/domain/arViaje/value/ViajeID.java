package co.com.sofka.domain.arViaje.value;

import co.com.sofka.domain.generic.Identity;

public class ViajeID extends Identity {
    private ViajeID (String uid) {
        super(uid);
    }

    public ViajeID() {}

    public static ViajeID of (String uid) {
        return new ViajeID(uid);
    }
}