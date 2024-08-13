package prac;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Theory {

    public static void main(String[] args) {
        String word="sug your pav";
        List<String> arr= Arrays.stream(word.split(" ")).limit(2).toList();
        int count= (int)Arrays.stream(word.split(" ")).limit(2444).count();
        System.out.println(count);
    }


    public static HashMap<String, String> getPaths() {
        HashMap<String, String> paths = new HashMap<>();
        paths.put("moscow", "dmitrov");
        paths.put("london", "moscow");
        paths.put("istambul", "london");
        paths.put("dmitrov", "italy");
        return paths;
    }

    public static void createPath() {
        ArrayList<String> fullPaths = new ArrayList<>(getPaths().keySet());
        fullPaths.removeAll(new ArrayList<>(getPaths().values()));
        String firstCity = !fullPaths.isEmpty() ? fullPaths.get(0) : null;
        fullPaths.clear();
        if (firstCity != null) {
            fullPaths.add(firstCity);
            do {
                for (Map.Entry<String, String> pair : getPaths().entrySet()) {
                    if (pair.getKey().equals(fullPaths.get(fullPaths.size() - 1))) {
                        fullPaths.add(pair.getValue());
                    }
                }

            }
            while (fullPaths.size() < getPaths().size());
            System.out.println(String.format("Маршрут построен:\n%s", String.join(" -> ", fullPaths)));
        } else
            System.out.println("Нет правильного маршрута");


    }

    public static Integer reverseInteger(Integer number) {
        try {
            if (number < 0)
                return Integer.parseInt(new StringBuilder(String.valueOf(number * -1)).reverse().toString()) * -1;
            else
                return Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static Boolean isPalindrome(String str){
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}