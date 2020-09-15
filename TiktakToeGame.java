#Welcome in tiktak toe#
package tiktaktoe;

/**
 *
 * @author user
 */
public class UserCase1 {
static int block=0;
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
       if(playerPos==1 || playerPos==3 || playerPos == 5 || playerPos == 7 || playerPos==9)
       { 
           System.out.println("you are in right path");
       while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions))
       {
           System.out.println("Position taken! Enter a correct Position");
           playerPos=scan.nextInt();
       }
        placePeace(gameBoard,playerPos,"player");
       }else if(playerPos==5){
                 System.out.println("corner have no place");
           while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions ))
       {
           System.out.println("Position taken! Enter a correct Position");
           playerPos=scan.nextInt();
       }
        placePeace(gameBoard,playerPos,"player");
       }
             }

         Random rand=new Random();
         int cpuPos=rand.nextInt(9)+1;
         if(cpuPos==2 || cpuPos == 4 || cpuPos==6 || cpuPos==8)             
       {
       System.out.println("Cpu enter your value from 1-9 on board value is "+cpuPos);
       while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos))
       {
           cpuPos=rand.nextInt(9)+1;
       } 
       placePeace(gameBoard,cpuPos,"cpu");
       }
         
       printGameBoard(gameBoard);

       }

}
         public static void placePeace(char[][] gameBoard,int pos, String user)
       {
        char symbol=' ';
        if(user.equals("player")){
           playerPositions.add(pos);
            symbol='X';
        }
        else if(user.equals("cpu")){
            cpuPositions.add(pos);
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
       }
             public static String checkWinner(){
          List toprow=Arrays.asList(1, 2, 3);
          List toprow1=Arrays.asList(1, 2, 6);
          List midrow=Arrays.asList(4, 5, 6);
          List botrow=Arrays.asList(7, 8, 9);
          List leftcol=Arrays.asList(1, 4, 7);
          List midcol=Arrays.asList(2, 5, 8);
          List rightcol=Arrays.asList(3, 6, 9);
          List cross1=Arrays.asList(1, 5, 9);
          List cross2=Arrays.asList(7, 5, 3);

          List<List> winning = new ArrayList<List>();
          winning.add(toprow);
          winning.add(toprow1);
          winning.add(midrow);
          winning.add(botrow);
          winning.add(leftcol);
          winning.add(midcol);
          winning.add(rightcol);
          winning.add(cross1);
          winning.add(cross2);
          for(List l: winning){
          if(playerPositions.containsAll(l))
             {
               return "congratution you win ";
             } 
            else if(cpuPositions.containsAll(l))
             {
              return "cpu win soryy :(";
             }
             else if(playerPositions.size()+cpuPositions.size()==9)
               {
               return "Game Tied";    
               }
          }
            return "";
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
