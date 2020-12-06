package SnakesAndLadders;


/**
 * Instantiable class that creates a random number between 1 and 6 to simulate a dice roll
 */
public class Dice {

    private int diceRoll;


    /**
     * method to set the diceRoll attribute
     * @param diceRoll
     */
    public void setDiceRoll(int diceRoll) {
        this.diceRoll = diceRoll;
    }

    /**
     * Method to get the diceRoll attribute
     * @return
     */
    public int getDiceRoll() {
        diceRoll = (int) Math.round( (Math.random() * 4 + 1));
        return diceRoll;}

}
