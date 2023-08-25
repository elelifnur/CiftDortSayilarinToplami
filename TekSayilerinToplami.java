import java.util.Scanner;
public class TekSayilerinToplami {
    public static void main(String[] args){
        int a;
        int total=0,db=0,cift=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        a=input.nextInt();
        while (a % 2 == 0 ){
            if(a % 4==0){
                db+=a;
            }
            cift+=a;
            System.out.print("Sayı Giriniz: ");
            a=input.nextInt();

        }
        total=db+cift;
        System.out.println(total);
    }
}
