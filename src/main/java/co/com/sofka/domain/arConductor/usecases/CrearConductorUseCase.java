package co.com.sofka.domain.arConductor.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.arConductor.Conductor;
import co.com.sofka.domain.arConductor.command.CrearConductor;

public class CrearConductorUseCase extends UseCase<RequestCommand<CrearConductor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearConductor> input) {
        CrearConductor command = input.getCommand();

        Conductor conductor = new Conductor(
                command.getConductorID(),
                command.getNombre(),
                command.getEdad(),
                command.getEmail()
        );

        emit().onResponse(new ResponseEvents(conductor.getUncommittedChanges()));
    }
}