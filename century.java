//https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
class centery{
    public static void main(String[] args) {
      /*
        int year = 1996;

        if(1<= year && year < 100) System.out.println("1");
        else if(year%100 == 0) System.out.println(year/100);
        else{
            System.out.println((int)year/100 +1);
        }     
        */
        cal test = new cal();
        int result = test.centuryFromYear(2000);
        System.out.println(result);


    }
}

class cal{
    int centuryFromYear(int year){
        if(1<=year && year < 100) return 1;
        else if(year%100 == 0) return year/100;
        else return (int) year/100 +1;
    }
}