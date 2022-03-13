package co.com.sofka.domain.arPasajero;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.arPasajero.values.CuentaID;
import co.com.sofka.domain.arPasajero.values.NombreUsuarioPasajero;

public class Cuenta extends Entity<CuentaID> {
    protected NombreUsuarioPasajero nombreUsuario;

    public Cuenta(CuentaID cuentaID, NombreUsuarioPasajero nombre){
        super(cuentaID);
        this.nombreUsuario = nombre;
    }

    public void modificarNombreUsuario (NombreUsuarioPasajero nombre) {
        this.nombreUsuario = nombre;
    }

    public NombreUsuarioPasajero getNombreUsuario() {
        return nombreUsuario;
    }
}