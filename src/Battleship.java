import java.util.Random;

public class Battleship {
    static int nrRows=10;
    static int shipLength=3;
    public int shipHealth=shipLength;
    static int nrShipsAlive=0;
    static boolean[][] usedSpace= new boolean[nrRows][nrRows];
    public boolean[][] shipLocation= new boolean[nrRows][nrRows];
    //constructor
    public Battleship() {
        nrShipsAlive++;
        loop: while (true) {
            boolean oriz;
            Random r = new Random();
            oriz = r.nextBoolean();
            int x = r.nextInt(nrRows);
            int y = r.nextInt(nrRows);
            if (oriz) {
                if (x <= (nrRows - shipLength)) {
                    int i;
                    for (i = x; i < shipLength + x; i++) {
                        if (usedSpace[y][i]) {
                            continue loop;
                        }
                    }
                    //locatia aleasa este buna
                    //setez locatia
                    int j;
                        for (j = x; j < shipLength + x; j++) {
                        usedSpace[y][j]=true;
                        this.shipLocation[y][j]=true;
                        }
                        break loop;
                }


            }
            //cod oriz = fals
            else {
                if (y <= (nrRows - shipLength)) {
                    int i;
                    for (i = y; i < shipLength + y; i++) {
                        if (usedSpace[i][x]) {
                            continue loop;
                        }
                    }
                    //locatia aleasa este buna
                    //setez locatia
                    int j;
                    for (j = y; j < shipLength + y; j++) {
                        usedSpace[j][x]=true;
                        this.shipLocation[j][x]=true;
                    }
                    break loop;
                }

            }


    }
            }




    public String checkHit (int y, int x)
    {
       String result= "miss";
       if (shipLocation[y][x])
       {
           result="hit";
           shipLocation[y][x]=false;
           shipHealth--;
           if (shipHealth<1)
           {
               result="ship sunk";
               nrShipsAlive--;
           }
       }
       return result;
    }
}
