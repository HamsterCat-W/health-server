package com.example.healthMangement.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class DiaryInfo {

    private String diaryId;
    private String diaryDate;
    private String diaryTitle;
    private String diaryContent;
    private boolean diaryState;

    public DiaryInfo() {

    }


    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId;
    }

    @Id
    public String getDiaryId() {
        return diaryId;
    }

    public DiaryInfo(String diaryId, String diaryDate, String diaryTitle, String diaryContent, boolean diaryState) {
        this.diaryId = diaryId;
        this.diaryDate = diaryDate;
        this.diaryTitle = diaryTitle;
        this.diaryContent = diaryContent;
        this.diaryState = diaryState;
    }

    public String getDiaryDate() {
        return diaryDate;
    }

    public void setDiaryDate(String diaryDate) {
        this.diaryDate = diaryDate;
    }

    public String getDiaryTitle() {
        return diaryTitle;
    }

    public void setDiaryTitle(String diaryTitle) {
        this.diaryTitle = diaryTitle;
    }

    public String getDiaryContent() {
        return diaryContent;
    }

    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent;
    }

    public boolean getDiaryState() {
        return diaryState;
    }

    public void setDiaryState(boolean diaryState) {
        this.diaryState = diaryState;
    }
}
