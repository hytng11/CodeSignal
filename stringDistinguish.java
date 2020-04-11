//https://programmers.co.kr/learn/courses/30/lessons/12918
//TODO In the question, output's range is 4 to 6, checking the range is needed
import java.util.Scanner;

class stringDistinguish{
    public static void main(String[] args) {
        char tmp;
        boolean output = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input test: ");
        String input = scanner.nextLine();

        for(int i=0; i<input.length(); i++){
            tmp = input.charAt(i);
            
            if(!('0'<= tmp && tmp <= '9')) output = false;
            // if(Character.isDigit(tmp) == false) output = false; 내장함수 isDigit()
        }
        System.out.println("Result: "+ output);
    }
}