public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println("---------Welcome to the Quiz Master---------");
        quiz.addQuestion(new Question("1. What is the capital of France?",
            new String[]{"Berlin", "Paris", "Rome", "Madrid"}, 1));

        quiz.addQuestion(new Question("2. Which language runs in a web browser?",
            new String[]{"Java", "C", "Python", "JavaScript"}, 3));

        quiz.addQuestion(new Question("3. What does CPU stand for?",
            new String[]{"Central Process Unit", "Central Processing Unit", "Computer Personal Unit", "Central Processor Utility"}, 1));

        quiz.addQuestion(new Question("4. Who is the father of Java programming language?",
            new String[]{"Dennis Ritchie", "James Gosling", "Bjarne Stroustrup", "Guido van Rossum"}, 1));

        quiz.addQuestion(new Question("5. Which data structure uses FIFO?",
            new String[]{"Stack", "Queue", "Tree", "Graph"}, 1));

        quiz.addQuestion(new Question("6. What is the extension of Java bytecode files?",
            new String[]{".java", ".txt", ".class", ".exe"}, 2));

        quiz.addQuestion(new Question("7. Which keyword is used to inherit a class in Java?",
            new String[]{"this", "super", "extends", "implements"}, 2));

        quiz.addQuestion(new Question("8. What is the default value of a boolean in Java?",
            new String[]{"true", "false", "0", "null"}, 1));

        quiz.addQuestion(new Question("9. Which method is the entry point of a Java program?",
            new String[]{"main()", "start()", "run()", "init()"}, 0));

        quiz.addQuestion(new Question("10. Which of the following is not a Java access modifier?",
            new String[]{"private", "protected", "public", "internal"}, 3));

        quiz.start();
    }
}
