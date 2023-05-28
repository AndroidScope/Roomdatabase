package com.example.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "sopanswer")
public class Person {
    @PrimaryKey
    @SerializedName("id")
    @ColumnInfo(name = "id")
    public int id;

    @SerializedName("user_id")
    @ColumnInfo(name = "user_id")
    public String user_id;

    @SerializedName("company_id")
    @ColumnInfo(name = "company_id")
    public String company_id;

    @SerializedName("survey_id")
    @ColumnInfo(name = "survey_id")
    public String survey_id;

    @SerializedName("ques_id")
    @ColumnInfo(name = "ques_id")
    public String ques_id;

    @SerializedName("question")
    @ColumnInfo(name = "question")
    public String question;

    @SerializedName("answer")
    @ColumnInfo(name = "answer")
    public String answer;

    @SerializedName("options1")
    @ColumnInfo(name = "options1")
    public String options1;


    @SerializedName("options2")
    @ColumnInfo(name = "options2")
    public String options2;

    @SerializedName("options3")
    @ColumnInfo(name = "options3")
    public String options3;

    @SerializedName("options4")
    @ColumnInfo(name = "options4")
    public String options4;

    @SerializedName("answer_type")
    @ColumnInfo(name = "answer_type")
    public String answer_type;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(String survey_id) {
        this.survey_id = survey_id;
    }

    public String getQues_id() {
        return ques_id;
    }

    public void setQues_id(String ques_id) {
        this.ques_id = ques_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

