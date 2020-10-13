package bao1;

import bao1.dao.studentdao;
import bao1.domain.student;
import bao1.service.studentservice;
import bao1.service.studentserviceImpl;
import org.apache.ibatis.session.SqlSession;
import bao1.tool.*;

import java.awt.*;
import java.util.List;

public class test {
    public static void main(String[] args) {
        studentservice studentservice= (bao1.service.studentservice) new handler(new studentserviceImpl()).getprox();
        int i=studentservice.insert(new student(2,"该",12));
        List<student>list=studentservice.find();
        for (student s:list)
            System.out.println(s);
        System.out.println(i);
    }
}
