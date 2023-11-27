package data.repositories;

import data.models.Diary;

public interface DiaryRepositories {
    Diary save (Diary diary);
    void delete(Diary diary);
    Diary Find_by_id(int id);
    Iterable<Diary> findAll();
    long count();
    void clear();




}
