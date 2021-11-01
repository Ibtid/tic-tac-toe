package com.company.GameManagement;

import com.company.AI.AIHandler;
import com.company.Player;
import com.company.Theme.ThemeHandler;

import javax.swing.*;

public class SingleRoundComponents {
    JButton[][] boardButton;
    String[][] boardButtonKey;
    AIHandler aiHandler;
    ThemeHandler themeHandler;
    GameEnd gameEnd;
    BoardManagement boardManagement;
    Player player;
    public SingleRoundComponents(JButton[][] boardButton,
                                 String[][] boardButtonKey,
                                 AIHandler aiHandler,
                                 ThemeHandler themeHandler) {
        this.boardButton=boardButton;
        this.boardButtonKey=boardButtonKey;
        this.aiHandler=aiHandler;
        this.themeHandler = themeHandler;
        gameEnd = new GameEnd(this.boardButtonKey);
        boardManagement = new BoardManagement(boardButton,boardButtonKey);
        player = new Player(this.boardButton, this.boardButtonKey, this.themeHandler);
    }

    public void playerResponse(int row, int column){
        player.playerMove(row,column);
    }

    public void AiResponse(){
        aiHandler.getAi().AImove();
    }

    public boolean AiNotPrepared(){
        if(aiHandler.getAi()==null)
            return true;
        return false;
    }

    public boolean searchForWinner(){
        if(gameEnd.identifyWinner()) {
            boardManagement.freezeBoard();
            return true;
        }
        return false;
    }

    public void singleRoundConduct(int row, int column){
        if(searchForWinner())return;
        playerResponse(row,column);
        if(searchForWinner())return;
        AiResponse();
    }

}
