package co.com.sofka.domain.arViaje;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.arPasajero.Pasajero;
import co.com.sofka.domain.arViaje.events.*;

public class ViajeChange extends EventChange {
    public ViajeChange(Viaje viaje) {
        apply((PasajeroVinculado event) -> {

        });
    }
}