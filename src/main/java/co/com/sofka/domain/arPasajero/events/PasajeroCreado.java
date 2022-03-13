package co.com.sofka.domain.arPasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arPasajero.values.EdadPasajero;
import co.com.sofka.domain.arPasajero.values.EmailPasajero;
import co.com.sofka.domain.arPasajero.values.NombrePasajero;

public class PasajeroCreado extends DomainEvent {
    private final NombrePasajero nombre;
    private final EdadPasajero edad;
    private final EmailPasajero email;

    public PasajeroCreado (NombrePasajero nombre, EdadPasajero edad, EmailPasajero email) {
        super("sofka.pasajero.creado");
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public NombrePasajero getNombre() {
        return nombre;
    }

    public EdadPasajero getEdad() {
        return edad;
    }

    public EmailPasajero getEmail() {
        return email;
    }
}