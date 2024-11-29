package software.ulpgc.io.pojos;

public record DogGetResponse(Weight weight, Height height, String name, String breed_group) {
    public record Weight(String imperial, String metric) {
    }
    public record Height(String imperial, String metric) {
    }
}
