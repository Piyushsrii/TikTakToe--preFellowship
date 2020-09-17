#Welcome in tiktak toe#
package tiktaktoe;

/**
 *
 * @author user
 */
public class UserCase1 {

     public static void main(String[] args) {

        char[][] gameBoard={{' ','|',' ','|',' '},
             {'-','+','-','+','-'},
             {' ','|',' ','|',' '},
             {'-','+','-','+','-'},
             {' ','|',' ','|',' '}};

       printGameBoard(gameBoard);

       checkToss();
       while(true)
       {
       System.out.println("Enter the between 1-9");
       int playerPos=scan.nextInt();
       System.out.println(""+playerPos);

       placePeace(gameBoard,playerPos,"player");

       Random rand=new Random();
       int cpuPos=rand.nextInt(9)+1;
       placePeace(gameBoard,cpuPos,"cpu");

       printGameBoard(gameBoard);
        }

}
         public static void placePeace(char[][] gameBoard,int pos, String user)
         {
         char symbol=' ';
         if(user.equals("player")){
            symbol='X';
         }
         else if(user.equals("cpu")){
            symbol='O';
         }
        switch(pos){
        case 1:
            gameBoard[0][0]=symbol;
            break;
            case 2:
            gameBoard[0][2]=symbol;
            break;
            case 3:
            gameBoard[0][4]=symbol;
            break;
            case 4:
            gameBoard[2][0]=symbol;
            break;
            case 5:
            gameBoard[2][2]=symbol;
            break;
            case 6:
            gameBoard[2][4]=symbol;
            break;
            case 7:
            gameBoard[4][0]=symbol;
            break;
            case 8:
            gameBoard[4][2]=symbol;
            break;
            case 9:
            gameBoard[4][4]=symbol;
            break;
            default:
                    break;
       }
       printGameBoard(gameBoard);        
       }
       public static void printGameBoard(char[][] gameBoard)
       {
        for(char[] a: gameBoard)
        {
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
