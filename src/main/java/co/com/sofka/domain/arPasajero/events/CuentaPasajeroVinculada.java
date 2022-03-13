package co.com.sofka.domain.arPasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arPasajero.values.CuentaID;
import co.com.sofka.domain.arPasajero.values.NombreUsuarioPasajero;

public class CuentaPasajeroVinculada extends DomainEvent {
    private final CuentaID cuentaId;
    private final NombreUsuarioPasajero nombreusuario;
    public CuentaPasajeroVinculada (CuentaID cuentaId, NombreUsuarioPasajero nombre) {
        super("sofka.pasajero.vincularcuenta");
        this.cuentaId = cuentaId;
        this.nombreusuario = nombre;
    }

    public CuentaID getCuentaId() {
        return cuentaId;
    }

    public NombreUsuarioPasajero getNombreUsuario() {
        return nombreusuario;
    }
}