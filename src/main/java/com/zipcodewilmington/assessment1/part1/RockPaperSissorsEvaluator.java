package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if(handSign.equalsIgnoreCase("rock"))
            return "paper";
        else if(handSign.equalsIgnoreCase("paper"))
        return "scissor";
        else if(handSign.equalsIgnoreCase("scissor"))
            return "rock";
        else
            return "";
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if(handSign.equalsIgnoreCase("rock"))
            return "scissor";
        else if(handSign.equalsIgnoreCase("paper"))
            return "rock";
        else if(handSign.equalsIgnoreCase("scissor"))
            return "paper";
        else
            return "";
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(handSignOfPlayer1.equalsIgnoreCase("rock")&&handSignOfPlayer2.equalsIgnoreCase("paper"))
            return handSignOfPlayer2;
        else if(handSignOfPlayer1.equalsIgnoreCase("paper")&&handSignOfPlayer2.equalsIgnoreCase("scissor"))
            return handSignOfPlayer2;
        else if(handSignOfPlayer1.equalsIgnoreCase("scissor")&&handSignOfPlayer2.equalsIgnoreCase("rock"))
            return handSignOfPlayer2;
        else if(handSignOfPlayer1.equalsIgnoreCase("scissor")&&handSignOfPlayer2.equalsIgnoreCase("paper"))
            return handSignOfPlayer1;
        else if(handSignOfPlayer1.equalsIgnoreCase("rock")&&handSignOfPlayer2.equalsIgnoreCase("scissor"))
            return handSignOfPlayer1;
        else if(handSignOfPlayer1.equalsIgnoreCase("paper")&&handSignOfPlayer2.equalsIgnoreCase("rock"))
        return handSignOfPlayer2;
        else
            return "";

    }
}
