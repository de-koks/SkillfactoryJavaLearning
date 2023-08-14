package Module28Collections.LibraryHashMap;

import com.github.javafaker.Faker;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker(Locale.of("ru-RU"));

        Map<String, List<String>> library = new HashMap<>();

        library.put("Александр Пушкин", Arrays.asList("Evgeniy Onegin", "Ruslan and Liudmila", "Crime and Punishment"));

        for (int i = 0; i < 5; i++){
            String author = faker.book().author();
            List<String> books = new ArrayList<>();

            for (int j = 0; j < 3; j++){
                books.add(faker.book().title());
            }
            library.put(author, books);
        }

        for (Map.Entry<String, List<String>> entry: library.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        List<String> books = new ArrayList<>(List.copyOf(library.get("Александр Пушкин")));
        books.remove("Crime and Punishment");
        library.put("Александр Пушкин", books);

        library.put("Федор Достоевский", Arrays.asList("Crime and Punishment", "Idiot"));

        System.out.println("==== Fix the author of \"Crime and Punishment\" ====");

        for (Map.Entry<String, List<String>> entry: library.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
