package com.veytel.ood.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class EagerInitializedSingletonTest {

	@Test
	public void testGetInstance() {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = EagerInitializedSingleton.getInstance();
		assertEquals("The instances should be equal.", instanceOne, instanceTwo);
	}

}
