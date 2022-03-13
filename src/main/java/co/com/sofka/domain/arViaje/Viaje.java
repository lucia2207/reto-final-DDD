package co.com.sofka.domain.arViaje;

import co.com.sofka.domain.arConductor.Conductor;
import co.com.sofka.domain.arConductor.values.ConductorID;
import co.com.sofka.domain.arViaje.events.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.arPasajero.Pasajero;
import co.com.sofka.domain.arPasajero.values.PasajeroID;
import co.com.sofka.domain.arViaje.value.Costo;
import co.com.sofka.domain.arViaje.value.Fecha;
import co.com.sofka.domain.arViaje.value.MetodoPago;
import co.com.sofka.domain.arViaje.value.ViajeID;

import java.util.Objects;
import java.util.Set;

public class Viaje extends AggregateEvent<ViajeID> {
    protected Fecha fecha;
    protected Costo costo;
    protected MetodoPago metodoPago;

    protected Conductor conductor;
    protected Set<Pasajero> pasajeros;
    protected Origen origen;
    protected Destino destino;

    // Creacion
    public Viaje(ViajeID entityId, Fecha fecha, Costo costo, MetodoPago metodoPago) {
        super(entityId);
        appendChange(new ViajeCreado(fecha, costo, metodoPago)).apply();
    }

    private Viaje(ViajeID entityID){
        super(entityID);
        subscribe(new ViajeChange(this));
    }

    // Metodos
    public void agregarUsuarioPasajero (PasajeroID pasajeroID) {
        Objects.requireNonNull(pasajeroID);

        appendChange(new PasajeroVinculado(pasajeroID)).apply();
    }

    public void agregarUsuarioConductor (ConductorID conductorID) {
        Objects.requireNonNull(conductorID);

        appendChange(new ConductorVinculado(conductorID)).apply();
    }

    public void agregarDestino (Destino destino) {
        Objects.requireNonNull(destino);

        appendChange(new DestinoVinculado(destino)).apply();
    }

    public void agregarOrigen (Origen origen) {
        Objects.requireNonNull(origen);

        appendChange(new OrigenVinculado(origen)).apply();
    }
}