package com.test2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Cloud {
    public static void main(String[] args) throws IOException {
        Path path2 = Paths.get("C:\\Users\\Ennix\\Desktop\\data-data.csv");
        List<String> strings = Files.readAllLines(path2);
        System.out.print(strings);
        System.out.println("I have changed my commit");
        System.out.println("--------------------");
        
        //strings.stream().map(s -> s.contains("адмиралтейский,пер.антоненко (от казанской ул. до наб.реки мойки)")).sorted().forEach(System.out::println);

    }
}

