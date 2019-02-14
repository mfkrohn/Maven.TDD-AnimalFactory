package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    private AnimalFactory testAnimalFactory;
    @Before
    public void setup(){this.testAnimalFactory = new AnimalFactory();
    }

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        //Given


        //When
        Date bday = new Date(1);
        Dog testDog = testAnimalFactory.createDog("TestName",bday);
        //Then
        Assert.assertEquals(testDog.getName(),"TestName");
        Assert.assertEquals(testDog.getBirthDate(),bday);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest(){
        //Given

        //When
        Date bday = new Date(1);
        Cat testCat = testAnimalFactory.createCat("TestName",bday);
        //Then
        Assert.assertEquals(testCat.getName(),"TestName");
        Assert.assertEquals(testCat.getBirthDate(),bday);
    }
}
