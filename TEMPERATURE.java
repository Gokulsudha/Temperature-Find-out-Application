import java.util.Scanner;
public class TEMPERATURE{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("CURRENT TEMPERATURE");
        int temp = sc.nextInt();
        if(temp < 0){
            System.out.println("YOU SHOULD WEAR WINTER CLOTHS");
            System.out.println("DON'T FORGET TO WEAR GLOWS");
        }
        else if(temp >= 0 && temp <= 10 ){
            System.out.println("YOU SHOULD WEAR WARM CLOTHS");
            System.out.println("DON'T FORGET TO WEAR LITE JACKET");
        }
        else if(temp >= 11 && temp <= 20){
            System.out.println("YOU SHOULD WEAR LITE CLOTHS");
            System.out.println("DON'T FORGET TO WEAR SUN GLASS");
        }
        else if(temp > 20){
            System.out.println("YOU SHOULD WEAR SUMMER CLOTHS");
            System.out.println("DON'T FORGET TO WEAR SUN SCREEN");
        }
        else{
            System.out.println("ERROR MESSAGE");
        }
        
    }
}