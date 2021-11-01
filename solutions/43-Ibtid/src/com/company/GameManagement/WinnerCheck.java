package com.company.GameManagement;

public class WinnerCheck {
    String[][] boardButtonKey;
    public WinnerCheck(String[][] boardButtonKey){
        this.boardButtonKey = boardButtonKey;
    }
    public boolean winInRow(int row){
        if (boardButtonKey[row][0] == boardButtonKey[row][1] &&
                boardButtonKey[row][2] == boardButtonKey[row][0] &&
                boardButtonKey[row][0]!="") {
            return true;
        }
        return false;
    }

    public boolean playerWinInRow(){
        for(int row=0; row<3; row++){
            if(winInRow(row) && boardButtonKey[row][0]=="Player")return true;
        }
        return false;
    }

    public boolean aiWinInRow(){
        for(int row=0; row<3; row++){
            if(winInRow(row) && boardButtonKey[row][0]=="Ai")return true;
        }
        return false;
    }

    public boolean winInColumn(int column){
        if (boardButtonKey[0][column] == boardButtonKey[1][column] &&
                boardButtonKey[2][column] == boardButtonKey[0][column] &&
                boardButtonKey[0][column]!="") {
            return true;
        }

        return false;
    }

    public boolean playerWinInColumn(){
        for(int column=0; column<3; column++){
            if(winInColumn(column) && boardButtonKey[0][column]=="Player")return true;
        }
        return false;
    }

    public boolean aiWinInColumn(){
        for(int column=0; column<3; column++){
            if(winInColumn(column) && boardButtonKey[0][column]=="Ai") return true;
        }
        return false;
    }

    public boolean winInDiagonal(){
        if(boardButtonKey[1][1]!=""){
            if (boardButtonKey[0][0] == boardButtonKey[1][1] && boardButtonKey[2][2]==boardButtonKey[1][1]){
                return true;
            }
            if (boardButtonKey[2][0]==boardButtonKey[1][1] && boardButtonKey[0][2]==boardButtonKey[1][1]){
                return true;
            }
        }
        return false;
    }

    public boolean playerWinInDiagonal(){
        if(winInDiagonal() && boardButtonKey[1][1] == "Player")return true;
        return false;
    }

    public boolean aiWinInDiagonal(){
        if(winInDiagonal() && boardButtonKey[1][1] == "Ai")return true;
        return false;
    }
}
