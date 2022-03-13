package co.com.sofka.domain.arConductor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.arConductor.values.NombreConductor;
import co.com.sofka.domain.arConductor.values.ConductorID;

public class ModificarNombre extends Command {
    private final ConductorID conductorID;
    private final NombreConductor nombre;

    public ModificarNombre(ConductorID conductorID, NombreConductor nombre){
        this.nombre = nombre;
        this.conductorID = conductorID;
    }

    public ConductorID getConductorID() {
        return conductorID;
    }

    public NombreConductor getNombre() {
        return nombre;
    }
}