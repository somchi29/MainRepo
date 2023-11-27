package DiaryTestPack;

import data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Lock;

import static org.junit.jupiter.api.Assertions.*;

class DiaryServiceImplementTest {

    @BeforeEach
    void setUp() {

    }
    @Test
    public void testThatDiaryUnlocked(){
        Diary diary = new Diary();
        assertTrue(diary.unlock());
        
    }
    @Test
    public void testThatDiaryIsLocked(){
        Diary diary = new Diary();
        assertFalse(diary.isLocked());

    }

}