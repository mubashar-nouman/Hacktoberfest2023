import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FrenchLanguageLearningQuiz {
    public static void main(String[] args) {
        Map<String, String> wordPairs = new HashMap<>();
        wordPairs.put("Bonjour", "Hello");
        wordPairs.put("Ami", "Friend");
        wordPairs.put("Fleur", "Flower");
        wordPairs.put("Chat", "Cat");
        wordPairs.put("Maison", "House");
        wordPairs.put("Chocolat", "Chocolate");
        wordPairs.put("Musique", "Music");
        wordPairs.put("Livre", "Book");
        // Add more word pairs for the French language and their English translations.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the French Language Learning Quiz!");
        System.out.println("Type 'exit' to quit the quiz.");

        while (true) {
            String[] words = wordPairs.keySet().toArray(new String[0]);
            String randomWord = words[random.nextInt(words.length)];
            String correctTranslation = wordPairs.get(randomWord);

            System.out.println("Translate: " + randomWord);
            System.out.print("Your Answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for playing!");
                break;
            }

            if (userAnswer.equalsIgnoreCase(correctTranslation)) {
                System.out.println("Correct! Well done.");
            } else {
                System.out.println("Incorrect. The correct translation is: " + correctTranslation);
            }
        }

        scanner.close();
    }
}
