package com.company.UnitTest;

import com.company.Theme.*;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class ThemeTest {
    @Test
    public void getColorTest(){
        Theme theme1 = new ClassicTheme();
        Assert.assertEquals(Color.white,theme1.getBackgroundColor());
        Assert.assertEquals(Color.black,theme1.getBorderColor());

        Theme theme2 = new HighContrastTheme();
        Assert.assertEquals(Color.lightGray,theme2.getBorderColor());
        Assert.assertEquals(Color.darkGray,theme2.getBackgroundColor());

        Theme theme3 = new ForestTheme();
        Assert.assertEquals(new Color(50,150,50),theme3.getBackgroundColor());
        Assert.assertEquals(new Color(100,180,100),theme3.getBorderColor());
    }
}
