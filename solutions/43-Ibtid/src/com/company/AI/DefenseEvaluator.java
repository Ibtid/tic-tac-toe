package com.company.AI;

public class DefenseEvaluator {
    String[][] boardButtonKey;
    boolean positionNeedToBeDefended[][] = new boolean[3][3];

    public DefenseEvaluator(String[][] boardButtonKey){
        this.boardButtonKey = boardButtonKey;
    }

    void setPositionNeedToBeDefendedToFalse(){
        for(int row = 0; row<3; row++){
            for(int column = 0; column<3; column++){
                positionNeedToBeDefended[row][column] = false;
            }
        }
    }

    public boolean positionCanBeDefended(){
        if(checkIfDiagonalIsDefendable()|| checkIfColumnIsDefendable()|| checkIfRowIsDefendable())
            return true;
        return false;
    }

    public boolean checkIfRowIsDefendable(){
        for(int row = 0; row<3; row++){
            if(boardButtonKey[row][0]=="Player" && boardButtonKey[row][1]=="Player" && boardButtonKey[row][2]=="") {
                positionNeedToBeDefended[row][2] = true;
                return true;
            }
            if(boardButtonKey[row][0] == "Player" && boardButtonKey[row][1] == "" && boardButtonKey[row][2]=="Player"){
                positionNeedToBeDefended[row][1] = true;
                return  true;
            }
            if(boardButtonKey[row][0]=="" && boardButtonKey[row][1]=="Player" && boardButtonKey[row][2]=="Player"){
                positionNeedToBeDefended[row][0] = true;
                return true;
            }
            setPositionNeedToBeDefendedToFalse();
        }
        return false;
    }


    public boolean checkIfColumnIsDefendable(){
        for(int column = 0; column<3; column++){
            if(boardButtonKey[0][column]=="Player" && boardButtonKey[1][column]=="Player" && boardButtonKey[2][column]=="") {
                positionNeedToBeDefended[2][column] = true;
                return true;
            }
            if(boardButtonKey[0][column]=="" && boardButtonKey[1][column]=="Player" && boardButtonKey[2][column]=="Player") {
                positionNeedToBeDefended[0][column] = true;
                return true;
            }
            if(boardButtonKey[0][column]=="Player" && boardButtonKey[1][column]=="" && boardButtonKey[2][column]=="Player") {
                positionNeedToBeDefended[1][column] = true;
                return true;
            }
            setPositionNeedToBeDefendedToFalse();
        }
        return false;
    }


    public boolean checkIfDiagonalIsDefendable() {
        if(checkIfFirstDiagonalIsDefendable())return true;
        if(checkIfSecondDiagonalIsDefendable())return true;
        setPositionNeedToBeDefendedToFalse();
        return false;
    }

    public boolean checkIfFirstDiagonalIsDefendable(){
        if (boardButtonKey[0][0] == "Player" && boardButtonKey[1][1] == "" && boardButtonKey[2][2] == "Player") {
            positionNeedToBeDefended[1][1] = true;
            return true;
        }
        if (boardButtonKey[0][0] == "Player" && boardButtonKey[1][1] == "Player" && boardButtonKey[2][2] == "") {
            positionNeedToBeDefended[2][2] = true;
            return true;
        }
        if (boardButtonKey[0][0] == "" && boardButtonKey[1][1] == "Player" && boardButtonKey[2][2] == "Player") {
            positionNeedToBeDefended[0][0] = true;
            return true;
        }
        return false;
    }

    public boolean checkIfSecondDiagonalIsDefendable(){
        if (boardButtonKey[0][2] == "Player" && boardButtonKey[1][1] == "" && boardButtonKey[2][0] == "Player") {
            positionNeedToBeDefended[1][1] = true;
            return true;
        }
        if (boardButtonKey[0][2] == "Player" && boardButtonKey[1][1] == "Player" && boardButtonKey[2][0] == "") {
            positionNeedToBeDefended[2][0] = true;
            return true;
        }
        if (boardButtonKey[0][2] == "" && boardButtonKey[1][1] == "Player" && boardButtonKey[2][0] == "Player") {
            positionNeedToBeDefended[0][2] = true;
            return true;
        }
        return false;
    }
}
