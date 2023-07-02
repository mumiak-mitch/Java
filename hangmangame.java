import java.util.Scanner;

public class hangmangame {
    private static String[] words = {"apple", "banana", "cherry", "durian", "elderberry", "fig", "grape"};
    private static String word;
    private static String guessedWord;
    private static int maxGuesses = 6;
    private static int guessesLeft;
    private static StringBuilder guessedLetters;

    public static void main(String[] args) {
        selectRandomWord();
        initializeGame();
        playGame();
    }

    private static void selectRandomWord() {
        word = words[(int) (Math.random() * words.length)];
    }

    private static void initializeGame() {
        guessedWord = "_".repeat(word.length());
        guessesLeft = maxGuesses;
        guessedLetters = new StringBuilder();
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (guessesLeft > 0 && guessedWord.contains("_")) {
            System.out.println("Word: " + guessedWord);
            System.out.println("Guesses Left: " + guessesLeft);
            System.out.println("Guessed Letters: " + guessedLetters);

            System.out.print("Enter a letter: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }

            if (guessedLetters.toString().contains(guess)) {
                System.out.println("You've already guessed that letter. Try again.");
                continue;
            }

            guessedLetters.append(guess);

            if (word.contains(guess)) {
                updateGuessedWord(guess);
            } else {
                guessesLeft--;
                System.out.println("Wrong guess!");
            }
        }

        scanner.close();

        if (guessesLeft > 0) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Oops! You ran out of guesses. The word was: " + word);
        }
    }

    private static void updateGuessedWord(String guess) {
        StringBuilder newGuessedWord = new StringBuilder(guessedWord);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newGuessedWord.setCharAt(i, guess.charAt(0));
            }
        }

        guessedWord = newGuessedWord.toString();
    }
}