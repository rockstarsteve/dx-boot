package com.dx.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dx.bean.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStudentMapper extends BaseMapper<Student> {

}