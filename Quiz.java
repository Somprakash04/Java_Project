package Java_Project;
import java.util.*;

public class Quiz {
    List<Question> questions = new ArrayList<>();
    int score = 0;
    Scanner scanner = new Scanner(System.in);

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void start() {
        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();
            if (q.isCorrect(answer - 1)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer was: " + (q.correctAnswerIndex + 1) + "\n");
            }
        }

        System.out.println("Quiz Over! Your score: " + score + "/" + questions.size());
    }
}
