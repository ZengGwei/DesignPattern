package pattern.dalegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/7/2
 * @since 1.0.0
 */
public class Leader implements Employment {
    private Map<String,Employment> map =new HashMap<>();

    public Leader() {
         map.put("A任务",new EmployeeOne());
         map.put("B任务",new EmployeeOne());
    }

    @Override
    public void doing(String task) {
        map.get(task).doing(task);
    }
}
