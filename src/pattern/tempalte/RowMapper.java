package pattern.tempalte;

import java.sql.ResultSet;

/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/07/01
 * @since 1.0.0
 */
public interface RowMapper<T> {
    T mapRow(ResultSet resultSet,int rowNum) throws Exception;

}
