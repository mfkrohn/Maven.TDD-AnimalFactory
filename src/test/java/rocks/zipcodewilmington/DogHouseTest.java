package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    DogHouse testDogHouse;
    Dog testDog;
    @Before
    public void setup() {
        this.testDogHouse = new DogHouse();
        this.testDog = new Dog("Boi", new Date(0), 77);
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog() {
        // Given (A testDogHouse)
        Integer startingNumber = testDogHouse.getNumberOfDogs();
        Integer endingNumber = startingNumber + 1;
        // When we add a Dog to the DogHouse
        testDogHouse.add(testDog);
        //Then
        Assert.assertEquals(testDogHouse.getNumberOfDogs(), endingNumber);
    }



    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveDog() {
        // Given (A testDog is added to the testDogHouse)
        testDogHouse.add(testDog);
        Integer startingNumber = testDogHouse.getNumberOfDogs();
        Integer endingNumber = startingNumber - 1;
        // When we add a Dog to the DogHouse
        testDogHouse.remove(testDog);
        //Then
        Assert.assertEquals(testDogHouse.getNumberOfDogs(), endingNumber);
    }

    // TODO - Create tests for `void remove(Dog dog)`


    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void testRemoveID() {
        // Given (A testDog is added to the  testDogHouse)
        Dog testIDDog = new Dog("ID", new Date(0), 66);
        testDogHouse.add(testIDDog);
        // When we add a Dog to the DogHouse
        testDogHouse.remove(testIDDog);
        boolean dogIsThereEnd = testDogHouse.getDogById(testIDDog.getId()) == null;
        //Then
        Assert.assertEquals(dogIsThereEnd, true);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
