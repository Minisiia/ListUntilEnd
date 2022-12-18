package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUntilEnd {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Enter a line:");
            String line = scanner.nextLine();
            if (line.equals("end")) break;
            else list.add(line);
        }
        System.out.println("List:");
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
