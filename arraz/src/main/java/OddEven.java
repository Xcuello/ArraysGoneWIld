import java.util.Objects;

public class OddEven {

    private int odds;

    private int evens;

    public OddEven(int odds, int evens) {

        this.odds = odds;

        this.evens = evens;

    }

    public int getOdds() {

        return odds;
    }

    public void setOdds(int odds) {

        this.odds = odds;
    }

    public int getEvens() {

        return evens;
    }

    public void setEvens(int evens) {

        this.evens = evens;
    }

    public static OddEven getOddsAndEvensOfArray(int[] array) {

        int odd = 0;

        int evens = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                evens++;

            } else {

                odd++;
            }
        }
        return new OddEven(odd, evens);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OddEven oddEven = (OddEven) o;
        return odds == oddEven.odds &&
                evens == oddEven.evens;
    }

    @Override
    public int hashCode() {

        return Objects.hash(odds, evens);
    }
}




