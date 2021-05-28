package homework;


public class Activity31 {
    public static void main(String[] args) {
        int so = 10 , n1 = 0 , n2 = 1 ;
        System.out.print("day 10 chu so fi la: " );
        for (int i = 1 ; i <= so ; i = i+1 ){
            System.out.print(n1+" ");
            int Nn = n1 +n2 ;
            n1 = n2 ;
            n2 = Nn ;


        }
    }
}