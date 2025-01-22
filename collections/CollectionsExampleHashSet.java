package collections;

import java.util.HashSet;

public class CollectionsExampleHashSet {
    public static void main(String[] args) {
        HashSet <String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("Chicago");
        cities.add("Seattle");
        cities.add("Washington");

        System.out.println(cities.size());
        System.out.println(cities.contains("Chicago"));
        System.out.print(cities);

        for (String city: cities){
            System.out.println(city);
        }
    }
}
