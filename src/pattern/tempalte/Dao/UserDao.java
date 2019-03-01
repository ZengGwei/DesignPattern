package pattern.tempalte.Dao;

import pattern.tempalte.JdbcTemplate;
import pattern.tempalte.RowMapper;
import pattern.tempalte.main.User;

import java.sql.ResultSet;
import java.util.List;

/**
 * 〈〉
 * 解耦
 *
 * @author gw.Zeng
 * @create 2018/07/01
 * @since 1.0.0
 */
public class UserDao {

    private JdbcTemplate jdbcTempalte = new JdbcTemplate(null);

    public List<?> query(){
        String sql = " select * from c_user_tbl where id =?";
        return jdbcTempalte.executeQuery(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int rowNum) throws Exception {
                User user = new User();
                user.setUserName(resultSet.getString("user_name"));
                user.setAge(resultSet.getInt("age"));

                return user;
            }
        },null);
    }



}
