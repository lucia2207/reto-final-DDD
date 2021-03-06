package co.com.sofka.domain.arPasajero.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.arPasajero.Pasajero;
import co.com.sofka.domain.arPasajero.command.VincularCuenta;

public class VincularCuentaUseCase extends UseCase<RequestCommand<VincularCuenta>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<VincularCuenta> input){
        VincularCuenta command = input.getCommand();

        Pasajero pasajero = Pasajero.from(command.getPasajeroID(), retrieveEvents());
        pasajero.vincularCuenta(command.getCuentaID(), command.getNombreUsuario());

        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));
    }
}