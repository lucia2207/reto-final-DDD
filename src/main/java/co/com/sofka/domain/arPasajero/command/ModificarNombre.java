package co.com.sofka.domain.arPasajero.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.arPasajero.values.NombrePasajero;
import co.com.sofka.domain.arPasajero.values.PasajeroID;

public class ModificarNombre extends Command {
    private final PasajeroID pasajeroID;
    private final NombrePasajero nombre;

    public ModificarNombre(PasajeroID pasajeroID, NombrePasajero nombre){
        this.nombre = nombre;
        this.pasajeroID = pasajeroID;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }

    public NombrePasajero getNombre() {
        return nombre;
    }
}