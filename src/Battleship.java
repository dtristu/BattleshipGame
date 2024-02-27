import java.util.Random;

public class Battleship {
    static int NR_ROWS=10;
    static int SHIP_LENGTH=3;
    static int NR_SHIPS_ALIVE=0;
    static boolean[][] USED_SPACE= new boolean[NR_ROWS][NR_ROWS];
    public int shipHealth=SHIP_LENGTH;
    public boolean[][] shipLocation= new boolean[NR_ROWS][NR_ROWS];
    //constructor
    public Battleship() {
        NR_SHIPS_ALIVE++;
        loop: while (true) {
            boolean oriz;
            Random r = new Random();
            oriz = r.nextBoolean();
            int x = r.nextInt(NR_ROWS);
            int y = r.nextInt(NR_ROWS);
            if (oriz) {
                if (x <= (NR_ROWS - SHIP_LENGTH)) {
                    int i;
                    for (i = x; i < SHIP_LENGTH + x; i++) {
                        if (USED_SPACE[y][i]) {
                            continue loop;
                        }
                    }
                    //locatia aleasa este buna
                    //setez locatia
                    int j;
                        for (j = x; j < SHIP_LENGTH + x; j++) {
                        USED_SPACE[y][j]=true;
                        this.shipLocation[y][j]=true;
                        }
                        break loop;
                }


            }
            //cod oriz = fals
            else {
                if (y <= (NR_ROWS - SHIP_LENGTH)) {
                    int i;
                    for (i = y; i < SHIP_LENGTH + y; i++) {
                        if (USED_SPACE[i][x]) {
                            continue loop;
                        }
                    }
                    //locatia aleasa este buna
                    //setez locatia
                    int j;
                    for (j = y; j < SHIP_LENGTH + y; j++) {
                        USED_SPACE[j][x]=true;
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
               NR_SHIPS_ALIVE--;
           }
       }
       return result;
    }
}
