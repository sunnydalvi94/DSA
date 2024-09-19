public class Dectobin{
   public static void  dectobin(int n){
     int bin = 0;
     for(int i =0;n>0;i++){
        int rem = 0;
        rem = n%2;
        bin = bin +( rem * (int)Math.pow(10,i));
        n = n/2;

     }
     System.out.print(bin);
   }

    public static void main(String arg[]){
      dectobin(7);
    }
}