package streamapi;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamAPIDemo {

    private static double val1 = 2.0, val2 = 2.0;

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


        

    }
}
