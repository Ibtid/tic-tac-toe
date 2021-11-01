package com.company.GameManagement;

import com.company.DialogueBox;

public class GameEnd {

    String[][] boardButtonKey;
    WinnerCheck winnerCheck;
    DialogueBox dialogueBox;

    public GameEnd(String[][] boardButtonkey) {
        dialogueBox = new DialogueBox();
        this.boardButtonKey=boardButtonkey;
        winnerCheck = new WinnerCheck(this.boardButtonKey);
    }

    public boolean identifyWinner(){
        if(playerWin()){
            showMatchResult("Player Win");
            return true;
        }
        if(aiWin()){
            showMatchResult("Computer Win");
            return true;
        }
        return false;
    }

    public boolean playerWin(){
        if(winnerCheck.playerWinInColumn()|| winnerCheck.playerWinInDiagonal()|| winnerCheck.playerWinInRow()){
            return true;
        }
        return false;
    }

    public  boolean aiWin(){
        if(winnerCheck.aiWinInColumn()|| winnerCheck.aiWinInDiagonal()|| winnerCheck.aiWinInRow()){
            return true;
        }
        return false;
    }

    public void showMatchResult(String message) {
        dialogueBox.createDialogueBox(message);
    }
}
