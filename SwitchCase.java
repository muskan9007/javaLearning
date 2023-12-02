import java.util.Scanner;

public class SwitchCase {
    // public SwitchCase(int num1) {
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;
        
        while (num>0) {
            int num1=num%10;

            switch(num1){
                case 0: count0++;
                break;
                case 1: count1++;
                break;
                case 2: count2++;
                break;
                case 3: count3++;
                break;
                case 4: count4++;
                break;
                case 5: count5++;
                break;
                case 6: count6++;
                break;
                case 7: count7++;
                break;
                case 8: count8++;
                break;
                case 9: count9++;
                break;
            }
            num = num/10;
        }

        if (count0!=0){
            System.out.println("0 ->"+count0);
        }
        if (count1!=0){
            System.out.println("1 ->"+count1);
        }
        if (count2!=0){
            System.out.println("2 ->"+count2);
        }
        if (count3!=0){
            System.out.println("3 ->"+count3);
        }
        if (count4!=0){
            System.out.println("4 ->"+count4);
        }
        if (count5!=0){
            System.out.println("5 ->"+count5);
        }
        if (count6!=0){
            System.out.println("6 ->"+count6);
        }
        if (count7!=0){
            System.out.println("7 ->"+count7);
        }
        if (count8!=0){
            System.out.println("8 ->"+count8);
        }
        if (count9!=0){
            System.out.println("9 ->"+count9);
        }

            
            
        
    }

    
    
}
