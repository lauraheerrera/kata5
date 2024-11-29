package software.ulpgc.model;

import software.ulpgc.io.pojos.DogGetResponse;

import java.util.Objects;

public record Dog(String name, DogGetResponse.Weight weight, DogGetResponse.Height height) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(weight, dog.weight) && Objects.equals(height, dog.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, height);
    }

    public String dogCharacteristics() {
        return this.name + ": \n\tWeight between " + this.weight.metric() + " KG \n\tHeight between " +
                this.height.metric() + " cm";
    }
}
