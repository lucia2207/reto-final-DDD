package co.com.sofka.domain.arConductor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arConductor.values.EdadConductor;
import co.com.sofka.domain.arConductor.values.EmailConductor;
import co.com.sofka.domain.arConductor.values.NombreConductor;

public class ConductorCreado extends DomainEvent {
    private final NombreConductor nombre;
    private final EdadConductor edad;
    private final EmailConductor email;

    public ConductorCreado (NombreConductor nombre, EdadConductor edad, EmailConductor email) {
        super("sofka.conductor.creado");
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public NombreConductor getNombre() {
        return nombre;
    }

    public EdadConductor getEdad() {
        return edad;
    }

    public EmailConductor getEmail() {
        return email;
    }
}