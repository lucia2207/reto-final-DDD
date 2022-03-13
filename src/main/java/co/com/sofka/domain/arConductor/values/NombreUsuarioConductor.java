package co.com.sofka.domain.arConductor.values;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreUsuarioConductor implements ValueObject<String> {
    private final String value;

    public NombreUsuarioConductor(String value) {
        this.value = Objects.requireNonNull(value).trim();

        if (this.value.length() < 3) {
            throw new IllegalArgumentException("El nombre de usuario debe tener al menos 3 caracteres");
        }

        if (this.value.length() > 30) {
            throw new IllegalArgumentException("El nombre de usuario debe tener menos de 30 caracteres");
        }
    }

    @Override
    public String value() {
        return  value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof co.com.sofka.domain.arPasajero.values.NombreUsuarioPasajero)) {
            return false;
        }

        co.com.sofka.domain.arConductor.values.NombreUsuarioConductor nombre = (co.com.sofka.domain.arConductor.values.NombreUsuarioConductor) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}