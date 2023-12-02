import java.util.Scanner;

public class ScanData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer :");
        int num1 = sc.nextInt();

        System.out.println("Enter float :");
        float num2 = sc.nextFloat();

        System.out.println("Enter Double :");
        double num3 = sc.nextDouble();

        System.out.println("Enter boolean :");
        boolean num4 = sc.nextBoolean();

        // System.out.println("Enter integer :");
        // int num5 = sc.nextInt();

        System.out.println("Integer:"+num1);
        System.out.println("Float:"+num2);
        System.out.println("Double:"+num3);
        System.out.println("Boolean:"+num4);
    }
}