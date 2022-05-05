/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
 
/**
 *
 * @author chloe
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
 
public class SaveableDictionary {
 
    private HashMap<String, String> dictionary;
    private ArrayList<String> keys;
    private String file;
    private Scanner scanner = new Scanner(System.in);
 
    public SaveableDictionary() {
        dictionary = new HashMap<>();
        keys = new ArrayList<>();
    }
 
    public SaveableDictionary(String file) {
        this.file = file;
        dictionary = new HashMap<>();
        keys = new ArrayList<>();
    }
 
    public boolean load() {
        try {
            File fileToRead = new File(file);
 
            scanner = new Scanner(fileToRead);
 
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
 
                String[] parts = line.split(":");
                dictionary.put(parts[0], parts[1]);
                keys.add(parts[0]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("There was an issue when trying to load the file: " + e);
            return false;
        }
    }
 
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
 
            dictionary.forEach((key, value) -> {
                writer.println(key + ":" + value);
            });
            writer.close();
            return true;
            
        } catch (Exception e) {
            System.out.println("Something went wrong. The file was not saved.");
            return false;
        }
    }
 
    public void add(String words, String translation) {
        if (dictionary.containsKey(words)) {
            return;
        } else {
            dictionary.put(words, translation);
            keys.add(words);
        }
    }
 
    public String translate(String word) {
 
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
 
        if (dictionary.containsValue(word)) {
            for (int i = 0; i < dictionary.size(); i++) {
                if (dictionary.get(keys.get(i)).equals(word)) {
                    return keys.get(i);
                }
            }
        }
        return null;
    }
 
    public void delete(String word) {
 
        if (dictionary.containsKey(word)) {
            keys.remove(word);
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) {
            for (int i = 0; i < dictionary.size(); i++) {
                if (dictionary.get(keys.get(i)).equals(word)) {
                    String key = keys.get(i);
                    dictionary.remove(keys.get(i));
                }
            }
        } else {
            System.out.println("null");
        }
    }
}