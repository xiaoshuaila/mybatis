package bao1.dao;

import bao1.domain.student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import bao1.tool.*;
public class studentdaoImpl implements studentdao {
    @Override
    public List<student> select() {
        SqlSession sqlSession=sqlsessiontool.getsqlsession();
        studentdao studentdao=sqlSession.getMapper(bao1.dao.studentdao.class);
        List<student>list=studentdao.select();
        return list;
    }

    @Override
    public int insert(student student) {
        SqlSession sqlSession=null;
            sqlSession=sqlsessiontool.getsqlsession();
            return sqlSession.insert("bao1.dao.studentdao.insert",student);

    }
}
