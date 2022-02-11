package main.com.hw_3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppLauncher {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        Item item1 = new Item(1, "one");
        Item item2 = new Item(2, "two");
        Item item3 = new Item(3, "three");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        AppLauncher.swapTwoElementsInArray(items, item1, item3);

    }

    public static <A> void swapTwoElementsInArray(List<A> array, A item1, A item2) {
        if (array.contains(item1) && array.contains(item2)) {
            int firstItemIndex = array.indexOf(item1);
            int secondItemIndex = array.indexOf(item2);

            array.set(firstItemIndex, item2);
            array.set(secondItemIndex, item1);

            System.out.println(Arrays.toString(new List[]{array}));
        }
    }

}
