package d_assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ZooTest {
    @Test
    public void zooTest() {
        Zoo zoo = new Zoo();
        Animal cat = new Animal("Stefan");
        assertThat(zoo.generateFunnyName(cat))
                .isNotEqualTo(cat.getName());
    }
}
