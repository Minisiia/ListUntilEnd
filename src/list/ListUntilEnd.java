package list;

import java.util.List;

public class ListUntilEnd {
    public static void main(String[] args) {
        Handler handler = new Handler();
        List<String> list = handler.fillList();
        Handler.printList(list);
    }
}
