package software.ulpgc.io;

import com.google.gson.Gson;
import software.ulpgc.io.pojos.DogGetResponse;

public class RandomDogDeserializer implements DogDeserializer{
    @Override
    public Object deserialize(String line) {
        return new Gson().fromJson(line, DogGetResponse.class);
    }
}
