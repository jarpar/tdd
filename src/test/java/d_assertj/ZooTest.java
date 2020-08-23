package d_assertj;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ZooTest {
    @Test
    public void newlyCreatedZooIsEmpty() {
        Zoo zoo = new Zoo();
        List<Animal> allAnimals = zoo.getAllAnimals();
        assertThat(allAnimals)
                .isEmpty();
    }

    @Test
    public void zooHasOnlyOneAddedAnimal() {
        Zoo zoo = new Zoo();
        Animal animal = new Animal("cat");
        zoo.addAnimal(animal);
        List<Animal> allAnimals = zoo.getAllAnimals();
        assertThat(allAnimals)
                //.hasSize(1)
                .containsExactly(animal);
    }

    @Test
    public void funnyNameTest() {
        Zoo zoo = new Zoo();
        Animal cat = new Animal("Stefan");
        assertThat(zoo.generateFunnyName(cat))
                .isEqualToIgnoringCase(cat.getName());
    }

    @Test
    public void generateNameWithPrefix() {
        Zoo zoo = new Zoo();
        Animal animal = new Animal("Stefan");
        String nameWithPrefix = zoo.generateNameWithPrefix(animal);
        assertThat(nameWithPrefix)
                .startsWith("Zwierzątko");
    }
}
