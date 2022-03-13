package co.com.sofka.domain.arConductor;

import co.com.sofka.domain.arConductor.events.*;
import co.com.sofka.domain.arConductor.values.*;
import co.com.sofka.domain.arViaje.Viaje;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Conductor extends AggregateEvent<ConductorID> {
    protected NombreConductor nombre;
    protected EdadConductor edad;
    protected EmailConductor email;

    protected Set<Viaje> viajes;
    protected Set<co.com.sofka.domain.arConductor.Cuenta> cuentas;

    // Creacion
    public Conductor(ConductorID conductorID, NombreConductor nombre, EdadConductor edad, EmailConductor email) {
        super(conductorID);
        appendChange(new ConductorCreado(nombre, edad, email)).apply();
    }

    private Conductor(ConductorID conductorID) {
        super(conductorID);
        subscribe(new ConductorChange(this));
    }

    public static co.com.sofka.domain.arConductor.Conductor from(ConductorID conductorID, List<DomainEvent> events){
        var conductor = new co.com.sofka.domain.arConductor.Conductor(conductorID);
        events.forEach(conductor::applyEvent);
        return conductor;
    }

    // Metodos
    public void cambiarNombreUsuario (NombreConductor nombre) {
        Objects.requireNonNull(nombre);
        appendChange(new NombreConductorModificado(nombre)).apply();
    }

    public void cambiarEmailUsuario (EmailConductor email) {
        Objects.requireNonNull(email);
        appendChange(new EmailConductorModificado(email)).apply();
    }

    public void vincularCuenta (CuentaID cuentaId, NombreUsuarioConductor nombreUsuario) {
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(nombreUsuario);
        // Objects.requireNonNull(contrasena);
        appendChange(new CuentaConductorVinculada(cuentaId, nombreUsuario)).apply();
    }

    public void desvincularCuenta (CuentaID cuentaID){
        Objects.requireNonNull(cuentaID);
        appendChange(new CuentaConductorDesvinculada(cuentaID)).apply();
    }

    public Optional<Cuenta> getCuentaPorId(CuentaID cuentaID) {
        return this.cuentas.stream().filter((cuenta) -> cuenta.identity().equals(cuentaID)).findFirst();
    }
    /*
    public void cambiarContrasena () {
    }
    */
}