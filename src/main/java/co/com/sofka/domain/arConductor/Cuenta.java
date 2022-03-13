package co.com.sofka.domain.arConductor;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.arConductor.values.CuentaID;
import co.com.sofka.domain.arConductor.values.NombreUsuarioConductor;

public class Cuenta extends Entity<CuentaID> {
    protected NombreUsuarioConductor nombreUsuario;

    public Cuenta(CuentaID cuentaID, NombreUsuarioConductor nombre){
        super(cuentaID);
        this.nombreUsuario = nombre;
    }

    public void modificarNombreUsuario (NombreUsuarioConductor nombre) {
        this.nombreUsuario = nombre;
    }

    public NombreUsuarioConductor getNombreUsuario() {
        return nombreUsuario;
    }
}