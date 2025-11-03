public class PracticeProblem {

	public static void main(String args[]) {
// You can add code here to test your methods if needed
        System.out.println(pyramid(4));          // Test pyramid method
        System.out.println(square(3));            // Test square method
        System.out.println(hasLowercase("Hello")); // Test hasLowercase method
        System.out.println(hasLowercase("HELLO")); // Test hasLowercase method
	}
    //  Q1
    public static String pyramid(int rows) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j > i; j--) {
                result.append(" ");
            }

            for (int k = 1; k <= i; k++) {
                result.append("* ");
            }
            result.append("\n");
        }
        return result.toString();
    }
    // Q 2:
    public static String square(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    result.append("*");
                }
            } else {
                result.append("*");
                for (int j = 1; j < size - 1; j++) {
                    result.append(" ");
                }
                result.append("*");
            }
            result.append("\n");
        }
        return result.toString();
    }
    // Q3:
    public static boolean hasLowercase(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
}
