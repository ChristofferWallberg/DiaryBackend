package com.diary.diarywebsite.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.LazyCollection;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Diary diary;

    public Diary getDiary() {
        return diary;
    }

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }
}
