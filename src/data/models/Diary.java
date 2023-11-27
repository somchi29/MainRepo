package data.models;
import java.util.List;

public class Diary {
    private Long id;
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    private boolean isLocked;
    private List<Entry> entries;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public boolean unlock() {
        return true;
    }
}