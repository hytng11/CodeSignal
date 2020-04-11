class palindrome{
    public static void main(String[] args) {
        String inputString = "abc";
        boolean output = true;
        char[] chArr = inputString.toCharArray();
        int i=0;
        while(i<=(chArr.length-1)/2){
            if(chArr[i] == chArr[chArr.length-1-i]) i++;
            else{
                output = false;
                break;
            }
        }

        System.out.println(output);
    


        
    }
}