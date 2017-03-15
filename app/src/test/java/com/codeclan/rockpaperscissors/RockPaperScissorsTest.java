package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class RockPaperScissorsTest {

    RockPaperScissors game;

    @Before
    public void before(){
        game = new RockPaperScissors();
    }

    @Test
    public void computerMakesChoice(){
        String computerChoice = game.computerChoice();
        assertNotNull(computerChoice);
    }

    @Test
    public void testCompareHands(){

        assertNotNull(game.compareHands("rock"));
    }

}