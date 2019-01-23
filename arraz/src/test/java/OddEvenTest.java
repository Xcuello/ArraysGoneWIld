import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void getOddAndEvensOfArrayTest() {

        //Given
        int[] array = {1, 2, 3, 4, 5, 6};

        OddEven expected = new OddEven(3, 3);

        //When
        OddEven actual = OddEven.getOddsAndEvensOfArray(array);


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOddAndEvensOfArrayTest2() {

        //Given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        OddEven expected = new OddEven(4, 4);

        //When
        OddEven actual = OddEven.getOddsAndEvensOfArray(array);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
