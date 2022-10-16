package com.diary.diarywebsite.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "diaryentries")
public class DiaryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;
    private LocalDateTime localDateTimeStamp = LocalDateTime.now();
    @ManyToOne
    private Diary diary;

    public DiaryEntry() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getLocalDateTimeStamp() {
        return localDateTimeStamp;
    }

    public void setLocalDateTimeStamp(LocalDateTime localDateTimeStamp) {
        this.localDateTimeStamp = localDateTimeStamp;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }
}
