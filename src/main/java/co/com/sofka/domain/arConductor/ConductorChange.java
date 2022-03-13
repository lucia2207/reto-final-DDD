package co.com.sofka.domain.arConductor;

import co.com.sofka.domain.arConductor.command.CuentaConductorDesvinculada;
import co.com.sofka.domain.arConductor.command.DesvincularCuenta;
import co.com.sofka.domain.arConductor.events.ConductorCreado;
import co.com.sofka.domain.arConductor.events.EmailConductorModificado;
import co.com.sofka.domain.arConductor.events.NombreConductorModificado;
import co.com.sofka.domain.generic.EventChange;

public class ConductorChange extends EventChange {
    public ConductorChange(Conductor conductor) {
        apply((ConductorCreado event) -> {
            conductor.nombre = event.getNombre();
            conductor.edad = event.getEdad();
            conductor.email = event.getEmail();
        });

        apply((NombreConductorModificado event) -> {
            conductor.nombre = event.getNombreConductor();
        });

        apply((EmailConductorModificado event) -> {
            conductor.email = event.getEmailConductor();
        });

        apply((DesvincularCuenta event) -> {
            conductor.cuentas.add(new co.com.sofka.domain.arConductor.Cuenta(event.getCuentaId(), event.getNombreUsuario()));
        });

        apply((CuentaConductorDesvinculada event) -> {
            Cuenta cuenta = conductor.getCuentaPorId(event.getCuentaID()).orElseThrow(() -> new IllegalArgumentException("No existe la cuenta del cliente"));
        });
    }
}