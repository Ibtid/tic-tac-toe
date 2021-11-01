package com.company.UnitTest;

import com.company.AI.RandomPosition;
import org.junit.Assert;
import org.junit.Test;

public class RandomPositionTest {
    @Test
    public void uniquePositionTest(){
        RandomPosition randomPosition = new RandomPosition();
        randomPosition.previousColumn = 2;
        randomPosition.previousRow = 2;
        randomPosition.row=2;
        randomPosition.column=2;
        Assert.assertFalse(randomPosition.checkIfThePositionIsUnique());
    }
}
