//https://programmers.co.kr/learn/courses/30/lessons/12901
class Year{
public static void main(String[] args){
    int date[] ={31,29,31,30,31,30,31,31,30,31,30,31}; //2016 calender
    int Sumdate =0;
    int a =5;
    int b =24;

    if(a == 1){
        Sumdate = b;
    }else{
        for(int i=0; i < a-1; i++){
        Sumdate += date[i];
    }
        Sumdate += b;
}
    switch(Sumdate%7){
        case 0 : System.out.println("Tur"); break;
        case 1 : System.out.println("Fri"); break;
        case 2 : System.out.println("Sat"); break;
        case 3 : System.out.println("Sun"); break;
        case 4 : System.out.println("Mon"); break;
        case 5 : System.out.println("Tus"); break;
        case 6 : System.out.println("Wed"); break;
    }

//System.out.println(Sumdate);

 }
}
