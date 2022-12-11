
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithms.BubbelSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;

public class test {

	InsertionSort<Integer> inse;
	BubbelSort<Integer> bubbel;
	MergeSort<Integer> merg;
	int[] arr = { 1, 29, 2, 45, 63, 20, 5, 7 };
	List<Integer> sorted = new ArrayList<>();
	List<Integer> list;

	@BeforeEach
	void setUp() throws Exception {
		inse = new InsertionSort<>();
		bubbel = new BubbelSort<>();
		merg = new MergeSort<>();
		list = new ArrayList<>();
		sorted.addAll(Arrays.asList(1, 2, 5, 7, 20, 29, 45, 63));
		for (int r : arr) {
			list.add(r);
		}

	}

	@AfterEach
	void tearDown() throws Exception {
		list = null;
	}

	@Test
	void testInsertion() {
		inse.sort(list);
		assertEquals(sorted, list);
	}

	@Test
	void testBubbelSort() {
		bubbel.sort(list);
		assertEquals(sorted, list);
	}

	@Test
	void testMergeSort() {
		merg.sort(list);
		assertEquals(sorted, list);
	}

}

