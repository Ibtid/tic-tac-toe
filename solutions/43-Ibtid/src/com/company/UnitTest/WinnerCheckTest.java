package com.company.UnitTest;

import com.company.GameManagement.GameEnd;
import com.company.GameManagement.WinnerCheck;
import org.junit.Assert;
import org.junit.Test;

public class WinnerCheckTest {
    @Test
    public void WinnerTest(){
        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[1][1] = "Player";
        boardButtonKey1[1][2] = "Player";
        boardButtonKey1[1][0] = "Player";
        GameEnd gameEnd = new GameEnd(boardButtonKey1);
        Assert.assertTrue(gameEnd.identifyWinner());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2[0][1] = "Ai";
        boardButtonKey2[1][1] = "Ai";
        boardButtonKey2[2][1] = "Ai";
        GameEnd gameEnd2 = new GameEnd(boardButtonKey2);
        Assert.assertTrue(gameEnd2.identifyWinner());
    }

    @Test
    public void winInRowTest(){
        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[1][1] = "Player";
        boardButtonKey1[1][2] = "Player";
        boardButtonKey1[1][0] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey1);
        Assert.assertTrue(winnerCheck.winInRow(1));

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2[1][1] = "Ai";
        boardButtonKey2[1][2] = "Ai";
        boardButtonKey2[1][0] = "Ai";
        WinnerCheck winnerCheck1 = new WinnerCheck(boardButtonKey2);
        Assert.assertTrue(winnerCheck1.winInRow(1));

