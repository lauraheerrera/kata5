package software.ulpgc.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Random;

public class RandomDogReader implements DogReader{
    @Override
    public String read() {
        Random random = new Random();

        while (true){
            int id = random.nextInt(265) + 1;

            String url = "https://api.thedogapi.com/v1/breeds/" + id;

            try {
                Connection.Response response = Jsoup.connect(url)
                        .method(Connection.Method.GET)
                        .ignoreContentType(true)
                        .execute();

                if(response.statusCode() == 200) return response.body();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
