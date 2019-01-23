import org.junit.Assert;
import org.junit.Test;


public class ArrazTest {


    @Test
    public void sumValuesOfArrayTest() {

        //Given
        int[] array = {1, 2, 3};

        //When
        int expected = 6;

        int actual = Arraz.sumValuesOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumValuesOfArrayTest2() {

        //Given
        int[] array = {5, 10, 15};

        //When
        int expected = 30;

        int actual = Arraz.sumValuesOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumDoublesOfArrayTest() {

        //Given
        double[] array = {5.5, 10.0, 5.5};

        //when
        double expected = 21.0;

        double actual = Arraz.sumDoublesOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumDoublesOfArrayTest2() {

        //Given
        double[] array = {20.5, 2.5, 5.5};

        //When
        double expected = 28.5;

        double actual = Arraz.sumDoublesOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void averageOfArrayTest() {

        //Given
        int[] array = {1, 2, 3};


        //When
        int expected = 2;

        int actual = Arraz.averageOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void averageOfArrayTest2() {

        //Given
        int[] array = {2, 4, 6, 8};


        //When
        int expected = 5;

        int actual = Arraz.averageOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleAverageOfArrayTest() {

        //Given
        double[] array = {1.0, 2.0, 1.0, 4.0};

        //When
        double expected = 2.0;

        double actual = Arraz.doubleAverageOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleAverageOfArrayTest2() {

        //Given
        double[] array = {2.0, 2.0, 2.0, 4.0};

        //When
        double expected = 2.5;

        double actual = Arraz.doubleAverageOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValueTest() {

        //Given
        int[] array = {1, 2, 3, 4};

        int value = 2;

        //When
        boolean actual = Arraz.containsValue(array, value);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void containsValueTest2() {

        //Given
        int[] array = {1, 2, 3, 4};

        int value = 4;

        //When
        boolean actual = Arraz.containsValue(array, value);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void reverseArrayTest() {

        //Given
        int[] array = {1, 2, 3, 4};

        int[] expected = {4, 3, 2, 1};

        //When
        int[] actual = Arraz.reverseArray(array);

        //Then
        Assert.assertEquals(expected[0], actual[0]);
    }

    @Test
    public void reverseArrayTest2() {

        //Given
        int[] array = {1, 2, 3, 4};

        int[] expected = {4, 3, 2, 1};

        //When
        int[] actual = Arraz.reverseArray(array);

        //Then
        Assert.assertEquals(expected[3], actual[3]);
    }

    @Test
    public void findIndexOfArrayTest() {

        //Given
        int value = 3;

        int[] array = {1, 2, 3, 4, 5};

        int expected = 2;

        //When
        int actual = Arraz.findIndexOfArray(array, value);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findIndexOfArrayTest2() {

        //Given
        int value = 5;

        int[] array = {1, 2, 3, 4, 5, 6};

        int expected = 4;

        //When
        int actual = Arraz.findIndexOfArray(array, value);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void copyArrayByIteratorTest() {

        //Given
        String[] array = {"dude", "where", "is", "my", "car"};

        String[] expected = {"dude", "where", "is", "my", "car"};

        //When
        String[] actual = Arraz.copyArrayByIterator(array);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void copyArrayByIteratorTest2() {

        //Given
        String[] array = {"where", "is", "the", "party", "at"};

        String[] expected = {"where", "is", "the", "party", "at"};

        //When
        String[] actual = Arraz.copyArrayByIterator(array);


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void copyArrayByLoopTest() {

        //Given
        int[] array = {1, 2, 3, 4, 5, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};

        //When
        int[] actual = Arraz.copyArrayByLoop(array);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void copyArrayByLoopTest2() {

        //Given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        //When
        int[] actual = Arraz.copyArrayByLoop(array);


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeElementFromArrayTest() {

        //Given
        int[] array = {1, 2, 3, 4, 5, 6};

        int value = 4;

        int[] expected = {1, 2, 3, 5, 6};

        //When
        int[] actual = Arraz.removeElementFromArray(array, value);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeElementFromArrayTest2() {

        //Given
        int[] array = {1, 2, 3, 4, 5, 6};

        int value = 2;

        int[] expected = {1, 3, 4, 5, 6};

        //When
        int[] actual = Arraz.removeElementFromArray(array, value);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void insertIntoArrayAtTest() {

        //Given
        int[] array = {1, 2, 3, 4, 5};

        int value = 3;

        int index = 4;

        int[] expected = {1, 2, 3, 4, 3};

        //When
        int[] actual = Arraz.insertIntoArrayAt(array, index, value);

        //Then
        Assert.assertEquals(expected[4], actual[4]);
    }

}