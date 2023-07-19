public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 00000000000000000000000000001011;  // Example input number

        int weight = hammingWeight(number);

        System.out.println("Hamming weight of " + number + ": " + weight);
    }
}
