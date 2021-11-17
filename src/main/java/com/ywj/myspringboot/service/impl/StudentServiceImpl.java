package com.ywj.myspringboot.service.impl;

import com.ywj.myspringboot.entity.Student;
import com.ywj.myspringboot.mapper.StudentMapper;
import com.ywj.myspringboot.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ywj
 * @since 2021-07-30
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
