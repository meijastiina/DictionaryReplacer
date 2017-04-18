package katadictionaryreplacer;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meija
 */
public class Dictionary {
    private final List<DictionaryItem> items;

    public Dictionary() {
        this.items = new ArrayList<>();
    }
    public void put(String key, String value) {
        DictionaryItem item = new DictionaryItem(key, value);
        this.items.add(item);
    }
    public String getValByKey(String key) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getKey().contains(key)) {
                return items.get(i).getVal();
            }
        }
        return "-1";
    }
}
