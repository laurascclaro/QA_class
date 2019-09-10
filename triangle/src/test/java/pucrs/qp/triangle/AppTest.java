package pucrs.qp.triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
   
    public AppTest( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
  
    public void testApp()
    {
        assertTrue( true );
    }
    
    
}
