import java.util.Scanner;

public class FlashcardEngine {
    public static void showFlashcards(String[][] concepts) {
        Scanner sc = new Scanner(System.in);
        for (String[] card : concepts) {
            System.out.println("\n🧠 Concept: " + card[0]);
            System.out.println("💡 Explanation: " + card[1]);
            System.out.print("Press Enter to continue...");
            sc.nextLine();
        }
        System.out.println("🎉 Done revising this subject!");
    }
}
