package ru.geekbrains.datamapper;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Setter(onMethod_ = {@Autowired})
    private JdbcTemplate jdbcTemplate;
    private Map<Long, User> identityMap = new ConcurrentHashMap<>();

    @Override
    public int save(User user) {
        identityMap.putIfAbsent(user.getId(), user);
        return jdbcTemplate.update("insert into users(firstname, lastname, email) values(?, ?, ?)",
                user.getFirstname(),
                user.getLastname(),
                user.getEmail());
    }

    @Override
    public int update(User user) {
        identityMap.replace(user.getId(), user);
        return jdbcTemplate.update("update users set firstname = ?, lastname = ?,  email = ? where id = ?",
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getId());
    }

    @Override
    public int deleteById(Long id) {
        identityMap.remove(id);
        return jdbcTemplate.update("delete users where id = ?", id);
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("select * from users",
                (resultSet, rowNum) -> new User(
                        resultSet.getLong("id"),
                        resultSet.getString("firstname"),
                        resultSet.getString("lastname"),
                        resultSet.getString("email")));
    }
}
