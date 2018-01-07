import org.junit.jupiter.api.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class FizzBuzzTest {

    @Test
    public void shouldPrintFizzWhenDivisiblePerThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assert (fizzBuzz.isFizz(3) == true);
    }
}
