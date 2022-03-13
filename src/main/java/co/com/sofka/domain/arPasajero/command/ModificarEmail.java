package co.com.sofka.domain.arPasajero.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.arPasajero.values.EmailPasajero;
import co.com.sofka.domain.arPasajero.values.PasajeroID;

public class ModificarEmail extends Command {
    private final PasajeroID pasajeroID;
    private final EmailPasajero email;

    public ModificarEmail(PasajeroID pasajeroID, EmailPasajero email){
        this.pasajeroID = pasajeroID;
        this.email = email;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }

    public EmailPasajero getEmail() {
        return email;
    }
}