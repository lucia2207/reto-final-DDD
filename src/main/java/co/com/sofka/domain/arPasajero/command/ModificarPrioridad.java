package co.com.sofka.domain.arPasajero.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.arPasajero.values.PasajeroID;
import co.com.sofka.domain.arPasajero.values.Prioridad;

public class ModificarPrioridad extends Command {
    private final PasajeroID pasajeroID;
    private final Prioridad prioridad;

    public ModificarPrioridad(PasajeroID pasajeroID, Prioridad prioridad){
        this.pasajeroID = pasajeroID;
        this.prioridad = prioridad;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }
}