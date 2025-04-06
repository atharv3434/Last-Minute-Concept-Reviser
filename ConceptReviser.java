import java.util.Scanner;

public class ConceptReviser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("📘 Welcome to Concept Reviser!");

        while (true) {
            System.out.println("\nChoose a subject to revise:");
            System.out.println("1. Java\n2. DBMS\n3. Operating System\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    FlashcardEngine.showFlashcards(SubjectData.getJavaConcepts());
                    break;
                case 2:
                    FlashcardEngine.showFlashcards(SubjectData.getDBMSConcepts());
                    break;
                case 3:
                    FlashcardEngine.showFlashcards(SubjectData.getOSConcepts());
                    break;
                case 4:
                    System.out.println("✅ Good luck! Go ace your exam/interview.");
                    return;
                default:
                    System.out.println("❗Invalid choice. Try again.");
            }
        }
    }
}
