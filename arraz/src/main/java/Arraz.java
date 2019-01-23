import java.util.*;

public class Arraz {


    public static int sumValuesOfArray(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }

        return sum;
    }

    public static double sumDoublesOfArray(double[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }

        return sum;

    }

    public static int averageOfArray(int[] array) {


        return sumValuesOfArray(array) / array.length;
    }

    public static double doubleAverageOfArray(double[] array) {

        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        return sum / array.length;
    }

    public static boolean containsValue(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value)

                return true;
        }
        return false;
    }

    public static int[] reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            int temp = array[i];

            array[i] = array[array.length - i - 1];

            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int findIndexOfArray(int[] array, int value) {

        int num = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                num = i;
            }
        }
        return num;
    }

    public static String[] copyArrayByIterator(String[] array) {

        List<String> list = new ArrayList<>();

        for (String element : array) {
            list.add(element);
        }

        String[] tempArray = new String[list.size()];
        list.toArray(tempArray);

        return tempArray;
    }

    public static int[] copyArrayByLoop(int[] array) {

        int[] tempArray;

        tempArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            tempArray[i] = array[i];
        }

        return tempArray;
    }

    public static int[] removeElementFromArray(int[] array, int value) {

        int[] tempArray = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < tempArray.length ; j++) {

                if (array[i] != value) {

                    tempArray[j] = array[i];
                }
            }
        }
        return tempArray;
    }

    public static int[] insertIntoArrayAt(int[] array, int index, int value) {

        int[] result = new int[array.length];

        for (int i = 0; i < index; i++)

            result[i] = array[i];

        result[index] = value;

        for (int i = index + 1; i < array.length; i++)

            result[i] = array[i - 1];

        return result;
    }
}

    
