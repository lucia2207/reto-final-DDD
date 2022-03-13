package co.com.sofka.domain.arConductor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arConductor.values.CuentaID;
import co.com.sofka.domain.arConductor.values.NombreUsuarioConductor;

public class CuentaConductorVinculada extends DomainEvent {
    private final CuentaID cuentaId;
    private final NombreUsuarioConductor nombreusuario;
    public CuentaConductorVinculada (CuentaID cuentaId, NombreUsuarioConductor nombre) {
        super("sofka.conductor.vincularcuenta");
        this.cuentaId = cuentaId;
        this.nombreusuario = nombre;
    }

    public CuentaID getCuentaId() {
        return cuentaId;
    }

    public NombreUsuarioConductor getNombreUsuario() {
        return nombreusuario;
    }
}