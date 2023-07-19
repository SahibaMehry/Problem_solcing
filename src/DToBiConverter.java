import java.util.Scanner;
public class DToBiConverter {
        public static String decimalToBinary(int number) {
            if (number == 0) {
                return "0";
            }
            StringBuilder binary = new StringBuilder();
            while (number > 0) {
                binary.insert(0, number & 1);
                number >>= 1;
            }
            return binary.toString();
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a decimal number: ");
            int decimalNumber = scanner.nextInt();

            String binaryNumber = decimalToBinary(decimalNumber);
            System.out.println("Binary representation: " + binaryNumber);
        }
    }


