package streamapi;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
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

        

    }
}
