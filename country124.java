class country124 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(n % 3);
        while (n % 3 == 0) {
            System.out.println(n % 3);

        }
        int res;
        int digit[] = new int[checkrange(n)];
        for (int i = 0; i < digit.length; i++) {
            digit[i] = n % 3;
            System.out.println(digit[i]);
        }

        /*
         * for(int i=0; i<20; i++)
         * 
         * while (true) { if (Math.pow(3, n) > 500000000) { System.out.println(n);
         * break; } n++;
         * 
         * }
         */
    }

    static int checkrange(int n) {
        if (n == 1)
            return 1;

        int sum = 0;
        int i = 0;
        int range = 0;
        while (i < 10) {
            int power = (int) Math.pow(3, i); // power 1 + 3 = 4
            sum += power;
            if (sum > n) {
                range = i;
                break;

            } else
                i++;
        }
        return range;

    }
}
