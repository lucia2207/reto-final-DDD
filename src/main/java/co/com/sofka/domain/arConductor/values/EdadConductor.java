package co.com.sofka.domain.arConductor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EdadConductor implements ValueObject<Integer> {
    private final Integer value;

    public EdadConductor(Integer value) {
        this.value = Objects.requireNonNull(value);

        if (this.value > 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
    }

    @Override
    public Integer value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof co.com.sofka.domain.arConductor.values.EdadConductor)) {
            return false;
        }

        co.com.sofka.domain.arConductor.values.EdadConductor edad = (co.com.sofka.domain.arConductor.values.EdadConductor) o;
        return Objects.equals(this.value, edad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}