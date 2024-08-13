package pojo;

import com.github.javafaker.Faker;
import lombok.Data;
import org.example.Main;

@Data
public class RestData {
    private String session;
    private String module;
    private NameValueList nameValueList;

    public RestData() {
        Faker faker = new Faker();
        session=faker.expression("expression");
        module=faker.letterify("letterify");
        nameValueList=new NameValueList();
    }
}
