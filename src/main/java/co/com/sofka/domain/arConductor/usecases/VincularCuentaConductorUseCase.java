package co.com.sofka.domain.arConductor.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.arConductor.Conductor;
import co.com.sofka.domain.arConductor.command.VincularCuenta;

public class VincularCuentaConductorUseCase extends UseCase<RequestCommand<VincularCuenta>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<VincularCuenta> input){
        VincularCuenta command = input.getCommand();

        Conductor conductor = Conductor.from(command.getConductorID(), retrieveEvents());
        conductor.vincularCuenta(command.getCuentaID(), command.getNombreUsuario());

        emit().onResponse(new ResponseEvents(conductor.getUncommittedChanges()));
    }
}