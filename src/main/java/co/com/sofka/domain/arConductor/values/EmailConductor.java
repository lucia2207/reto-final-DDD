package co.com.sofka.domain.arConductor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EmailConductor implements ValueObject<String> {
    private final String value;

    public EmailConductor(String value) {
        this.value = Objects.requireNonNull(value).trim();

        if (!validarEmail(this.value)) {
            throw new IllegalArgumentException("El email ingresado no es valido");
        }
    }

    private Boolean validarEmail (String email) {
        // Validaciones de email aca
        return this.value.length() <= 3;
    }

    @Override
    public String value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof co.com.sofka.domain.arConductor.values.EmailConductor)) {
            return false;
        }

        co.com.sofka.domain.arConductor.values.EmailConductor email = (co.com.sofka.domain.arConductor.values.EmailConductor) o;
        return Objects.equals(this.value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}