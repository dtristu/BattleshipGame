import java.util.Scanner;

public class IO {

    public void printMatrix(boolean matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
        {

            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print( matrix[i][j]  + "\t");
            }
            System.out.println();
        }
    }
    public void startGameMessage(){
        System.out.println("Start Game!");
    }
    public int[] getGuess(){
        Scanner s=new Scanner(System.in);
        System.out.print("Your guess is: x=");
        int x= s.nextInt();
        System.out.print("And y=");
        int y= s.nextInt();
        int[] guess= new int[2];
        guess[0]=y;
        guess[1]=x;
        return guess;
    }
    public void itAHit()
    {
        System.out.println("It's a hit!");
    }
    public void shipSunk()
    {
        System.out.println("Ship Sunk!");
    }
    public void miss()
    {
        System.out.println("Miss");
    }
    public void gameOver()
    {
        System.out.println("Game over!");
    }
}
