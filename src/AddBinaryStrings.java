public class AddBinaryStrings {
    public static String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            int digitB = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;
            int currentSum = digitA + digitB + carry;
            sum.insert(0, currentSum % 2);
            carry = currentSum / 2;
        }

        return sum.toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
       // String a = "1010";
        // String b = "1111";
        String sum = addBinary(a, b);
        System.out.println("Sum of " + a + " and " + b + ": " + sum);
    }
}
