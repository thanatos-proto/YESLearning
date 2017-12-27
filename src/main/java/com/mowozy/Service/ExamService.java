package com.mowozy.Service;

import com.mowozy.Dao.ExamsDao;
import com.mowozy.Dao.QuestionsDao;
import com.mowozy.Entity.Exams;
import com.mowozy.Entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moonwolfzy on 2017-12-27.
 */
@Service
public class ExamService {

    @Autowired
    private QuestionsDao questionsDao;
    private ExamsDao examsDao;

    public List<Questions> makeExam (int eid){

         List<Questions> QList = new ArrayList<Questions>();
        Exams exams = examsDao.findByEId(eid);
        QList.add(questionsDao.findByQId(exams.getQ1()));
        QList.add(questionsDao.findByQId(exams.getQ2()));
        QList.add(questionsDao.findByQId(exams.getQ3()));
        QList.add(questionsDao.findByQId(exams.getQ4()));
        QList.add(questionsDao.findByQId(exams.getQ5()));
        QList.add(questionsDao.findByQId(exams.getQ6()));
        QList.add(questionsDao.findByQId(exams.getQ7()));
        QList.add(questionsDao.findByQId(exams.getQ8()));
        QList.add(questionsDao.findByQId(exams.getQ9()));
        QList.add(questionsDao.findByQId(exams.getQ10()));
        return QList;
    }
    public Integer correctscore (Exams examsresult ,int eid){
        int score = 0;
        Exams exams = examsDao.findByEId(eid);
        if (examsresult.getQ1()== questionsDao.findByQId(exams.getQ1()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ2()== questionsDao.findByQId(exams.getQ2()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ3()== questionsDao.findByQId(exams.getQ3()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ4()== questionsDao.findByQId(exams.getQ4()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ5()== questionsDao.findByQId(exams.getQ5()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ6()== questionsDao.findByQId(exams.getQ6()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ7()== questionsDao.findByQId(exams.getQ7()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ8()== questionsDao.findByQId(exams.getQ8()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ9()== questionsDao.findByQId(exams.getQ9()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        if (examsresult.getQ10()== questionsDao.findByQId(exams.getQ10()).getCorrect()) {
            score+=questionsDao.findByQId(exams.getQ1()).getScore();}
        return score;
    }
}

