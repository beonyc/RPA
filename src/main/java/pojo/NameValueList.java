package pojo;

import com.github.javafaker.Faker;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class NameValueList {
    private String id;
    private List<Notes> notes;

    public NameValueList() {
        Faker faker = new Faker();

        id = faker.number().digit();
        notes = new ArrayList<>(Arrays.asList(new Notes()));

    }
}
