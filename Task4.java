public class Task4 {
    public static void main(String[] args) {
        String str = "level";
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev))
            System.out.println("The input string is a palindrome.");
        else
            System.out.println("The input string is not a palindrome.");
    }
}