#Welcome in tiktak toe#
package tiktaktoe;

/**
 *
 * @author user
 */
public class UserCase1 {

     public static void main(String[] args) 
     {
             char[][] gameBoard={{' ','|',' ','|',' '},
             {'-','+','-','+','-'},
             {' ','|',' ','|',' '},
             {'-','+','-','+','-'},
             {' ','|',' ','|',' '}};
             printGameBoard(gameBoard);
      }
      public static void printGameBoard(char[][] gameBoard){

          for(char[] a: gameBoard){
                        for(char b: a){
                              System.out.print(b);
                                      }
                                     System.out.println();
                                       }
                                       }
          public static void checkToss()
          {    
            p1=scan.nextInt(2);
            if(p1==0)
            {
            System.out.println("p1 play first");
            System.out.println("p2 play Second");
            }    
            else
            {
            System.out.println("p2 play first");
            System.out.println("p1 play second");
        }
    }
}
