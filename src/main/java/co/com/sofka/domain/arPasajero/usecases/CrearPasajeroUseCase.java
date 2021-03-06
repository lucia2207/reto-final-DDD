package co.com.sofka.domain.arPasajero.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.arPasajero.Pasajero;
import co.com.sofka.domain.arPasajero.command.CrearPasajero;

public class CrearPasajeroUseCase extends UseCase<RequestCommand<CrearPasajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPasajero> input) {
        CrearPasajero command = input.getCommand();

        Pasajero pasajero = new Pasajero(
                command.getPasajeroID(),
                command.getNombre(),
                command.getEdad(),
                command.getEmail()
        );

        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));
    }
}