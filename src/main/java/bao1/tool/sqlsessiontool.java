package bao1.tool;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class sqlsessiontool {
    public static SqlSession getsqlsession ()
    {
        SqlSession sqlSession=null;

        try {
            sqlSession=
                    new SqlSessionFactoryBuilder()
                            .build(Resources.getResourceAsStream("mybatis.xml"))
                            .openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSession;
    }
}
