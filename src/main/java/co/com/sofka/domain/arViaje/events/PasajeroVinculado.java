package co.com.sofka.domain.arViaje.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arPasajero.values.PasajeroID;

public class PasajeroVinculado extends DomainEvent {
    private final PasajeroID pasajeroID;

    public PasajeroVinculado (PasajeroID pasajeroID) {
        super("sofka.viaje.pasajerovinculado");
        this.pasajeroID = pasajeroID;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }
}