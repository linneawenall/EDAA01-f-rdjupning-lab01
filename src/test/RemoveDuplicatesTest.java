package test;

import static org.junit.Assert.*;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import set.ArraySet;
import set.RemoveDuplicates;

public class RemoveDuplicatesTest {
	private RemoveDuplicates rd;

	@Before
	public void setUp() throws Exception {
		rd = null;
	}

	@After
	public void tearDown() throws Exception {
		rd = null;
	}

	@Test
	public final void testNullPointer() {
		try {
			int[] i = rd.uniqueElements(null);
			fail("uniqueElements should catch NullPointerException");
		} catch (NullPointerException e) {
		}
	}

	@Test
	public final void testEmptySet() {
		int[] ints = new int[5];
		int[] sortedInts = rd.uniqueElements(ints);
		assertEquals("uniqeElements should return 1", 1, sortedInts.length);
	}

	@Test
	public final void testSingleElements() {
		int[] ints = new int[1];
		ints[0] = 1;
		int[] sortedInts = rd.uniqueElements(ints);
		assertEquals("uniqueElements should return one element", 1, sortedInts[0]);
	}

	@Test
	public final void testDuplicateElements() {
		int[] ints = new int[20];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = 1;
		}
		int[] sortedInts = rd.uniqueElements(ints);
		assertEquals("uniqueElements should return one element", 1, sortedInts[0]);
	}

	@Test
	public final void testDifferentElements() {
		int[] ints = new int[10];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = i + 1;
		}
		int[] sortedInts = rd.uniqueElements(ints);
		assertEquals("uniqueElements should return a sorted list", ints, sortedInts);
	}
}
