package sumofdigits;

public class SumOfDigits {
    public int getSumOfDigits(int number) {
        String s = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (Character.getNumericValue(s.charAt(i)));
        }
        return sum;
    }
}
