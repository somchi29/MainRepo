package data;

import data.models.Diary;

public interface DiaryRepository{
    void  add(String title, String body);
    Diary findByUserName(String username);
    String delete(String body);

    void add(Diary diary);
}
