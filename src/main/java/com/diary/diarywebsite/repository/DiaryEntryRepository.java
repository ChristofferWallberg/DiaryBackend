package com.diary.diarywebsite.repository;

import com.diary.diarywebsite.model.DiaryEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryEntryRepository extends JpaRepository<DiaryEntry, Long> {
}