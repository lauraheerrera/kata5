package software.ulpgc;

import software.ulpgc.io.DogLoader;
import software.ulpgc.io.RandomDogAdapter;
import software.ulpgc.io.RandomDogDeserializer;
import software.ulpgc.io.RandomDogReader;
import software.ulpgc.model.Dog;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        DogLoader loader = new DogLoader(
                new RandomDogReader(),
                new RandomDogDeserializer(),
                new RandomDogAdapter()
        );

        HashSet<Dog> dogs = new HashSet<>();

        while (dogs.size()<10){
            Dog dog = loader.get();

            if(dogs.add(dog)) System.out.println(dog.dogCharacteristics());
        }
    }
}
