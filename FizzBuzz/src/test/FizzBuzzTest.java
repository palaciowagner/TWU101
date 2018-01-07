import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @BeforeAll
    private static void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldPrintFizzWhenDivisiblePerThree(){
        assert (fizzBuzz.isBuzz(3) == true);
    }

    @Test
    public void shouldPrintBuzzWhenDivisiblePerFive(){
        assert (fizzBuzz.isBuzz(5) == true);
    }

    @Test
    public void shouldPrintFizzBuzzWhenDivisiblePerThreeAndFive(){
        assert (fizzBuzz.fizzBuzz(14) == "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz");
    }
}
