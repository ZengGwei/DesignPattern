package pattern.tempalte;

import sun.security.krb5.internal.PAData;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈模板模式〉
 * Jdbc模板模式
 *
 * @author gw.Zeng
 * @create 2018/07/01
 * @since 1.0.0
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    static {

        try {
            //1.加载驱动
            Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(DataSource dataSource) throws Exception {
        return dataSource.getConnection();
    }

    public PreparedStatement createPrepareStatement(Connection con, String sql) throws SQLException {
        return con.prepareStatement(sql);
    }

    public List<?> parseResultSet(ResultSet rs,RowMapper rowMapper) throws  Exception{
        List<Object> res = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()){
            res.add(rowMapper.mapRow(rs,rowNum++));
        }
        return res;

    }
    public ResultSet executeQuery(PreparedStatement ps,Object[] values) throws SQLException {
        for (int i = 0; i <values.length ; i++) {
            ps.setObject(i,values[i]);
        }
        return ps.executeQuery();
    }


    public List<?> executeQuery(String sql,RowMapper rowMapper ,Object[] values) {
        try {
            //2.建立链接
            Connection connection = this.getConnection(dataSource);
            //3.创建语句集
            PreparedStatement preparedStatement = this.createPrepareStatement(connection,sql);
            //4.执行语句集并获得结果
            ResultSet rs = executeQuery(preparedStatement,values);
            //4.解析语句集
            List<?> objects = this.parseResultSet(rs, rowMapper);
            //5.关闭结果集
            this.closeResultSet(rs);

            //6.关闭语句集
            this.closeStatement(preparedStatement);

            //7.关闭链接
            this.closeConnection(connection);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    private void closeConnection(Connection connection) {
       //放回 连接池 TODO
    }

    private void closeStatement(PreparedStatement preparedStatement) {
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
