package data.repositories;

import data.models.Diary;

public class EntryRepo {
    public interface EntryRepoImple {
        Diary save(Diary diary);
        void delete(Diary diary);
        Diary FIND_BY_ID(int id);
        Iterable<Diary> findAll();

        long count();
        void clear();
    }

}
