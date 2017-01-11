package com.egc.demoMVN;
import com.google.gson.Gson;
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
        
        System.out.println("----------------");
        Gson gson = new Gson();
        System.out.println("Probando gson");
        System.out.println("-----------------");
        
    }
    
    public static String imprimeCadena(String cadena){
    	return cadena;
    }
    
    public static int sumaNumeros(int a , int b){
    	return a + b;
    }
    
    public int dameUnValor(){
    	return 10;
    }
}
