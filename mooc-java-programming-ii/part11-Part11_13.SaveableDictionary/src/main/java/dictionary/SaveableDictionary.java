package dictionary;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author salma
 */
public class SaveableDictionary {

    private HashMap<String, String> dictToFrom;
    private HashMap<String, String> dictFromTo;
    private String file;

    //first constructor
    public SaveableDictionary() {
        this.dictFromTo = new HashMap<>();
        this.dictToFrom = new HashMap<>();
    }

    // Overloaded constructor for reading from files.
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String txt : this.dictFromTo.keySet()) {
                writer.println(txt + ":" + this.dictFromTo.get(txt));
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        dictFromTo.putIfAbsent(word, translation);
        dictToFrom.putIfAbsent(translation, word);
    }

    public String translate(String Word) {
        if (dictFromTo.containsKey(Word)) {
            return dictFromTo.get(Word);
        }
        return dictToFrom.get(Word);
    }

    public void delete(String word) {
        String firstTranslation = this.dictFromTo.get(word);
        this.dictFromTo.remove(word);
        this.dictToFrom.remove(firstTranslation);
        String secondTranslation = this.dictToFrom.get(word);
        this.dictToFrom.remove(word);
        this.dictFromTo.remove(secondTranslation);

    }

}
