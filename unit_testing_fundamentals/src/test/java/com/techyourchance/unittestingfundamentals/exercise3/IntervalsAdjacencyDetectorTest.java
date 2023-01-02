package com.techyourchance.unittestingfundamentals.exercise3;

import static org.hamcrest.CoreMatchers.is;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector SUT;

    @Before
    public void setup(){
        SUT = new IntervalsAdjacencyDetector();
    }

    @Test
    public void isAdjacent_givenIntervalOneIsSimilarTofIntervalTwo_thenReturnFalse(){

        //Given
        Interval intervalOne = new Interval(1,3);
        Interval intervalTwo = new Interval(1,3);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_givenIntervalOneIsAdjacentInStartOfIntervalTwo_thenReturnTrue(){

        //Given
        Interval intervalOne = new Interval(1,3);
        Interval intervalTwo = new Interval(3,5);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isAdjacent_givenIntervalOneIsAdjacentInEndOfIntervalTwo_thenReturnTrue(){

        //Given
        Interval intervalOne = new Interval(5,7);
        Interval intervalTwo = new Interval(3,5);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isAdjacent_givenIntervalOneIsBeforeIntervalTwo_thenReturnFalse(){

        //Given
        Interval intervalOne = new Interval(1,3);
        Interval intervalTwo = new Interval(4,5);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_givenIntervalOneIsAfterIntervalTwo_thenReturnFalse(){

        //Given
        Interval intervalOne = new Interval(6,7);
        Interval intervalTwo = new Interval(4,5);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_givenIntervalOneOverlapsWithIntervalTwoStart_thenReturnFalse(){

        //Given
        Interval intervalOne = new Interval(1,4);
        Interval intervalTwo = new Interval(3,5);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_givenIntervalOneOverlapsWithIntervalTwoEnd_thenReturnFalse(){

        //Given
        Interval intervalOne = new Interval(4,6);
        Interval intervalTwo = new Interval(3,5);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_givenIntervalOneContainsIntervalTwo_thenReturnFalse(){

        //Given
        Interval intervalOne = new Interval(1,10);
        Interval intervalTwo = new Interval(3,5);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(false));
    }

    @Test
    public void isAdjacent_givenIntervalTwoContainsIntervalOne_thenReturnFalse(){

        //Given
        Interval intervalOne = new Interval(5,7);
        Interval intervalTwo = new Interval(1,10);

        //When
        Boolean result = SUT.isAdjacent(intervalOne, intervalTwo);

        //Then
        Assert.assertThat(result, is(false));
    }

}
