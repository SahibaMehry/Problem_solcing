public class primeNumber {
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 17;

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

