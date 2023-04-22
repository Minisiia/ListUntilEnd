package list;

import java.util.*;
import java.util.stream.Stream;

public class Handler {

    public static List<String> fillList() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter a lines using enter or end to exit:");
        Stream.generate(scanner::nextLine)
                .takeWhile(line -> !line.equals("end"))
                .forEach(list::add);
        return list;
    }

    public static void printList(List<String> list) {
        System.out.println("List:");
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
