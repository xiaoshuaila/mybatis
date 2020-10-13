package bao1.service;

import bao1.domain.student;

import java.util.List;

public interface studentservice {
    List<student> find();
    int insert(student student);
}
