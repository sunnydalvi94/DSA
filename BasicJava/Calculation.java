import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        System.out.println("===================== Calculator ===================================== ");
        System.out.println("Plus operation ====>  " + " 1");
        System.out.println("Substraction operation ====>" + " 2");
        System.out.println("Multiplicaton operation ====>" + " 3");
        System.out.println("Division operation ====> " + " 4");
        System.out.println("========================================================== ");
        System.out.println(" Enter the Number ");


        Scanner sc = new Scanner(System.in);
      
        int ope = sc.nextInt(); 
        System.out.println(" Enter the First Number: ");
        int num1 =sc.nextInt();
        System.out.println(" Enter the Second Number: ");
        int num2 =sc.nextInt();
        switch (ope) {
            case 1:
                adddion(num1,num2);
                break;
            case 2:
                substract(num1,num2);
                break;
            case 3:
                multiply(num1,num2);
                break;
            case 4:
                division(num1,num2);
                break;
        
            default:
                  System.out.println("Enter correct number ");
                break;
        }
    }
    public static void adddion(int num1,int num2){
        System.out.println("Sum is : " + ( num1+num2));
    }
    public static void substract(int num1,int num2){
        System.out.println("Substraction is : " + ( num1-num2));
    }
    public static void multiply(int num1,int num2){
        System.out.println("multiplication is : " + ( num1*num2));

    }
    public static void division(int num1,int num2){
        System.out.println("division is : " + ( num1 / num2));
    }
}