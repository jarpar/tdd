package f_powermock;

import org.assertj.core.api.Assertions;
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
        UserValidator mockedUserValidator = Mockito.mock(UserValidator.class);
        PowerMockito.whenNew(UserValidator.class)
                .withNoArguments()
                .thenReturn(mockedUserValidator);

        UserValidator userValidator = new UserValidator();
        Assertions.assertThat(userValidator).isEqualTo(mockedUserValidator);
    }

    @Test
    public void test2() {
        UserValidator mockedUserValidator = PowerMockito.mock(UserValidator.class);
        PowerMockito.when(mockedUserValidator.validateFinal()).thenReturn(false);
        boolean valid = mockedUserValidator.validateFinal();

        Assertions.assertThat(valid).isFalse();
    }

    @Test
    public void test3() {
        PowerMockito.mockStatic(UserValidator.class);
        PowerMockito.when(UserValidator.validateStatic()).thenReturn(false);
        boolean valid = UserValidator.validateStatic();
        Assertions.assertThat(valid).isFalse();
    }
}
