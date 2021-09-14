import com.mengying.domain.Department;
import com.mengying.domain.User;
import com.mengying.domain.Vo.BorrowingBooksVo;
import com.mengying.mapper.UserMapper;
import com.mengying.service.IBorrowingBooksRecordService;
import com.mengying.service.IUserService;
import com.mengying.utils.page.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Resource
    private IUserService userService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private IBorrowingBooksRecordService borrowingBooksRecordService;
    @Test
    public void findUsersByName(){
        List<User> users=userService.findUserByUserName("yxc");
        if(null!=users){
            for(User u:users){
                System.out.println(u.getUserName());
            }
        }else{
            System.out.println("null");
        }
    }

    @Test
    public void findAllDepts(){
        List<Department> depts=userService.findAllDepts();
        if(null==depts){
            System.out.println("null");
        }else{
            for(Department d:depts){
                System.out.println(d.getDeptName());
            }
        }
    }
    @Test
    public void updateUserTest(){
        User user=new User();

    }

    @Test
    public void selectByPage(){
        List<User> users=userMapper.selectByPageNum(0,5);
        if(null!=users){
            for(User u:users){
                System.out.println(u.getUserId()+" "+u.getUserName());
            }
        }
    }

    @Test
    public void tsetSelcetCount(){
        int n=userMapper.selectUserCount();
        System.out.println(n);
    }

    @Test
    public void testSelectAllBorrowingBooksByPageNum(){
        Page<BorrowingBooksVo> page=borrowingBooksRecordService.selectAllByPage(1);
        if(null!=page){
            for(BorrowingBooksVo b:page.getList()){
                System.out.println(b.getUser().getUserName()+" "+b.getBook().getBookName());
            }
        }
    }
}
