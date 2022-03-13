package co.com.sofka.domain.arConductor.command;

import co.com.sofka.domain.arConductor.Conductor;
import co.com.sofka.domain.arConductor.values.ConductorID;
import co.com.sofka.domain.arConductor.values.EdadConductor;
import co.com.sofka.domain.arConductor.values.EmailConductor;
import co.com.sofka.domain.arConductor.values.NombreConductor;
import co.com.sofka.domain.generic.Command;

public class CrearConductor extends Command {
    private final NombreConductor nombre;
    private final EdadConductor edad;
    private final EmailConductor email;
    private final ConductorID conductorID;

    public CrearConductor(ConductorID conductorID, NombreConductor nombre, EdadConductor edad, EmailConductor email) {
        this.conductorID = conductorID;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    // Getters
    public EmailConductor getEmail() {
        return email;
    }

    public EdadConductor getEdad() {
        return edad;
    }

    public NombreConductor getNombre() {
        return nombre;
    }

    public ConductorID getConductorID() { return conductorID; }
}