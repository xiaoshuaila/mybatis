package bao1.service;

import bao1.dao.studentdao;
import bao1.dao.studentdaoImpl;
import bao1.domain.student;

import java.util.List;

public class studentserviceImpl implements studentservice {
    private studentdao studentdao=new studentdaoImpl();;
    @Override
    public List<student> find() {
        return studentdao.select();
    }

    @Override
    public int insert(student student) {
        return studentdao.insert(student);
    }
}
