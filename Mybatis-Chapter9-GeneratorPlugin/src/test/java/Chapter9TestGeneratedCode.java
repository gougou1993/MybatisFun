
//import com.dfz.mybatis.dao.UserMapper;
//import com.dfz.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by zhangsiyuan on 2016/11/16.
 */
public class Chapter9TestGeneratedCode {
    private SqlSessionFactory sqlSessionFactory;
    private Reader reader;

    @Before
    public void before() {
        try {
            //读取mybatis参数
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            //建立session factory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void test() {
//        //打开session
//        System.out.println("------------查询方法测试开始------------");
//        SqlSession session = sqlSessionFactory.openSession();
//        //使用接口方式调用查找方法
//        List<User> users = session.getMapper(UserMapper.class).selectAll();
//        System.out.println(users);
//        session.close();
//        System.out.println("------------插入方法测试开始------------");
//        session = sqlSessionFactory.openSession();
//        User u1 = new User();
//        u1.setUsername("li");
//        u1.setPassword("password2");
//        u1.setAddress("Beijing");
//        session.getMapper(UserMapper.class).insert(u1);
//        session.commit();
//        System.out.println(u1);
//        System.out.println(session.getMapper(UserMapper.class).insertSelective(u1));
//        session.close();
//        System.out.println("------------修改方法测试开始------------");
//        session = sqlSessionFactory.openSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        User u2 = mapper.selectByPrimaryKey(2);
//        u2.setUsername("changedname");
//        mapper.updateByPrimaryKey(u2);
//        session.commit();
//        System.out.println(mapper.selectByPrimaryKey(u2.getId()));
//        session.close();
//        System.out.println("------------删除方法测试开始------------");
//        session = sqlSessionFactory.openSession();
//        mapper = session.getMapper(UserMapper.class);
//        mapper.deleteByPrimaryKey(u2.getId());
//        session.commit();
//        session.close();
//    }
}
