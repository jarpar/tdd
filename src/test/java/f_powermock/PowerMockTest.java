package f_powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserValidator.class)
public class PowerMockTest {
    @Test
    public void test() throws Exception {
        UserValidator userValidator = Mockito.mock(UserValidator.class);
        PowerMockito.whenNew(UserValidator.class)
                .withNoArguments()
                .thenReturn(userValidator);
    }
}
