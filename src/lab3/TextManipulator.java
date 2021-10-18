package lab3;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextManipulator {

    public static String wordAndSentenceCounter(String text) {

        int nrOfSent = 0;
        int nrOfWords = 0;

        // assuming the string is formatted properly
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')  nrOfWords++;
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') nrOfSent++;
        }

        return "String has " + nrOfSent + " sentence(s) and " + nrOfWords + " word(s).";
    }

    public static String letterCounter (String text) {

        int nrOfLetters = 0;
        int nrOfVowels = 0;
        Pattern patternLetters = Pattern.compile("([aeiouAEIOU])|([a-zA-Z])");
        // could probably be made easier but I wanted to play with regexes
        // for myself: first in the pattern (before the OR) must be [aeiouyAEIOUY] because otherwise
        // a letter would be found and the OR would return true, and the latter group(2) would always return null.
        Matcher matcherLetters = patternLetters.matcher(text);

        while (matcherLetters.find()) {
            nrOfLetters++;
            if (matcherLetters.group(1) != null) nrOfVowels++;
            // group 0 = whole pattern
        }

        return "String has " + nrOfLetters + " letter(s). String has " + nrOfVowels + " vowel(s). String has "
                + (nrOfLetters - nrOfVowels) + " consonant(s).";
}

    public static String wordInfo(String text) {

        Map<String, Integer> wordMap = new HashMap<>(); // map for counting word occ
        String longestWord = "", result;
        text = text.replaceAll("[,.;:!?]", ""); // remove all unnecessary symbols
        String[] words = text.split(" "); // form array of words

        for (String word : words) {
            wordMap.putIfAbsent(word, 1);
            wordMap.put(word, wordMap.get(word) + 1);
            if (word.length() > longestWord.length()) longestWord = word;
        }

        // create set of map entries, use that to create an arraylist
        List<Entry<String, Integer>> mapEntries = new ArrayList<>(wordMap.entrySet());

        // sort arraylist of map entries by entry value in reverse order
        mapEntries.sort(Entry.comparingByValue(Comparator.reverseOrder()));

        result = "Top 5 words are:\n";

        for (int i = 0; i < 5; i++) {
            result += mapEntries.get(i).getKey() + ", used " + mapEntries.get(i).getValue() + " times\n";
        }

        result += "Longest word is: " + longestWord;

        return result;
    }
}
