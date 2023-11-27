package service;
import data.models.Diary;
import data.models.Entry;

public interface DiaryServices {
    Diary diary (String title, String body);
    void unlockDiary(String title);
    void lockDiary();
    boolean isLocked();
    void createEntry(String title, String body);
    void deleteEntry(int id );

    String deleteEntry(String body);

    Entry findEntryById(int id);
    void updateEntry(int id, String title, String body);

    int getId();

    void addEntry(String username, String title, String body);

    void add(Diary diary);
}