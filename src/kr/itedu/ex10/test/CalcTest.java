package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(30, Calc.sum(10, 20));
		assertEquals(17, Calc.sum(12, 5));
		assertEquals(10, Calc.sum(5, 5));
	}

}
