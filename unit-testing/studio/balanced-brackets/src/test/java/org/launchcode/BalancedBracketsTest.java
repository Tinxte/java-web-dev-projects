package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsAroundStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balancedBracketsAroundSecondWordTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedBracketsBeforeStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balancedBracketsEmptyStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void balancedBracketsEmptyBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsOpenLeftBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void balancedBracketsOpenLeftAndRightBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }


    @Test
    public void balancedBracketsSingleLeftBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

   @Test
    public void balancedBracketsSingleLeftRightBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}