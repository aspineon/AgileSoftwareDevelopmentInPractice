package de.kimminich.agile.lecture27.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CollectionMatcherDemoTest {

	@Test
	public void shouldCombineSimpleMatchers() {
		// when
		int result = 2;
		// then
		assertThat(result, is(not(0)));
		assertThat(result, is(both(greaterThan(1)).and(lessThan(3))));
	}

	@Test
	public void shouldCombineCollectionMatchers() {
		// when
		List<Integer> result = Arrays.asList(1, 2);
		// then
		assertThat(result, hasItem(anyOf(equalTo(1), equalTo(2))));
		assertThat(result, hasItem(allOf(equalTo(1), equalTo(2))));

	}

}
