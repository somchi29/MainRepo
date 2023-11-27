package service;

import data.DiaryRepository;
import data.models.Diary;
import data.models.Entry;

public class DiaryServiceImplement implements DiaryServices{
    private DiaryRepository diaryRepository;
    @Override
    public Diary diary(String title, String body) {
        return null;
    }

    @Override
    public void unlockDiary(String title) {

    }

    @Override
    public void lockDiary() {

    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public void createEntry(String title, String body) {

    }

    @Override
    public String deleteEntry(String body) {
        return diaryRepository.delete(body);
    }

    @Override
    public Entry findEntryById(int id) {
        return null;
    }

    @Override
    public void updateEntry(int id, String title, String body) {
        return  ;
    }


    @Override
    public int getId() {
        return 1;
    }


    @Override
    public void addEntry(String username, String title, String body) {

    }


    @Override
    public void add(Diary diary) {

    }

    public void lockDiary(String username) {
    }
}
