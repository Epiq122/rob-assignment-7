import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayListTest {

    private CustomList<Integer> sut;


    @BeforeEach
    public void before_each() {
        sut = new CustomArrayList<>();
        for (int i = 0; i < 25; i++) {
            sut.add(i);
        }
    }

    @Test
    public void should_add_item_to_start_of_list() {
        sut.add(0, 316);

        Integer item1 = sut.get(0);
        Integer item2 = sut.get(2);

        assertEquals(316, item1);
        assertEquals(2, item2);
    }

    @Test
    public void should_return_at_at_start_of_list() {
        Integer listItem = sut.get(0);
        assertEquals(0, listItem, "Item Found");
    }

    @Test
    public void should_add_item_to_end_of_list() {
        sut.add(25, 888);

        Integer listSize = sut.getSize();
        Integer listItem1 = sut.get(25);
        assertEquals(listSize, 26);
        assertEquals(listItem1, 888);

    }

    @Test
    public void should_return_item_at_end_of_list() {
        Integer listItem = sut.get(24);
        assertEquals(24, listItem, "Item Found");
    }

    @Test
    public void should_add_item_to_middle_of_list() {
        sut.add(13, 111);

        Integer listItem1 = sut.get(13);
        Integer listSize = sut.getSize();
        assertEquals(listSize, 26);
        assertEquals(listItem1, 111);
    }

    @Test
    public void should_return_item_at_index() {
        Integer listItem = sut.get(8);
        assertEquals(8, listItem);
    }
}
