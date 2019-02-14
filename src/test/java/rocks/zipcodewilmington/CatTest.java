package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    private Cat sgtFluffers;
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Before
    public void setup(){
        this.sgtFluffers = new Cat("Sgt Fluffers", new Date(0),1);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        //Given
        String catName = "Sir John Frederick of Wallington III";


        //When
        sgtFluffers.setName(catName);


        //Then
        Assert.assertEquals("Sir John Frederick of Wallington III", sgtFluffers.getName());
    }

    @Test
    public void speakTest(){
        //Given (Sgt Fluffers)

        //When
        String theOrdersGivenFromOurOverlordSgtFluffers = sgtFluffers.speak();


        //Then
        Assert.assertEquals("Bow down hooman!",theOrdersGivenFromOurOverlordSgtFluffers);
    }

    @Test
    public void setBirthDateTest(){
        //Given(Sgt Fluffers)
        Date theDayOurOverlordCreatedHimself = new Date(6/13/93);
        //When
        sgtFluffers.setBirthDate(theDayOurOverlordCreatedHimself);
        //Then
        Assert.assertEquals(sgtFluffers.getBirthDate(),theDayOurOverlordCreatedHimself);
    }

    @Test
    public void eatTest(){
        //Given(Sgt Fluffers)
        Integer meals = sgtFluffers.getNumberOfMealsEaten();
        Integer finalMeals = meals + 1;

        //When
        Food theTearsOfHisEnemies = new Food();
        sgtFluffers.eat(theTearsOfHisEnemies);

        //Then
        Assert.assertEquals(sgtFluffers.getNumberOfMealsEaten(),finalMeals);

    }

    @Test
    public void getIDTest(){
        //Given (Sgt Fluffers)

        //When
       int seeID = sgtFluffers.getId();

        //Then
        Assert.assertEquals(seeID,1);
    }

    @Test
    public void ifInstanceOfAnimalTest(){
        //Given (Sgt Fluffers)

        //When
        boolean isAnimal = sgtFluffers instanceof Animal;
        //Then
        Assert.assertEquals(isAnimal, true);

    }

    @Test
    public void ifInstanceOfMammalTest(){
        //Given (Sgt Fluffers)

        //When
        boolean isMammal = sgtFluffers instanceof Mammal;
        //Then
        Assert.assertEquals(isMammal, true);

    }

}
