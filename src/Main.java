import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Arrays Arrays = null;
        
        List<String> stationeryList = Arrays.asList("карандаш", "ручка", "клей", "ножницы", "краски");
        stationeryList.stream()
                .filter(s -> s.startsWith("к"))
                .forEach(System.out::println);

        List<String> bookList = Arrays.asList("Оно", "Мстители", "Как начать бизнес", "Алфавит", "Сказки");
        List<String> sortedBookList = bookList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedBookList);

//        List<Email> emailList = Arrays.asList(
//                new Email("example1@gmail.com", "SEND"),
//                new Email("example2@gmail.com", "NEW"),
//                new Email("example3@gmail.com", "SEND"),
//                new Email("example4@gmail.com", "NEW"),
//                new Email("example5@gmail.com", "NEW"));
//        List<Email> newEmailList = emailList.stream()
//                .filter(e -> e.getSendStatus().equals("NEW"))
//                .collect(Collectors.toList());
//        System.out.println(newEmailList);
        List<String> bookListWithDuplicates = Arrays.asList("The Great Gatsby", "To Kill a Mockingbird", "Pride and Prejudice", "1984", "The Catcher in the Rye", "To Kill a Mockingbird", "The Great Gatsby");
        List<String> uniqueBookList = bookListWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueBookList);

        List<String> employeeList = Arrays.asList("Айбек", "Алтынбек", "Бакыт", "Данияр", "Жанар");
        boolean containsBakyt = employeeList.stream()
                .anyMatch(s -> s.equals("Бакыт"));
        System.out.println(containsBakyt);

        List<String> stringList = Arrays.asList("first", "second", "third", "fourth");
        String concatenatedString = stringList.stream()
                .collect(Collectors.joining(";"));
        System.out.println(concatenatedString);
        List<Integer> numbers = Arrays.asList(50, 150, 200, 75, 300, 25);

        numbers.stream()
                .filter(num -> num > 100)
                .forEach(System.out::println);


        List<Double> numbers2 = Arrays.asList(2.5, 3.0, 4.5, 1.0, 2.0, 3.5);

        double average = numbers2.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average: " + average);
    }


}