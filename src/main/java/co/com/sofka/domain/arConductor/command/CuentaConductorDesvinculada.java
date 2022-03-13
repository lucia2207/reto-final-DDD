package co.com.sofka.domain.arConductor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.arConductor.values.CuentaID;
import co.com.sofka.domain.arConductor.values.ConductorID;

public class CuentaConductorDesvinculada extends Command {
    private final ConductorID conductorID;
    private final CuentaID cuentaID;

    public CuentaConductorDesvinculada(ConductorID conductorID, CuentaID cuentaID){
        this.conductorID = conductorID;
        this.cuentaID = cuentaID;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }

    public ConductorID getConductorID() {
        return conductorID;
    }
}