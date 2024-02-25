package objectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class mapper {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String s1="abc";
        String s2="abcd";
        Car car = new Car("black", "BMW","2023");
        objectMapper.writeValue(new File("resources/car.json"), car);
        String jsonValues = objectMapper.writeValueAsString(car);
        System.out.println(jsonValues);
        System.out.println("Objects.equals(s1,s2) = " + Objects.equals(s1,s2));
        generateHash();


    }
    public static void generateHash() {
        int x = 90;
        String y = "Ayush";
        System.out.println("Objects.hash(x, y) = " + Objects.hash(x,y));
    }
}
