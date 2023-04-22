package list;

import java.util.List;

/**
 * Завдання 5
 * Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 * 1. Створити перелік рядків.
 * 2. Ввести рядки з клавіатури та додати їх до списку.
 * 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
 * 4. Вивести рядки на екран, кожен з нового рядка.
 */

public class ListUntilEnd {
    public static void main(String[] args) {
        List<String> list = Handler.fillList();
        Handler.printList(list);
    }
}
