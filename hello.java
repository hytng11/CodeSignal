class hello{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("WelcomeGrekks");
        System.out.println("String =" + str.toString());

        System.out.println(new StringBuilder(str).reverse().toString());
        
    }
}