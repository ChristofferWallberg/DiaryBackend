package com.diary.diarywebsite.controller;

import com.diary.diarywebsite.model.Diary;
import com.diary.diarywebsite.model.User;
import com.diary.diarywebsite.repository.DiaryRepository;
import com.diary.diarywebsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DiaryRepository diaryRepository;

    @PostMapping("/addUser")
    User newUser(@RequestBody User newUser) {
        Diary newDiary = new Diary();
        newUser.setDiary(newDiary);
        diaryRepository.save(newDiary);
        return userRepository.save(newUser);
    }

}
