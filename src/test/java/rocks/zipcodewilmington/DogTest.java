package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class DogTest {


    private Dog goodBoi;

    @Before
    public void setup() {
        this.goodBoi = new Dog("Good Boi", new Date(0), 1);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void Test() {
        // Given (dog data)
        String givenName = "DoggyBoi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog doggyBoi = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = doggyBoi.getName();
        Date retrievedBirthDate = doggyBoi.getBirthDate();
        Integer retrievedId = doggyBoi.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        //Given(Good Boi)


        //When
        String goodBoiBark = goodBoi.speak();

        //Then
        Assert.assertEquals("bark!",goodBoiBark);
    }

    @Test
    public void setBirthDateTest(){
        //Given
        Date goodBoiBDay = new Date(6/13/93);
        //When
        goodBoi.setBirthDate(goodBoiBDay);

        //Then
        Assert.assertEquals(goodBoi.getBirthDate(),goodBoiBDay);

    }

    @Test
    public void eatTest(){
        //Given
        Integer meals = goodBoi.getNumberOfMealsEaten();
        Integer finalMeals = meals + 1;
        //When
        Food fancyFeast = new Food();
        goodBoi.eat(fancyFeast);
        //Then
        Assert.assertEquals(goodBoi.getNumberOfMealsEaten(),finalMeals);
    }

    @Test
    public void getIDTest() {


        //Given

        //When
        int idGet = goodBoi.getId();
        //Then
        Assert.assertEquals(idGet,1);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

}
