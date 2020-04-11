class solutionCountry124 {
    public static void main(String[] args) {
        int n = 17;
        String[] num = { "4", "1", "2" };
        String answer = "";

        while (n > 0) {
            answer = num[n % 3] + answer; // 2
            n = (n - 1) / 3; // 5
        }
        System.out.println(answer);
    }

}
