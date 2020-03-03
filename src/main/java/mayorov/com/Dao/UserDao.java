package mayorov.com.Dao;

import mayorov.com.entity.User;

import java.util.List;

public interface UserDao {
    User getUser(int id);
    void save(User user);
    void update(User user);
    void delete(int id);

    List<User> findAll();
}
