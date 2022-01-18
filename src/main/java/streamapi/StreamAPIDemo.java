package streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.*;

public class StreamAPIDemo {

//    private static double val1 = 2.0, val2 = 2.0;

    public static void main(String[] args) {

        /**
         Operation operation = new Operation() {
        @Override public double getResult(double val1, double val2) {
        return val1 + val2;
        }
        };

         System.out.println(operation.getResult(2.0, 3.0));

         Operation lambda = (val1, val2) -> val1 + val2;
         System.out.println(lambda.getResult(2.0, 2.0));

         Printer printer = str -> System.out.println(str);
         printer.print("Hello");

         Factorial factorial = value -> {
         int result = 1;
         for (int i = 1; i <= value; ++i) {
         result *= i;
         }
         return result;
         };

         System.out.println(factorial.getResult(5));

         OperationTwo operationTwo = () -> {
         val2 = 100;
         return val1 + val2;
         };
         System.out.println(operationTwo.getResult());
         System.out.println(val1);
         System.out.println(val2);
         */

        /**
         List<String> list = new ArrayList<>();
         Collections.addAll(list, "Tom", "jeff", "Edward");
         list.stream().filter(name -> name.length() >= 4).forEach(System.out::println);
         */

        /**
         Stream<String> passwords = Stream.of("3sa215", "4mxj2o", "9okfgy6");
         passwords.filter(password -> password.length() == 7).forEach(System.out::println);

         Stream<String> stream = Stream.of("Value 1", "Value 2", "Value 3", "Value 4", "Value 5");
         stream.skip(2).forEach(System.out::println);
         stream.limit(2).forEach(System.out::println);
         */

        /**
         Stream<Film> stream = Stream.of(new Film("Deadpool 2", 100.0), new Film("Avengers: Infinity War", 75.0));
         stream.map(Film::getTitle).forEach(System.out::println);
         */

        /**
         Stream<Pizza> stream = Stream.of(new Pizza("Pepperoni", 90));
         stream.flatMap(pizza -> Stream.of(
         String.format("Pizza: %s. price: $%d", pizza.getTitle(), pizza.getPrice()),
         String.format("(HAPPY HOURS DISCOUNT -50%%)%nPizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice() / 2)
         )).forEach(System.out::println);
         */

        /**
         List<Ticket> tickets = new ArrayList<>();
         tickets.add(new Ticket("A", 100));
         tickets.add(new Ticket("B", 75));

         Ticket minTicketPrice = tickets.stream().min(Ticket::compare).get();
         System.out.printf("Minimum price of ticket class: %s, $%d%n", minTicketPrice.getTicketClass(), minTicketPrice.getPrice());

         Ticket maxTicketPrice = tickets.stream().max(Ticket::compare).get();
         System.out.printf("Maximum price of ticket class: %s, $%d%n", maxTicketPrice.getTicketClass(), maxTicketPrice.getPrice());

         Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
         int result = numbers.reduce(0, (val1, val2) -> val1 + val2);
         System.out.println(result);

         int result2 = numbers.reduce(0, (val1, val2) -> {
         if (val2 < 5) {
         return val1 + val2;
         } else {
         return val1;
         }
         }, (val1, val2) -> val1 + val2);

         System.out.println(result2);
         */

        /**
         Stream<Integer> stream = Stream.of();
         Optional<Integer> result = stream.min(Integer::compare);
         System.out.println(result.orElseGet(() -> new Random().nextInt(100)));
         */

        /**
         Stream<String> values = Stream.of("Value 1", "Value 2", "Value 3", "Value 4", "Value 5");
         values.collect(Collectors.toList()).forEach(System.out::println);
         values.collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

         Stream<Order> orders = Stream.of(new Order(0, "Context 1"), new Order(1, "Context 2"));
         orders.collect(Collectors.toMap(Order::getId, Order::getContext))
         .forEach((key, value) -> System.out.printf("Key: %d, value: %s%n", key, value));

         Stream<String> values = Stream.of("Value 1", "Value 2", "Value 3", "Value 4", "Value 5");
         values.collect(ArrayList::new, ArrayList::add, ArrayList::addAll).forEach(System.out::println);
         */

        /**
         Stream<Computer> stream = Stream.of(new Computer("Desktop", "Apple", "IMac", 2299),
         new Computer("Laptop", "ASUS", "ASUS ROG", 3122),
         new Computer("Laptop", "Google", "GooglePixelBook", 799),
         new Computer("Desktop", "Dell", "Insperon", 549),
         new Computer("Laptop", "ASUS", "ASUS ZenBook Pro", 1699),
         new Computer("Laptop", "Apple", "MacBook", 1299));

         Map<Boolean, List<Computer>> computers = stream.collect(Collectors.partitioningBy(c -> c.getPrice() > 1000));

         for (Map.Entry<Boolean, List<Computer>> item : computers.entrySet()) {
         if (item.getKey()) {
         showProducts("more", item);
         } else {
         showProducts("less", item);
         }
         }
         Map<String, List<Computer>> computers = stream.collect(Collectors.groupingBy(Computer::getType));

         for (Map.Entry<String, List<Computer>> item : computers.entrySet()) {
         System.out.println("Type: " + item.getKey());

         for (Computer c : item.getValue()) {
         System.out.printf("Company: %s, Model: %s, Price: %d %n", c.getCompany(), c.getModel(), c.getPrice());
         }

         System.out.println();
         }

         Map<String, Long> computers = stream.collect(Collectors.groupingBy(Computer::getCompany, Collectors.counting()));

         for (Map.Entry<String, Long> item : computers.entrySet()) {
         System.out.printf("Total value of computers in %s: %d %n", item.getKey(), item.getValue());
         }

         Map<String, Integer> computers = stream.collect(Collectors.groupingBy(Computer::getType,
         Collectors.summingInt(Computer::getPrice)));

         for (Map.Entry<String, Integer> item : computers.entrySet()) {
         System.out.printf("%s total cost: %d %n", item.getKey(), item.getValue());
         }

         Map<String, Optional<Computer>> computers = stream.collect(Collectors.groupingBy(Computer::getType,
         Collectors.minBy(Comparator.comparing(Computer::getPrice))));

         for (Map.Entry<String, Optional<Computer>> item : computers.entrySet()) {
         System.out.printf("Minimum price of %s on the model: %s %n", item.getKey(), item.getValue().get().getModel());
         }

         Map<String, List<String>> computers = stream.collect(Collectors.groupingBy(Computer::getType,
         Collectors.mapping(Computer::getCompany, Collectors.toList())));


         for (Map.Entry<String, List<String>> item : computers.entrySet()) {
         System.out.println(item.getKey());

         for (String model : item.getValue()) {
         System.out.println(model);
         }

         System.out.println();
         }

         */

        /**
         String word = Stream.of("Oleg", "Oleg", "Anton", "Oleg", "Bob", "Bob", "Oleg", "Dima", "Maga")
         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
         .entrySet().stream()
         .max(Map.Entry.comparingByKey())
         .map(Map.Entry::getKey)
         .orElse(null);

         System.out.printf("Most popular word in array: %s%n", word);
         */

        /**
        Person[] persons = {new Person("Bob", 35, 4500),
                new Person("Anton", 36, 8000),
                new Person("Dima", 32, 1500),
                new Person("Aleksey", 45, 6500)};

        Arrays.stream(persons).mapToInt(Person::getSalary).average();
        int limit = 2;
        Arrays.stream(persons)
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
                .limit(limit).map(Person::getName)
                .forEach(System.out::println);
         */
    }

    /**
     private static void showProducts(String status, Map.Entry<Boolean, List<Computer>> item) {
     System.out.printf("Price is %s than $1000: %n", status);

     for (Computer c : item.getValue()) {
     System.out.printf("Type: %s, Company: %s, Model: %s %n", c.getType(), c.getCompany(), c.getModel());
     }

     System.out.println();

     }
     */


}
