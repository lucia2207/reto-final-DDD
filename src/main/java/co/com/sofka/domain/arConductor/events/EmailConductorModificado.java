package co.com.sofka.domain.arConductor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.arConductor.values.EmailConductor;

public class EmailConductorModificado extends DomainEvent {
    private final EmailConductor email;

    public EmailConductorModificado(EmailConductor emailConductor) {
        super("sofka.conductor.modificaremail");
        this.email = emailConductor;
    }

    public EmailConductor getEmailConductor() {
        return email;
    }
}