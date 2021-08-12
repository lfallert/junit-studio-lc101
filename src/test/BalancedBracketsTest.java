package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

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
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void returnsTrueIfStringWithBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void returnsFalseIfStringHasNoBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void returnsFalseIfMultipleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }

    //I am so sorry for this test name, I was tired
    @Test
    public void returnsFalseIfMultipleBracketsButInOpposite() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }

    @Test
    public void returnsTrueIfBracketsInWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[C]ode"));
    }

    @Test
    public void returnsFalseIfReverseBracketsInString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    @Test
    public void returnsTrueIfDoubleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void returnsTrueWithSpecialCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[%%%]"));
    }

    @Test
    public void returnsTrueIfEmpty() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void returnsFalseIfOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void returnsTrueIfAllTheBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }


}
