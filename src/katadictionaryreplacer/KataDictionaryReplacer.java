/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katadictionaryreplacer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Meija
 */
public class KataDictionaryReplacer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public String replace(String stringToReplace, Dictionary dictionary) {
        Pattern MY_PATTERN = Pattern.compile("\\$(.*?)\\$"); 
        String retVal = stringToReplace;
        Matcher m = MY_PATTERN.matcher(stringToReplace);
            while (m.find()) {
                String s = m.group(1);
                String temp = "$" + s + "$";
                retVal = retVal.replace(temp, dictionary.getValByKey(s));
            }
        return retVal;
    }
    
}
