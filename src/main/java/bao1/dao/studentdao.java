package bao1.dao;

import bao1.domain.student;

import java.util.List;

public interface studentdao {
    List<student>select();
    int insert(student student);
}
