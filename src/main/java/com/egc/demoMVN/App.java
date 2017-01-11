package com.egc.demoMVN;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 3;
        int b = 2;
        
        int suma = sumaNumeros(a, b);
        
    	System.out.println( "Hello World!" );
        System.out.println(imprimeCadena("Mi nombre es Antonio Angel"));
        System.out.println(suma);
        
    }
    
    public static String imprimeCadena(String cadena){
    	return cadena;
    }
    
    public static int sumaNumeros(int a , int b){
    	return a + b;
    }
}
