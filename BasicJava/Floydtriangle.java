public class Floydtriangle {
    public static void main(String[] args) {
        int rn =5;
        int count=1;
        for (int i = 1; i <= rn; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" "+" "+" ");
                count++;
            }
            System.out.println();
        }
    }
}
