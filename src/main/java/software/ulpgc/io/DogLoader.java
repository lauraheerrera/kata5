package software.ulpgc.io;

import software.ulpgc.model.Dog;

public class DogLoader {
    private final DogReader reader;
    private final DogDeserializer deserializer;
    private final DogAdapter dogAdapter;

    public DogLoader(DogReader reader, DogDeserializer deserializer, DogAdapter dogAdapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.dogAdapter = dogAdapter;
    }

    public Dog get() {
        return dogAdapter.adapt(deserializer.deserialize(reader.read()));
    }
}
