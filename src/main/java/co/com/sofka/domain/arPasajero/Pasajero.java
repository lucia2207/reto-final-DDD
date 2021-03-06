package co.com.sofka.domain.arPasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arPasajero.events.*;
import co.com.sofka.domain.arPasajero.values.*;
import co.com.sofka.domain.arViaje.Viaje;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Pasajero extends AggregateEvent<PasajeroID> {
    protected NombrePasajero nombre;
    protected EdadPasajero edad;
    protected EmailPasajero email;
    protected Prioridad prioridad;

    protected Set<Viaje> viajes;
    protected Set<Cuenta> cuentas;

    // Creacion
    public Pasajero(PasajeroID pasajeroID, NombrePasajero nombre, EdadPasajero edad, EmailPasajero email) {
        super(pasajeroID);
        appendChange(new PasajeroCreado(nombre, edad, email)).apply();
    }

    private Pasajero(PasajeroID pasajeroID) {
        super(pasajeroID);
        subscribe(new PasajeroChange(this));
    }

    public static Pasajero from(PasajeroID pasajeroID, List<DomainEvent> events){
        var pasajero = new Pasajero(pasajeroID);
        events.forEach(pasajero::applyEvent);
        return pasajero;
    }

    // Metodos
    public void cambiarNombreUsuario (NombrePasajero nombre) {
        Objects.requireNonNull(nombre);
        appendChange(new NombrePasajeroModificado(nombre)).apply();
    }

    public void cambiarEmailUsuario (EmailPasajero email) {
        Objects.requireNonNull(email);
        appendChange(new EmailPasajeroModificado(email)).apply();
    }

    public void darPrioridad (Prioridad prioridad) {
        Objects.requireNonNull(prioridad);
        appendChange(new PrioridadPasajeroModificada(prioridad)).apply();
    }

    public void vincularCuenta (CuentaID cuentaId, NombreUsuarioPasajero nombreUsuario) {
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(nombreUsuario);
        // Objects.requireNonNull(contrasena);
        appendChange(new CuentaPasajeroVinculada(cuentaId, nombreUsuario)).apply();
    }

    public void desvincularCuenta (CuentaID cuentaID){
        Objects.requireNonNull(cuentaID);
        appendChange(new CuentaPasajeroDesvinculada(cuentaID)).apply();
    }

    public Optional<Cuenta> getCuentaPorId(CuentaID cuentaID) {
        return this.cuentas.stream().filter((cuenta) -> cuenta.identity().equals(cuentaID)).findFirst();
    }
    /*
    public void cambiarContrasena () {
    }
    */
}