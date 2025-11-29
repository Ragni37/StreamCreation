package Day_01_Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

record Product(Integer id, String name, Double price){}

public class StreamCreation {
    public static void main(String[] args) {
        //Create a stream for fast Processing Data
        System.out.println(" 1) By using stream() and parallelStream().");
        System.out.println("--------------------------------------");


        List<String> list = Arrays.asList("NIT", "Java", "Stream", "Collection");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        System.out.println("--------------------------------------");

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(System.out::println);

        System.out.println("--------------------------------------");

        //By using stream() method of Arrays Class

        System.out.println("2) by using stream() method of Arrays class.");

        System.out.println("--------------------------------------");

        int [] x = {12, 90, 89, 91, 12, 56, 45};
        IntStream intStream = Arrays.stream(x);
        intStream.forEach(System.out::println);

        System.out.println("--------------------------------------");

        long [] y = {1L, 2L, 6L, 9L};
        LongStream longStream = Arrays.stream(y);
        longStream.forEach(System.out::println);

        System.out.println("--------------------------------------");

        double [] z = {1D, 2D, 3D, 4D};
        DoubleStream doubleStream = Arrays.stream(z);
        doubleStream.forEach(System.out::println);

        System.out.println("--------------------------------------");

        String [] stringStream = {"Ram", "Shyam", "Kanha"};
        Stream<String> stream1 = Arrays.stream(stringStream);
        stream1.forEach(System.out::println);

        System.out.println("--------------------------------------");

        //By using of() static method of stream Interface
        System.out.println(" 3) by using of() method of stream interface.");
        System.out.println("----------------------------------------");

        Product p1 = new Product(333, "Mobile", 12789D);
        Product p2 = new Product(222, "Camera", 54789D);
        Product p3 = new Product(111, "Laptop", 43789D);
        Product p4 = new Product(111, "Laptop", 43789D);

        Stream.of(p1, p2, p3, p4).forEach(System.out::println);

        System.out.println("----------------------------------------");

        //By using iterate() and generate() method [infinite Stream]
        System.out.println(" 4) By using iterate() and generate() method [infinite Stream].");

        System.out.println("----------------------------------------");

        Stream<Double> generate = Stream.generate(()-> Math.random()).limit(5);
        generate.forEach(System.out::println);

        System.out.println("----------------------------------------");

        Stream<Integer> iterate = Stream.iterate(101, n-> n+2).limit(5);
        iterate.forEach(System.out::println);
    }
}
