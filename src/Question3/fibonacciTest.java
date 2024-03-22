package Question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class fibonacciTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

    @Test
    public void testDisplayFibonacciSeriesWith5Terms() {
        String expectedOutput = "0, 1, 1, 2, 3";
        assertEquals(expectedOutput, getFibonacciSeriesOutput(5));
    }

    @Test
    public void testDisplayFibonacciSeriesWith10Terms() {
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34";
        assertEquals(expectedOutput, getFibonacciSeriesOutput(10));
    }

    private String getFibonacciSeriesOutput(int n) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        fibonacciTest.displayFibonacciSeries(n);
        return outContent.toString().trim();
    }

	private static void displayFibonacciSeries(int n) {
		// TODO Auto-generated method stub
		
	}
}