package co.com.sofka.domain.arConductor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.arConductor.values.CuentaID;
import co.com.sofka.domain.arConductor.values.NombreUsuarioConductor;
import co.com.sofka.domain.arConductor.values.ConductorID;

public class VincularCuenta extends Command {
    private final ConductorID conductorID;
    private final CuentaID cuentaID;
    private final NombreUsuarioConductor nombreUsuario;

    public VincularCuenta(ConductorID conductorID, CuentaID cuentaID, NombreUsuarioConductor nombreUsuario){
        this.conductorID = conductorID;
        this.cuentaID = cuentaID;
        this.nombreUsuario = nombreUsuario;
    }

    public CuentaID getCuentaID() {
        return this.cuentaID;
    }

    public NombreUsuarioConductor getNombreUsuario() {
        return this.nombreUsuario;
    }

    public ConductorID getConductorID() {
        return this.conductorID;
    }
}