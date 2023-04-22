package list;

import java.util.*;

public class Handler {

    public static List<String> fillList() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String line = null;
        System.out.println("Enter a lines using enter or end to exit:");
        while (true) {
            line = scanner.nextLine();
            if (!line.equals("end")) list.add(line);
            else break;
        }
        return list;
    }

    public static void printList(List<String> list) {
        System.out.println("List:");
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
