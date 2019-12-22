package ru.geekbrains.datamapper;

import java.util.List;

public interface UserRepository {
    int save(User user);

    int update(User user);

    int deleteById(Long id);

    List<User> findAll();
}
