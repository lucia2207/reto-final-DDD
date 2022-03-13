package co.com.sofka.domain.arConductor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arConductor.values.CuentaID;

public class CuentaConductorDesvinculada extends DomainEvent {

    private final CuentaID cuentaID;

    public CuentaConductorDesvinculada(CuentaID cuentaID) {
        super("sofka.pasajero.cuentadesvinculada");
        this.cuentaID = cuentaID;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }
}