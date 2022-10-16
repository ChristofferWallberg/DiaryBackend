package com.diary.diarywebsite.controller;

import com.diary.diarywebsite.model.Diary;
import com.diary.diarywebsite.model.User;
import com.diary.diarywebsite.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryController {

    @Autowired
    private DiaryRepository diaryRepository;

    @PostMapping("/addDiary")
    Diary newDiary(@RequestBody Diary newDiary) {
        return diaryRepository.save(newDiary);
    }
    @PutMapping("/updateDiary")
    Diary updateDiary(@RequestBody Diary updateDiary) {
        return diaryRepository.save(updateDiary);
    }
}
