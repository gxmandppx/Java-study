import com.mengying.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.mengying.pojo.User;
import com.mengying.utils.MyBatisUtils;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        //获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        //执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
}