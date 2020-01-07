import java.util.Arrays;
class adjancentElementProduct {

    public static void main(String[] args) {
        int inputArray[] = { 3, 6, -2, -5, 7, 3 };
        int[] result = new int[inputArray.length - 1];

        for (int i = 0; i < inputArray.length - 1; i++) {
            result[i] = inputArray[i] * inputArray[i + 1];
            //System.out.println(result[i]);
        }
       int maxNum = Arrays.stream(result).max().getAsInt();
        System.out.println(maxNum);
        

        
    }
}
