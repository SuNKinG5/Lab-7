package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.CountWordClumps;

class CoverageTest {
	
	@ParameterizedTest
	@MethodSource("usedArrays")
	void test_Branch_and_Condition_Coverage(int[] set, int expected) {
		assertEquals(expected, CountWordClumps.countClumps(set));
	}
	
	static Stream<Arguments> usedArrays() {
		return Stream.of(
				//Arguments.of(null, 0)
				//Arguments.of(new int[] {}, 0)
				//Arguments.of(new int[] {1,2}, 0)
				Arguments.of(new int[] {0,0,0}, 1)
				//Arguments.of(new int[] {1,1,0,2,2}, 2)
		);
	}
	
}
