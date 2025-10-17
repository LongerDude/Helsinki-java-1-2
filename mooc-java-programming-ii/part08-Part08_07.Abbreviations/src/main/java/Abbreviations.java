
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
public class Abbreviations {

    private HashMap<String, String> map;

    public Abbreviations() {
        this.map = new HashMap<>();
    }

    public String cleanString(String text) {
        String item = text.toLowerCase();
        item = item.trim();
        return item;
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.map.containsKey(cleanString(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        
        return this.map.get(cleanString(abbreviation)); // todo
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.map.put(cleanString(abbreviation), explanation);
    }
}
