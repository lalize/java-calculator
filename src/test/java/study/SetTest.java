package study;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
	private Set numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@Test
	@DisplayName("size 테스트")
	void size() {
		int size = numbers.size();
		assertThat(size).isEqualTo(3);
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	@DisplayName("contains 테스트")
	void contains(int input) {
		assertThat(numbers.contains(input)).isTrue();
	}

	@ParameterizedTest
	@CsvSource(value = {"1,true", "2,true", "3,true", "4,false"})
	@DisplayName("contains 참이 아닌 경우도 같이 테스트")
	void containsOrNot(int input, boolean expected) {
		assertThat(numbers.contains(input)).isEqualTo(expected);
	}
}
