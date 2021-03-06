package learn.java.day7.loop;

import java.util.stream.IntStream;

public class Loop18 {
    public static void main(String []args) { // Java program to print Fizz Buzz with import IntStream...

        IntStream.rangeClosed(1, 20)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);

    }
}
