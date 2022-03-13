package co.com.sofka.domain.arViaje.events;

import co.com.sofka.domain.arConductor.values.ConductorID;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arPasajero.values.PasajeroID;

public class ConductorVinculado extends DomainEvent {
    private final ConductorID conductorID;

    public ConductorVinculado(ConductorID conductorID) {
        super("sofka.viaje.conductorvinculado");
        this.conductorID = conductorID;
    }

    public ConductorID getPasajeroID() {
        return this.conductorID;
    }
}