public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String fizzBuzz(int maxNumber) {
        String result = "";

        for (int i = 1; i <= maxNumber; i++){
            String text = "";
            text = Integer.toString(i);

            if (isFizz(i)) {
                text = FIZZ;
                if (isBuzz(i)){
                    text += BUZZ;
                }
            }
            else if(isBuzz(i)){
                text = BUZZ;
            }

            result += text + "\n";

        }
        return result;
    }

    public boolean isFizz(int number){
        return number % 3 == 0;
    }

    public boolean isBuzz(int number){
        return number % 5 == 0;
    }
}
