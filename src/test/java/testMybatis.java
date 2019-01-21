import com.butterfly.bean.User;
import com.butterfly.mapper.UserMapper;
import com.butterfly.sqlSession.MySqlsession;

/**
 * Created by adminnistrator on 2019/1/21.
 */
public class testMybatis {
    public static void main(String[] args) {
        MySqlsession sqlsession=new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}
