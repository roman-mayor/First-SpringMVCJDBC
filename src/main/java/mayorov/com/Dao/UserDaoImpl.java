package mayorov.com.Dao;

import mayorov.com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getUser(int id) {
        String sql ="SELECT * FROM schema1.users WHERE id =?";
        return jdbcTemplate.queryForObject(sql, userRowMapper, id);
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO schema1.users (name, email, age) VALUES (?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getAge());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE schema1.users SET name =?, age =?, email =? WHERE id =?";
        jdbcTemplate.update(sql, user.getName(), user.getAge(), user.getEmail(), user.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM schema1.users WHERE id =?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM schema1.users";
        return jdbcTemplate.query(sql, userRowMapper);
    }

    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));
            user.setEmail(resultSet.getString("email"));
            return user;
        }
    };
}
