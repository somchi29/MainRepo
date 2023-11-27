package data.repositories;

public interface DiariesRepository {
    public String findByUsername(String username) {
        return username;
    }

    public String add(String username, String password) {
        return password;
        }
    }

