package day02.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumbersTest {

	PerfectNumbers perfectNumbers;

	@BeforeEach
	void setUp() {
		perfectNumbers = new PerfectNumbers();
	}

	@Test
	void checkValidPerfectNumber() {
		assertTrue(perfectNumbers.isPerfectNumber(6));
		assertTrue(perfectNumbers.isPerfectNumber(8128));
	}

	@Test
	void checkInvalidPerfectNumber() {
		//assertTrue(!perfectNumbers.isPerfectNumber(36));
		assertFalse(perfectNumbers.isPerfectNumber(36));
		assertFalse(perfectNumbers.isPerfectNumber(88));
	}
}
