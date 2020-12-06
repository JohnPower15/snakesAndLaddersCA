package SnakesAndLadders;


/**
 * An instantiable class that moves the player across the board
 */
public class MovePlayer{

    private int playerX, playerY;

    /**
     *Method which updates the players position based on the number of rolled in the diceroll method
     * This Method moves a player left or right based on there position on the board
     * @param diceRoll the dice roll
     * @param playerX   players x position
     * @param playerY   players y position
     */


    public MovePlayer(int diceRoll, int playerX, int playerY)
    {

        int tileSize = 100;

        boolean isRight = true;

        isRight= playerY != 150 && playerY != 350;

        if (isRight)
        {
            for (int i = 0; i < diceRoll; i++)
            {
                if (isRight)
                {
                    playerX += 100;
                    if (playerX == 600)
                    {
                        isRight = false;
                        playerY -= tileSize;
                    }
                }

                if (!isRight)
                {
                    playerX -= 100;
                }
            }
        }
        else
        {
            for (int i = 0; i < diceRoll; i++)
            {
                if (!isRight) {
                    playerX -= 100;
                    if (playerX == -100)
                    {

                        isRight = true;
                        playerY -= tileSize;
                    }
                }
                if (isRight)
                {
                    playerX += 100;
                }

            }
        }
       setPlayerX(playerX);
       setPlayerY(playerY);


    }

    /**
     * a 2-argument constructor that sets the player to position on the board
     * @param playerX
     * @param playerY
     */
    public MovePlayer(int playerX,int playerY)
    {
        setPlayerX(playerX);
        setPlayerY(playerY);

    }

    /**
     *Method to get the x position of player
     * @return
     */
    public int getPlayerX() {return playerX;}

    /**
     *Method to set the x position of player
     * @param playerX
     */
    public void setPlayerX(int playerX) {this.playerX = playerX;}

    /**
     *Method to get the y position of player
     * @return
     */
    public int getPlayerY() {return playerY;}

    /**
     *Method to set the y position of player
     * @param playerY
     */
    public void setPlayerY(int playerY) {this.playerY = playerY;}



}
