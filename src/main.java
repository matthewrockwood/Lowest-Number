import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int x;
      int y;
      int z;
      int small = 0;
      
      x = scnr.nextInt();
      y = scnr.nextInt();
      z = scnr.nextInt();
      
      if(x<=y && x<=z){
         small = x;
      }
      else if(y<=x && y<=z){
         small = y;
      }
      else if(z<=x && z<=y){
         small = z;
      }
      
      System.out.println(small);
      
   }
}
