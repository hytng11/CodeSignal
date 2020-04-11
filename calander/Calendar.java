package calander;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.next();
        s2 = scanner.next();
        System.out.println(s1 + "," + s2);
        a = Integer.parseInt(s1); // s1 은 String Type 이라 정수 변환
        b = Integer.parseInt(s2);
        // (a+b)에서 괄호 없으면 if a= 10 b= 20 일때 1020으로 나옴
        System.out.println("두 수의 합은" + (a + b) + "입니다");
        // 아래 방법이 좀더 좋음
        System.out.printf("%d와 %d 의 합은 %d 입니다", a, b, a + b);
        // scanner를 다 썼으면 닫아주는 연습
        scanner.close();
    }
}