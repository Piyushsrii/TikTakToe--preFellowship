#Welcome in tiktak toe#
package tiktaktoe;

/**
 *
 * @author user
 */
public class UserCase1 
{
     public static void main(String[] args)
     {
             char[][] gameBoard={{' ','|',' ','|',' '},
             {'-','+','-','+','-'},
             {' ','|',' ','|',' '},
             {'-','+','-','+','-'},
             {' ','|',' ','|',' '}};
             printGameBoard(gameBoard);
     }
     public static void printGameBoard(char[][] gameBoard)
     {
            for(char[] a: gameBoard){
                       for(char b: a){
                             System.out.print(b);
                                     }
                                System.out.println();
                                     }
      }
}
