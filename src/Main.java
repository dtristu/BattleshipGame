public class Main {
    public static void main(String[] args) {
        int i;
        int nrShipsTotal=3;
        Battleship[] bat=new Battleship[nrShipsTotal];
        for (i=0;i<nrShipsTotal;i++)
        {
          bat[i]=new Battleship();
        }
    //print used space for debugging
    IO io1=new IO();
    io1.printMatrix(Battleship.USED_SPACE);

    io1.startGameMessage();

    while (Battleship.NR_SHIPS_ALIVE>0)
        {
            IO io2= new IO();
            int[] guess=io2.getGuess();
            int y=guess[0];
            int x=guess[1];
            int j;
            String message="miss";
            for(j=0;j<nrShipsTotal;j++){
                String result=bat[j].checkHit(y,x);
                if (result.equals("hit"))
                {
                    io2.itAHit();
                    message=result;
                    break;
                } else if (result.equals("ship sunk")) {
                    io2.shipSunk();
                    message=result;
                    break;
                }

            }
            if (message.equals("miss")){ io2.miss();}

        }
    io1.gameOver();
    }


}