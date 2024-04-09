import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample string with some words. This string will be used to demonstrate word count using HashMap.";

        // Remove punctuation marks and convert the string to lowercase
        inputString = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = inputString.split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Display the word count
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
