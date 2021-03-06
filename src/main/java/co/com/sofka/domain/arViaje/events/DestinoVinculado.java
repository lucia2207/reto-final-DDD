package co.com.sofka.domain.arViaje.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arViaje.Destino;

public class DestinoVinculado extends DomainEvent {
    private final Destino destino;

    public DestinoVinculado(Destino destino) {
        super("sofka.viaje.pasajerovinculado");
        this.destino = destino;
    }

    public Destino getDestino() {
        return destino;
    }
}