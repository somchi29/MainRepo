package controller;

import service.DiaryServiceImplement;

public class DiaryController {
    private DiaryServiceImplement diaryServiceImplement;

    public String lockDiary(String username) {
        diaryServiceImplement.lockDiary(username);
        return "Locked";
    }

    public String CreateEntry(String username, String title, String body) {
        diaryServiceImplement.addEntry(username, title, body);
        return "Entry created";
    }

    public String findDiary(String username) {
        return findDiary(username);
    }

    public String deleteDiaryBody(String body) {
        return "Diary body deleted successfully";
    }
}
