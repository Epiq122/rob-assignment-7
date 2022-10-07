import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CustomArrayListTest {

    private CustomList<Integer> sut;


    @BeforeEach
    public void before_each() {
        sut = new CustomArrayList<>();
        for (int i = 0; i < 25; i++) {
            sut.add(i + 1);

        }
    }


    // Message Tests
    @Test
    public void should_throw_exception_when_out_of_bounds() {
        try {
            sut.get(25);
            fail("Should have thrown IndexOutOfBoundsExecption but did not ");
        } catch (IndexOutOfBoundsException e) {
            return;
        }
        fail("Should have thrown IndexOutOfBoundsExecption but did not ");

    }

    @Test
    public void should_throw_exception_when_removing_out_of_bounds() {
        try {
            sut.remove(25);
            fail("Should have thrown IndexOutOfBoundsExecption but did not ");
        } catch (IndexOutOfBoundsException e) {
            return;
        }
        fail("Should have thrown IndexOutOfBoundsExecption but did not ");

    }

    @Test
    public void should_throw_exception_when_adding_out_of_bounds() {
        try {
            sut.add(26, -5);
            fail("Should have thrown IndexOutOfBoundsExecption but did not ");
        } catch (IndexOutOfBoundsException e) {
            return;
        }
        fail("Should have thrown IndexOutOfBoundsExecption but did not ");

    }

    @Test
    public void should_add_item_to_start_of_list() {
        sut.add(0, 99);

        Integer item1 = sut.get(0);
        Integer item2 = sut.get(1);

        assertEquals(99, item1);
        assertEquals(2, item2);
    }

    @Test
    public void should_return_at_at_start_of_list() {
        Integer listItem = sut.get(0);
        assertEquals(1, listItem, "Item Found");
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
        assertEquals(25, listItem, "Item Found");
    }

    @Test
    public void should_add_item_to_middle_of_list() {
        sut.add(13, 111);


        Integer listItem1 = sut.get(13);

        for (int i = 0; i <= sut.getSize(); i++) {
            System.out.println(sut.get(i));
        }


        Integer listSize = sut.getSize();
        assertEquals(listSize, 26);
        assertEquals(listItem1, 111);


    }

    @Test
    public void should_return_item_at_index() {
        Integer listItem = sut.get(8);
        assertEquals(9, listItem);
    }

    @Test
    public void should_return_list_size() {
        Integer listSize = sut.getSize();
        assertEquals(25, listSize);
    }

    @Test
    public void should_remove_at_index() {
        Integer removeItem = sut.remove(5);


        assertEquals(6, removeItem);
        assertEquals(24, sut.getSize());
        assertEquals(1, sut.get(0));
    }

    @Test
    public void should_remove_at_start() {
        Integer removeItem = sut.remove(0);

        assertEquals(1, removeItem);
        assertEquals(24, sut.getSize());


    }


}
