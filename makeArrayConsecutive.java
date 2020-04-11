import java.util.Arrays;

//https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC
class makeArrayConsecutive{
    public static void main(String[] args) {
        int[] statues= {6,2,3,8};
        int max = statues[0];
        int min = statues[0];
        for(int i=0; i<statues.length; i++){
            if(max < statues[i]) max = statues[i]; //8
            if(min > statues[i]) min = statues[i]; //2
        }
        int arrayconSize = max-min+1;
        Arrays.sort(statues); // 2,3,6,8
        int[] arithmeticProg = new int[arrayconSize];
        for(int i=0; i< arrayconSize; i++){
            arithmeticProg[i] = statues[0] + i; // 1+i => 2,3,4,5,6,7,8
    
            }
        System.out.println(arithmeticProg.length-statues.length);
        
            
        }

        
    }
