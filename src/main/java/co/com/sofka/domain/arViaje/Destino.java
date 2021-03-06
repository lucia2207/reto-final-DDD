package co.com.sofka.domain.arViaje;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.arViaje.value.DestinoID;
import co.com.sofka.domain.arViaje.value.DireccionDestino;

public class Destino extends Entity<DestinoID> {
    protected DireccionDestino direccion;

    public Destino(DestinoID destinoID, DireccionDestino direccion) {
        super(destinoID);
        this.direccion = direccion;
    }

    public void modificarDireccion (DireccionDestino nueva){
        this.direccion = nueva;
    }

    public DireccionDestino getDireccion() {
        return direccion;
    }
}