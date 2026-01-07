package com.day04.edumentor;
public class Quiz {

    private String[] questions;
    private String[] answers;     // Encapsulated — cannot change later
    private int score;
    private String difficulty;

    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
    }

    public void evaluate(String[] userAnswers) {

        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score = score + 1;   // Using operator
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / answers.length;
    }

    public int getScore() {
        return score;
    }

    // No setters → answers are protected from change
}
