
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int ebob=1,ekok,number=1;
        while (true){
            if (n1%number ==0 && n2%number==0){
                ebob=number;
            }
            if(number==n1 || number== n2){
                break;
            }
            number++;
        }
        ekok=(n1*n2) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : "+ ekok);
    }
}