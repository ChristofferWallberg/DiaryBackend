package com.diary.diarywebsite.controller;

import com.diary.diarywebsite.model.Diary;
import com.diary.diarywebsite.model.DiaryEntry;
import com.diary.diarywebsite.repository.DiaryEntryRepository;
import com.diary.diarywebsite.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiaryEntryController {
    @Autowired
    private DiaryEntryRepository diaryEntryRepository;

    @Autowired
    private DiaryRepository diaryRepository;

    @PostMapping("/createEntry")
    DiaryEntry newDiaryEntry(@RequestBody DiaryEntry newDiaryEntry) {
//  TODO       diaryRepository.findById(newDiaryEntry.getDiary().getId());
//        newDiaryEntry.setDiary(newDiaryEntry.getDiary());
        newDiaryEntry.getDiary().setDiaryEntries(List.of(newDiaryEntry));
        return diaryEntryRepository.save(newDiaryEntry);
    }
}
