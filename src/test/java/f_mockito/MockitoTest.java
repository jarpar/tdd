package f_mockito;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyInt;

public class MockitoTest {

    @Test
    public void test1() {
        List mockedList = Mockito.mock(List.class);

        mockedList.add("one");

        Mockito.verify(mockedList).add("one");
    }

    @Test
    public void test2() {
        List mockedList = Mockito.mock(List.class);
        Mockito.when(mockedList.size())
                .thenReturn(100)
                .thenReturn(500)
                .thenReturn(1000);
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println();
    }

    @Test
    public void test3() {
        List mockedList = Mockito.mock(List.class);
        Mockito.when(mockedList.get(anyInt()))
                .thenReturn("first");
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(200));
    }

    /*@Test
    public void test4() {
        List mockedList = Mockito.mock(List.class);
        Mockito.when(mockedList.get(666))
                .thenReturn("el diablo");
        try {
            mockedList.get(666);
            fail("expected exception to be thrown");
        } catch (Exception e) {
            Assertions.assertThat(e.getMessage())
                    .isEqualTo("el diablo");
        }
    }*/
}
