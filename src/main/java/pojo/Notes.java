package pojo;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class Notes {


    private String userName;
    private String password;

    public Notes() {
        Faker faker = new Faker();
        userName = faker.name().firstName();
        password = String.valueOf(faker.number().randomNumber(11, true));
        //commit faker


    }


}
