package firstnumber;

public class FirstNumber {
    public char getFirstNumber(String s) {
        boolean quit = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && !quit) {
                System.out.println(s.charAt(i));
                quit = true;
            }
        }
        return ' ';
    }
}
