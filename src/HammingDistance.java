public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            distance += xor & 1;
            xor >>= 1;
        }
        return distance;
    }
    public static void main(String[] args) {
        int x = 1;  // Example input x
        int y = 4;  // Example input y

        int distance = hammingDistance(x, y);

        System.out.println("Hamming distance between " + x + " and " + y + ": " + distance);
    }
}
