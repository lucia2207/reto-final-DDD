package co.com.sofka.domain.arConductor.events;

import co.com.sofka.domain.arConductor.values.NombreConductor;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreConductorModificado extends DomainEvent {
    private final NombreConductor nombreConductor;

    public NombreConductorModificado(NombreConductor nombre) {
        super("sofka.pasajero.modificarnombre");
        this.nombreConductor = nombre;
    }

    public NombreConductor getNombreConductor() {
        return nombreConductor;
    }
}