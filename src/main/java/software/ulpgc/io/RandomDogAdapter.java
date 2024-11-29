package software.ulpgc.io;

import software.ulpgc.io.pojos.DogGetResponse;
import software.ulpgc.model.Dog;

public class RandomDogAdapter implements DogAdapter{
    @Override
    public Dog adapt(Object o) {
        return adapt((DogGetResponse) o);
    }

    private Dog adapt(DogGetResponse dogGetResponse){
        return new Dog(dogGetResponse.name(), dogGetResponse.weight(), dogGetResponse.height());
    }
}
