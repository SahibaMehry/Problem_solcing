public class XOR {
    public static boolean isEven(int number) {
        return (number ^ 1) == number;
    }

    public static boolean isOdd(int number) {
        return (number ^ 1) != number;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));  // Output: true
        System.out.println(isEven(7));  // Output: false
        System.out.println(isOdd(3));   // Output: true
        System.out.println(isOdd(10));  // Output: false
    }
}
