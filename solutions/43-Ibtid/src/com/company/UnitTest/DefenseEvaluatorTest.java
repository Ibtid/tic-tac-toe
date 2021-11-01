package com.company.UnitTest;

import com.company.AI.DefenseEvaluator;
import org.junit.Assert;
import org.junit.Test;

public class DefenseEvaluatorTest {
    @Test
    public  void checkIfRowIsDefendableTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[1][0]="Player";
        boardButtonKey[1][1]="Player";
        boardButtonKey[1][2]="";
        DefenseEvaluator defenseEvaluator = new DefenseEvaluator(boardButtonKey);
        Assert.assertTrue(defenseEvaluator.checkIfRowIsDefendable());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[1][0]="Player";
        boardButtonKey1[1][1]="";
        boardButtonKey1[1][2]="Player";
        DefenseEvaluator defenseEvaluator1 = new DefenseEvaluator(boardButtonKey1);
        Assert.assertTrue(defenseEvaluator1.checkIfRowIsDefendable());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2[1][0]="Player";
        boardButtonKey2[1][1]="";
        boardButtonKey2[1][2]="";
        DefenseEvaluator defenseEvaluator2 = new DefenseEvaluator(boardButtonKey2);
        Assert.assertFalse(defenseEvaluator2.checkIfRowIsDefendable());
    }
    @Test
    public  void checkIfColumnIsDefendableTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[0][1]="Player";
        boardButtonKey[1][1]="Player";
        boardButtonKey[2][1]="";
        DefenseEvaluator defenseEvaluator = new DefenseEvaluator(boardButtonKey);
        Assert.assertTrue(defenseEvaluator.checkIfColumnIsDefendable());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[0][1]="Player";
        boardButtonKey1[1][1]="";
        boardButtonKey1[2][1]="Player";
        DefenseEvaluator defenseEvaluator1 = new DefenseEvaluator(boardButtonKey1);
        Assert.assertTrue(defenseEvaluator1.checkIfColumnIsDefendable());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2[0][1]="Player";
        boardButtonKey2[1][1]="";
        boardButtonKey2[2][1]="";
        DefenseEvaluator defenseEvaluator2 = new DefenseEvaluator(boardButtonKey2);
        Assert.assertFalse(defenseEvaluator2.checkIfColumnIsDefendable());
    }
    @Test
    public  void checkIfDiagonalIsDefendableTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[2][0]="Player";
        boardButtonKey[1][1]="Player";
        boardButtonKey[0][2]="";
        DefenseEvaluator defenseEvaluator = new DefenseEvaluator(boardButtonKey);
        Assert.assertTrue(defenseEvaluator.checkIfDiagonalIsDefendable());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[0][0]="Player";
        boardButtonKey1[1][1]="";
        boardButtonKey1[2][2]="Player";
        DefenseEvaluator defenseEvaluator1 = new DefenseEvaluator(boardButtonKey1);
        Assert.assertTrue(defenseEvaluator1.checkIfDiagonalIsDefendable());

        String[][] boardButtonKey2 = new String[3][3];
        boardButtonKey2[0][0]="Player";
        boardButtonKey2[1][1]="";
        boardButtonKey2[2][2]="";
        DefenseEvaluator defenseEvaluator2 = new DefenseEvaluator(boardButtonKey2);
        Assert.assertFalse(defenseEvaluator2.checkIfDiagonalIsDefendable());
    }

    @Test
    public void positionCanBeDefendedTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[0][1]="Player";
        boardButtonKey[1][1]="Player";
        boardButtonKey[2][1]="";
        DefenseEvaluator defenseEvaluator = new DefenseEvaluator(boardButtonKey);
        Assert.assertTrue(defenseEvaluator.positionCanBeDefended());

        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[0][0]="Player";
        boardButtonKey1[1][1]="";
        boardButtonKey1[2][2]="Player";
        DefenseEvaluator defenseEvaluator1 = new DefenseEvaluator(boardButtonKey1);
        Assert.assertTrue(defenseEvaluator1.positionCanBeDefended());
    }

    @Test
    public void checkIfFirstDiagonalCanBeDefendedTest(){
        String[][] boardButtonKey1 = new String[3][3];
        boardButtonKey1[0][0]="Player";
        boardButtonKey1[1][1]="";
        boardButtonKey1[2][2]="Player";
        DefenseEvaluator defenseEvaluator1 = new DefenseEvaluator(boardButtonKey1);
        Assert.assertTrue(defenseEvaluator1.checkIfFirstDiagonalIsDefendable());
    }

    @Test
    public void checkIfSecondDiagonalCanBeDefendedTest(){
        String[][] boardButtonKey = new String[3][3];
        boardButtonKey[2][0]="Player";
        boardButtonKey[1][1]="Player";
        boardButtonKey[0][2]="";
        DefenseEvaluator defenseEvaluator = new DefenseEvaluator(boardButtonKey);
        Assert.assertTrue(defenseEvaluator.checkIfSecondDiagonalIsDefendable());
    }
}
