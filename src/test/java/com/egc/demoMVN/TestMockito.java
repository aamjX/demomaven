package com.egc.demoMVN;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;


public class TestMockito  {

	@Test
	public void test1()  {
	        //  Crear mock
	        App test = Mockito.mock(App.class);

	        // Define el valor a devoler del método
	        when(test.dameUnValor()).thenReturn(10);

	        System.out.println((test.dameUnValor()));
	}
}