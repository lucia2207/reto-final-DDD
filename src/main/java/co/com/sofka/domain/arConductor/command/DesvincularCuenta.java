package co.com.sofka.domain.arConductor.command;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arConductor.values.CuentaID;
import co.com.sofka.domain.arConductor.values.NombreUsuarioConductor;

public class DesvincularCuenta extends DomainEvent {
    private final CuentaID cuentaId;
    private final NombreUsuarioConductor nombreusuario;
    public DesvincularCuenta(CuentaID cuentaId, NombreUsuarioConductor nombre) {
        super("sofka.pasajero.vincularcuenta");
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