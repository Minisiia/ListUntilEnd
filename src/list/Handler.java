package list;

import java.util.*;

public class Handler {

    private final Scanner scanner;

    public Handler() {
        scanner = new Scanner(System.in);
    }

    public List<String> fillList() {
        List<String> list = new ArrayList<>();
        String line;
        System.out.println("Enter a lines using enter or end to exit:");
        while (true) {
            line = scanner.nextLine();
            if (!line.equals("end")) list.add(line);
            else break;
        }
        return list;
    }

    public static <T> void printList(List<T> list) {
        System.out.println("List:");
        for (T temp : list) {
            System.out.println(temp);
        }
    }
}
