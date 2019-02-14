package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.Cat;
import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    private CatHouse testCatHouse;
    Cat testCat;
    @Before
    public void setup(){
        this.testCatHouse = new CatHouse();
    }
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        //Given
        Integer startingCats = testCatHouse.getNumberOfCats();
        Integer endingCats = startingCats + 1;
        //When
        testCatHouse.add(testCat);
        //Then
        Assert.assertEquals(testCatHouse.getNumberOfCats(),endingCats);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        // Given
        testCatHouse.add(testCat);
        Integer startingCats = testCatHouse.getNumberOfCats();
        Integer endingCats = startingCats - 1;
        // When
        testCatHouse.remove(testCat);
        //Then
        Assert.assertEquals(testCatHouse.getNumberOfCats(), endingCats);
    }
    // TODO - Create tests for `void remove(Integer)`
    @Test
    public void removeIDTest() {
        // Given
        Cat testIDCat = new Cat("ID", new Date(0), 55);
        testCatHouse.add(testIDCat);
        // When
        testCatHouse.remove(testIDCat);
        boolean catIsThereEnd = testCatHouse.getCatById(testIDCat.getId()) == null;
        //Then
        Assert.assertEquals(catIsThereEnd, true);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIDTest() {
        // Given
        Cat testAddIDCat = new Cat("ID", new Date(0),55);
        testCatHouse.add(testAddIDCat);
        // When
        boolean catCheck = testCatHouse.getCatById(testAddIDCat.getId()) == null;
        //Then
        Assert.assertEquals(catCheck, false);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        // Given (A testCat added to the testCatHouse)
        Cat testCat2 = new Cat("SecondName", new Date(8), 9);
        Cat testCat3 = new Cat("3boi", new Date(4), 43);
        testCatHouse.add(testCat);
        testCatHouse.add(testCat2);
        testCatHouse.add(testCat3);
        //When (getNumberOfCats() is called)
        Integer endNumberOfCats = testCatHouse.getNumberOfCats();
        Integer actualNumberOfCats = 3;
        //Then
        Assert.assertEquals(endNumberOfCats, actualNumberOfCats);
    }

}
