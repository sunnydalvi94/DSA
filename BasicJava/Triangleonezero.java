public class Triangleonezero {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

// Logic : check position of each number
// row 1st , col 1st  -- 1
// row 2nd , col 1st ---0
// row 2nd , col 2nd -- 1

// 1 ( r1 c1)
// 0  1 ( r2 c2)
// ( r2 c1)
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// just add number position like ( r2 + c1 )
// if ( sum is even ; print 1 otherwise print 0)