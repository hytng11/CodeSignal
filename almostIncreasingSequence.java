import java.util.Arrays;

class almostIncreasingSequence {
    public static void main(String[] args) {
        int[] sequence = { 10, 20, 30, 40, 50 };
        int result = 0;
        Arrays.sort(sequence);

        for (int i = 0; i < sequence.length - 1; i++) {
            for (int j = i + 1; j < sequence.length - 1; j++) {
                if (sequence[i] == sequence[j])
                    result = -1;

            }
        }
        System.out.println(result);

    }

}
