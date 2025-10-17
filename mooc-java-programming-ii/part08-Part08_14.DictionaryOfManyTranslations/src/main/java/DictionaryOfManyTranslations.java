
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author salma
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> map;

    public DictionaryOfManyTranslations() {
        this.map = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.map.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> list = this.map.get(word);
        list.add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (this.map.containsKey(word)) {
            return this.map.get(word);
        }

        ArrayList<String> emptyList = new ArrayList<>();
        return emptyList;
    }

    public void remove(String word) {
        this.map.remove(word);
    }
}
