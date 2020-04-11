import java.util.Scanner;

class Sqaureroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        double result = Math.sqrt(n);

        if (result - (int) result == 0) {
            System.out.println(Math.pow(result + 1, 2));
        } else {
            System.out.println("NO");
        }

        scanner.close();

    }
}