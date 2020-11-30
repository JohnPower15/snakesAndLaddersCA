package SnakesAndLadders;

public class Dice {

    private int diceRoll;

    public void setDiceRoll(int diceRoll) {
        this.diceRoll = diceRoll;
    }

    public int getDiceRoll() {
        diceRoll = (int) Math.round( (Math.random() * 4 + 1));
        return diceRoll;}

}
