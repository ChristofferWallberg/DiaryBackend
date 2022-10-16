package com.diary.diarywebsite.service;

import com.diary.diarywebsite.repository.DiaryEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DiaryEntryService {
    private final DiaryEntryRepository diaryEntryRepository;

    @Autowired
    public DiaryEntryService(DiaryEntryRepository diaryEntryRepository) {
        this.diaryEntryRepository = diaryEntryRepository;
    }
}
