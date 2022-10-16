package com.diary.diarywebsite.repository;

import com.diary.diarywebsite.model.Diary;
import com.diary.diarywebsite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
