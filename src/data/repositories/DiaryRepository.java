package data.repositories;

import data.models.Diary;
import data.models.Entry;

import java.util.ArrayList;
import java.util.List;

public interface DiaryRepository extends MongoRepository<Diary, Long>{

//    private List<Entry> entries;
//
//    public DiaryRepository() {
//        this.entries = new ArrayList<>();
//    }
//
//    public void saveEntry(Entry entry) {
//        entries.add(entry);
//    }
//
//    public Entry getEntryById(int id) {
//        for (Entry entry : entries) {
//            if (entry.getId() == id) {
//                return entry;
//            }
//        }
//        return null;
//    }

//    public List<Entry> getAllEntries() {
//        return new ArrayList<>(entries); // Return a copy to avoid direct modification
//    }
//
//    public void updateEntry(Entry updatedEntry) {
//        for (int i = 0; i < entries.size(); i++) {
//            if (entries.get(i).getId() == updatedEntry.getId()) {
//                entries.set(i, updatedEntry);
//                break;
//            }
//        }
//    }
//
//    public void deleteEntry(int id) {
//        entries.removeIf(entry -> entry.getId() == id);
//    }
}
