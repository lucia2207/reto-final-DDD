package co.com.sofka.domain.arViaje.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arViaje.value.*;

public class ViajeCreado extends DomainEvent {
    private final Fecha fecha;
    private final Costo costo;
    private final MetodoPago metodoPago;

    public ViajeCreado(Fecha fecha, Costo costo, MetodoPago metodoPago) {
        super("sofka.viaje.creado");
        this.fecha = fecha;
        this.costo = costo;
        this.metodoPago = metodoPago;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Costo getCosto() {
        return costo;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}