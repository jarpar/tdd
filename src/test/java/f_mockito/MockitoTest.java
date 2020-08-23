package f_mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockitoTest {

    @Test
    public void test() {
        List mockedList = Mockito.mock(List.class);

        mockedList.add("one");

        Mockito.verify(mockedList);
    }
}
