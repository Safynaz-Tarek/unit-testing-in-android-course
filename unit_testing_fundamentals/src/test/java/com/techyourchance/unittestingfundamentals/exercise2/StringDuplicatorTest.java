package com.techyourchance.unittestingfundamentals.exercise2;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringDuplicatorTest {
    StringDuplicator SUT;

    @Before
    public void setup(){
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_givenStringOfOneCharacter_thenReturnStringOfTwoCharacters(){
        String result = SUT.duplicate("a");
        Assert.assertThat(result, is("aa"));
    }

    @Test
    public void duplicate_givenEmptyString_thenReturnEmptyString(){
        String result = SUT.duplicate("");
        Assert.assertThat(result, is(""));
    }

    @Test
    public void duplicate_givenStringWithCapitalCharactersAndSpaces_thenReturnSameStringRepeatedTwice(){
        String result = SUT.duplicate("This Is A Test String !");
        Assert.assertThat(result, is("This Is A Test String !This Is A Test String !"));
    }

}
