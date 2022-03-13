package co.com.sofka.domain.arPasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arPasajero.values.NombrePasajero;

public class NombrePasajeroModificado extends DomainEvent {
    private final NombrePasajero nombrePasajero;

    public NombrePasajeroModificado(NombrePasajero nombre) {
        super("sofka.pasajero.modificarnombre");
        this.nombrePasajero = nombre;
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }
}