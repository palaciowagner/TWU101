public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String fizzBuzz(int maxNumber) {
        String result = "";

        for (int i = 1; i <= maxNumber; i++){
            result += buildFizzBuzzText(i);
        }
        return result;
    }

    private String buildFizzBuzzText(int i) {
        String text = "";

        text = Integer.toString(i);

            if (isFizz(i) && isBuzz(i)) {
                text = FIZZ + BUZZ;
            }

            else if (isFizz(i)) {
                text = FIZZ;
            }
            else if (isBuzz(i)) {
                text = BUZZ;
            }

        return text + "\n";
    }

    public boolean isFizz(int number){
        return number % 3 == 0;
    }

    public boolean isBuzz(int number){
        return number % 5 == 0;
    }
}
