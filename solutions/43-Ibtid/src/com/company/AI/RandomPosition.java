package com.company.AI;

import java.util.Random;

public class RandomPosition {
    Random random = new Random();
    public int column;
    public int row;
    public int previousColumn;
    public int previousRow;

    public RandomPosition(){
    }

    int randomColumnGenerator(){
        return column = random.nextInt(3);
    }

    int randomRowGenerator(){
        return row = random.nextInt(3);
    }

    void createUniquePosition(){
        while(true){
            previousColumn = randomColumnGenerator();
            previousRow = randomRowGenerator();
            randomRowGenerator();
            randomColumnGenerator();
            if (!checkIfThePositionIsUnique()) {
                continue;
            }else
                break;
        }
    }

    public boolean checkIfThePositionIsUnique(){
        if ((previousColumn == column && previousRow == row))
            return false;
        return true;
    }


}
