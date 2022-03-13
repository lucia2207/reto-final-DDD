package co.com.sofka.domain.arPasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arPasajero.values.Prioridad;

public class PrioridadPasajeroModificada extends DomainEvent {
    private final Prioridad prioridad;

    public PrioridadPasajeroModificada(Prioridad prioridad){
        super("sofka.pasajero.modificarprioridad");
        this.prioridad = prioridad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }
}