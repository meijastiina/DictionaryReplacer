/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katadictionaryreplacer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meija
 */
public class KataDictionaryReplacerTest {
    private KataDictionaryReplacer replacer;
    private Dictionary dictionary;
    
    
    public KataDictionaryReplacerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dictionary = new Dictionary();
        replacer = new KataDictionaryReplacer();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class KataDictionaryReplacer.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        KataDictionaryReplacer.main(args);
    }
    
    /**
     * Test of empty output
     */
    @Test
    public void testEmpty(){
        dictionary.put("","");
        String expectedVal = "";
        String retVal = replacer.replace("", dictionary);
        assertEquals(expectedVal, retVal);
    }
    
    /**
     * Test one string to replace
     */
    @Test
    public void testReplaceOneString(){
        dictionary.put("temp", "temporary" );
        String retVal = "";
        String expectedVal = "temporary";
        retVal = replacer.replace("$temp$", dictionary);
        assertEquals(expectedVal, retVal);
    }
    
    /**
     * Test multiple strings to replace
     */
    @Test
    public void testReplaceMultipleStrings() {
        dictionary.put("temp", "temporary" );
        dictionary.put("name", "John Doe");
        String expectedVal = "temporary here comes the name John Doe";
        String retVal = replacer.replace("$temp$ here comes the name $name$", dictionary);
        assertEquals(expectedVal, retVal);
    }
}
