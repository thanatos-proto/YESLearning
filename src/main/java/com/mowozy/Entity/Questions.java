package com.mowozy.Entity;

import javax.persistence.*;

/**
 * Created by moonwolfzy on 2017-12-13.
 */
@Entity
@Table(name = "questions")
public class Questions {
    private int qId;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private String answer6;
    private String correct;

    @Id
    @Column(name = "QId", nullable = false)
    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    @Basic
    @Column(name = "Question", nullable = true, length = -1)
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "Answer1", nullable = true, length = -1)
    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    @Basic
    @Column(name = "Answer2", nullable = true, length = -1)
    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    @Basic
    @Column(name = "Answer3", nullable = true, length = -1)
    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    @Basic
    @Column(name = "Answer4", nullable = true, length = -1)
    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    @Basic
    @Column(name = "Answer5", nullable = true, length = -1)
    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    @Basic
    @Column(name = "Answer6", nullable = true, length = -1)
    public String getAnswer6() {
        return answer6;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
    }

    @Basic
    @Column(name = "Correct", nullable = true, length = -1)
    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Questions questions = (Questions) o;

        if (qId != questions.qId) return false;
        if (question != null ? !question.equals(questions.question) : questions.question != null) return false;
        if (answer1 != null ? !answer1.equals(questions.answer1) : questions.answer1 != null) return false;
        if (answer2 != null ? !answer2.equals(questions.answer2) : questions.answer2 != null) return false;
        if (answer3 != null ? !answer3.equals(questions.answer3) : questions.answer3 != null) return false;
        if (answer4 != null ? !answer4.equals(questions.answer4) : questions.answer4 != null) return false;
        if (answer5 != null ? !answer5.equals(questions.answer5) : questions.answer5 != null) return false;
        if (answer6 != null ? !answer6.equals(questions.answer6) : questions.answer6 != null) return false;
        if (correct != null ? !correct.equals(questions.correct) : questions.correct != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qId;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answer1 != null ? answer1.hashCode() : 0);
        result = 31 * result + (answer2 != null ? answer2.hashCode() : 0);
        result = 31 * result + (answer3 != null ? answer3.hashCode() : 0);
        result = 31 * result + (answer4 != null ? answer4.hashCode() : 0);
        result = 31 * result + (answer5 != null ? answer5.hashCode() : 0);
        result = 31 * result + (answer6 != null ? answer6.hashCode() : 0);
        result = 31 * result + (correct != null ? correct.hashCode() : 0);
        return result;
    }
}
