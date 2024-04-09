import java.util.HashMap;

public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store characters and their frequencies
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the string to lowercase to treat uppercase and lowercase characters
        // the same
        str = str.toLowerCase();

        // Iterate through the string and update the frequencies in the HashMap
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print characters with frequencies greater than 1 (duplicates)
        System.out.println("Duplicate characters in the string:");
        for (char c : charFrequencyMap.keySet()) {
            if (charFrequencyMap.get(c) > 1) {
                System.out.println(c + ": " + charFrequencyMap.get(c));
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello World";
        findDuplicateCharacters(inputString);
    }
}
