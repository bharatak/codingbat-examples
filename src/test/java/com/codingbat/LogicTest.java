package com.codingbat;

import junit.framework.TestCase;
import org.junit.Test;

public class LogicTest extends TestCase {

  @Test
  public void testCigarParty1() {
    Logic logic = new Logic();
    assertFalse(logic.cigarParty(30, false));
  }

  @Test
  public void testCigarParty2() {
    Logic logic = new Logic();
    assertTrue(logic.cigarParty(50, false));
  }

  @Test
  public void testCigarParty3() {
    Logic logic = new Logic();
    assertTrue(logic.cigarParty(70, true));
  }
}
