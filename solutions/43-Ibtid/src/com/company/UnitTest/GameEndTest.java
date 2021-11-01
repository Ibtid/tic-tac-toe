package com.company.UnitTest;

import com.company.GameManagement.GameEnd;
import org.junit.Assert;
import org.junit.Test;

public class GameEndTest {
    @Test
    public void playerWinTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[1][1] = "Player";
        boardButtonKey[0][0] = "Player";
        boardButtonKey[2][2] = "Player";
        GameEnd gameEnd = new GameEnd(boardButtonKey);
        Assert.assertTrue(gameEnd.playerWin());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [1][1] = "Player";
        boardButtonKey2 [1][2] = "Ai";
        boardButtonKey2 [1][0] = "Ai";
        GameEnd gameEnd2 = new GameEnd(boardButtonKey2);
        Assert.assertFalse(gameEnd2.playerWin());
    }

    @Test
    public void aiWinTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[1][1] = "Player";
        boardButtonKey[0][0] = "Player";
        boardButtonKey[2][2] = "Player";
        GameEnd gameEnd = new GameEnd(boardButtonKey);
        Assert.assertFalse(gameEnd.aiWin());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [1][1] = "Ai";
        boardButtonKey2 [1][2] = "Ai";
        boardButtonKey2 [1][0] = "Ai";
        GameEnd gameEnd2 = new GameEnd(boardButtonKey2);
        Assert.assertTrue(gameEnd2.aiWin());
    }
}
