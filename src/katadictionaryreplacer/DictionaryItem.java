package katadictionaryreplacer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meija
 */
public class DictionaryItem {
    String key;
    String value;
    
    public DictionaryItem(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getVal() {
        return this.value;
    }
    public String getKey(){
        return this.key;
    }
    
}
