package co.com.sofka.domain.arViaje.value;

import co.com.sofka.domain.generic.Identity;

public class OrigenID extends Identity {
    private OrigenID (String uid) {
        super(uid);
    }

    public OrigenID () {}

    public static OrigenID of (String uid) {
        return new OrigenID(uid);
    }

}
