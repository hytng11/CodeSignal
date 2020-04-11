//https://programmers.co.kr/learn/courses/30/lessons/12906
import java.util.*;
class DeleteSameNum{
    public static void main(String[] args){
        //1,1,3,4,1
        int arr[] = {1,1,6,2,1,1,3};
        int prep = 10;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(prep != arr[i]) temp.add(arr[i]);
            prep = arr[i];
        }
        /*
        int[] answer = new int[temp.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = temp.get(i).intValue();
        }
        */
        System.out.println(temp);
       


    }
}