package com.egc.demoMVN;
import org.apache.commons.math3.ode.MainStateJacobianProvider;

import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testCadena(){
    	assertEquals("Mi nombre es Antonio Angel", App.imprimeCadena("Mi nombre es Antonio Angel"));
    }
    
    public void testSuma(){
    	assertEquals(10, App.sumaNumeros(5, 5));
    }
    
    public void testJgrapht(){
    	UndirectedGraph<String, DefaultEdge> g =
                new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

            String v1 = "v1";
            String v2 = "v2";
            String v3 = "v3";
            String v4 = "v4";

            // add the vertices
            g.addVertex(v1);
            g.addVertex(v2);
            g.addVertex(v3);
            g.addVertex(v4);

            // add edges to create a circuit
            g.addEdge(v1, v2);
            g.addEdge(v2, v3);
            g.addEdge(v3, v4);
            g.addEdge(v4, v1);
            assertTrue(g!=null);
    }
    
    public void testMath(){
    	MainStateJacobianProvider r = null;
    }
    
}
