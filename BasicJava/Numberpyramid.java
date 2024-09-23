public class Numberpyramid{
    public static void main (String arg[]){
        // int rn =5; int cn =5;
        // for (int i = 0; i < rn; i++) {
        //     for (int j = 1; j <=(cn-i); j++) {
        //          System.out.print(j);
        //     }
        //     System.err.println();
        // }

        // method 2:
        int rn =5;
        for (int i = 1; i <= rn; i++) {
            for (int j = 1; j <=(rn-i+1) ; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }
}
// Output:

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1