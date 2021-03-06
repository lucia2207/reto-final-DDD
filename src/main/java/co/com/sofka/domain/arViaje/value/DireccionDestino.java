package co.com.sofka.domain.arViaje.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DireccionDestino implements ValueObject<String> {
    private final String value;

    public DireccionDestino(String barrio, String calle, Integer numero) {
        Objects.requireNonNull(barrio);
        Objects.requireNonNull(calle);
        Objects.requireNonNull(numero);

        if (barrio.trim().isBlank()) {
            this.value = (calle.trim() + " " + calle.trim()).trim();
        } else {
            this.value = (calle.trim() + " " + calle.trim()).trim() + ", " + barrio.trim();
        }

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }

        if (this.value.length() < 10) {
            throw new IllegalArgumentException("La direccion es muy corta");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DireccionDestino)) {
            return false;
        }
        DireccionDestino direccionOrigen = (DireccionDestino) o;
        return Objects.equals(value, direccionOrigen.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}