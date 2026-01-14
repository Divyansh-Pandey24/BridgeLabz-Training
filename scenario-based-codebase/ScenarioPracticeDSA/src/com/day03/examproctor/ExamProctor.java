package com.day03.examproctor;

import java.util.*;

public class ExamProctor {

    Stack<Integer> navigation = new Stack<>();

    HashMap<Integer, String> answers = new HashMap<>();

    HashMap<Integer, String> correct = new HashMap<>();

    public ExamProctor() {
        correct.put(1, "A");
        correct.put(2, "B");
        correct.put(3, "C");
        correct.put(4, "D");
        correct.put(5, "A");
    }

    public void visitQuestion(int qid) {
        navigation.push(qid);
        System.out.println("Visited Question " + qid);
    }

    public void answerQuestion(int qid, String ans) {
        answers.put(qid, ans);
        System.out.println("Answer saved.");
    }

    public int calculateScore() {
        int score = 0;

        for (int qid : correct.keySet()) {
            if (answers.containsKey(qid)) {
                if (answers.get(qid).equalsIgnoreCase(correct.get(qid))) {
                    score++;
                }
            }
        }
        return score;
    }
}