        String[][] boardButtonKey3 = new String[3][3];
        boardButtonKey3[1][1] = "Ai";
        boardButtonKey3[1][2] = "Ai";
        boardButtonKey3[1][0] = "Player";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey3);
        Assert.assertFalse(winnerCheck2.winInRow(1));
    }

    @Test
    public void winInColumnTest(){
        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[1][1] = "Player";
        boardButtonKey1[2][1] = "Player";
        boardButtonKey1[0][1] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey1);
        Assert.assertTrue(winnerCheck.winInColumn(1));

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2[0][1] = "Ai";
        boardButtonKey2[1][1] = "Ai";
        boardButtonKey2[2][1] = "Ai";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey1);
        Assert.assertTrue(winnerCheck2.winInColumn(1));

        String[][] boardButtonKey3 = new String[3][3];
        boardButtonKey3[2][1] = "Ai";
        boardButtonKey3[1][1] = "Ai";
        boardButtonKey3[0][1] = "Player";
        WinnerCheck winnerCheck3 = new WinnerCheck(boardButtonKey3);
        Assert.assertFalse(winnerCheck3.winInColumn(1));
    }

    @Test
    public  void winInDiagonalTest(){
        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[1][1] = "Player";
        boardButtonKey1[0][0] = "Player";
        boardButtonKey1[2][2] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey1);
        Assert.assertTrue(winnerCheck.winInDiagonal());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2[0][2] = "Ai";
        boardButtonKey2[1][1] = "Ai";
        boardButtonKey2[2][0] = "Ai";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey2);
        Assert.assertTrue(winnerCheck2.winInDiagonal());

        String[][] boardButtonKey3 = new String[3][3];
        boardButtonKey3[1][1] = "Ai";
        boardButtonKey3[0][0] = "Ai";
        boardButtonKey3[2][2] = "Player";
        WinnerCheck winnerCheck3 = new WinnerCheck(boardButtonKey3);
        Assert.assertFalse(winnerCheck3.winInDiagonal());
    }

    @Test
    public void playerWinInRowTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[1][1] = "Player";
        boardButtonKey[1][2] = "Player";
        boardButtonKey[1][0] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey);
        Assert.assertTrue(winnerCheck.playerWinInRow());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1 [1][1] = "Ai";
        boardButtonKey1 [1][2] = "Ai";
        boardButtonKey1 [1][0] = "Ai";
        WinnerCheck winnerCheck1 = new WinnerCheck(boardButtonKey1);
        Assert.assertFalse(winnerCheck1.playerWinInRow());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [1][1] = "Player";
        boardButtonKey2 [1][2] = "Ai";
        boardButtonKey2 [1][0] = "Ai";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey2);
        Assert.assertFalse(winnerCheck2.playerWinInRow());
    }

    @Test
    public void playerWinInColumnTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[2][1] = "Player";
        boardButtonKey[1][1] = "Player";
        boardButtonKey[0][1] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey);
        Assert.assertTrue(winnerCheck.playerWinInColumn());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1 [2][1] = "Ai";
        boardButtonKey1 [1][1] = "Ai";
        boardButtonKey1 [0][1] = "Ai";
        WinnerCheck winnerCheck1 = new WinnerCheck(boardButtonKey1);
        Assert.assertFalse(winnerCheck1.playerWinInColumn());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [2][1] = "Player";
        boardButtonKey2 [1][1] = "Ai";
        boardButtonKey2 [0][1] = "Ai";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey2);
        Assert.assertFalse(winnerCheck2.playerWinInColumn());
    }
    @Test
    public void playerWinInDiagonalTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[1][1] = "Player";
        boardButtonKey[0][0] = "Player";
        boardButtonKey[2][2] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey);
        Assert.assertTrue(winnerCheck.playerWinInDiagonal());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1 [1][1] = "Ai";
        boardButtonKey1 [2][2] = "Ai";
        boardButtonKey1 [0][0] = "Ai";
        WinnerCheck winnerCheck1 = new WinnerCheck(boardButtonKey1);
        Assert.assertFalse(winnerCheck1.playerWinInDiagonal());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [1][1] = "Player";
        boardButtonKey2 [2][2] = "Ai";
        boardButtonKey2 [0][0] = "Ai";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey2);
        Assert.assertFalse(winnerCheck2.playerWinInDiagonal());
    }

    @Test
    public  void aiWinInRowTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[1][1] = "Player";
        boardButtonKey[1][2] = "Player";
        boardButtonKey[1][0] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey);
        Assert.assertFalse(winnerCheck.aiWinInRow());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1 [1][1] = "Ai";
        boardButtonKey1 [1][2] = "Ai";
        boardButtonKey1 [1][0] = "Ai";
        WinnerCheck winnerCheck1 = new WinnerCheck(boardButtonKey1);
        Assert.assertTrue(winnerCheck1.aiWinInRow());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [1][1] = "Player";
        boardButtonKey2 [1][2] = "Ai";
        boardButtonKey2 [1][0] = "Ai";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey2);
        Assert.assertFalse(winnerCheck2.aiWinInRow());
    }

    @Test
    public  void aiWinInColumnTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[0][1] = "Player";
        boardButtonKey[1][1] = "Player";
        boardButtonKey[2][1] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey);
        Assert.assertFalse(winnerCheck.aiWinInColumn());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1 [2][1] = "Ai";
        boardButtonKey1 [1][1] = "Ai";
        boardButtonKey1 [0][1] = "Ai";
        WinnerCheck winnerCheck1 = new WinnerCheck(boardButtonKey1);
        Assert.assertTrue(winnerCheck1.aiWinInColumn());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [2][1] = "Player";
        boardButtonKey2 [1][1] = "Ai";
        boardButtonKey2 [0][1] = "Ai";
        WinnerCheck winnerCheck2 = new WinnerCheck(boardButtonKey2);
        Assert.assertFalse(winnerCheck2.aiWinInColumn());
    }

    @Test
    public  void aiWinInDiagonalTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[0][0] = "Player";
        boardButtonKey[1][1] = "Player";
        boardButtonKey[2][2] = "Player";
        WinnerCheck winnerCheck = new WinnerCheck(boardButtonKey);
        Assert.assertFalse(winnerCheck.aiWinInDiagonal());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1 [2][2] = "Ai";
        boardButtonKey1 [1][1] = "Ai";
        boardButtonKey1 [0][0] = "Ai";
        WinnerCheck winnerCheck1 = new WinnerCheck(boardButtonKey1);
        Assert.assertTrue(winnerCheck1.aiWinInDiagonal());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2 [2][2] = "Player";
        boardButtonKey2 [1][1] = "Ai";
        boardButtonKey2 [0][0] = "Ai";
        WinnerCheck winnerCheck2 =new WinnerCheck(boardButtonKey2);
        Assert.assertFalse(winnerCheck2.aiWinInDiagonal());
    }
}
