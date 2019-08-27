package com.funtl.gmall.user.mapper;

import com.funtl.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author songtao
 * @create 2019-08-2019/8/27-23:05
 */
@Mapper
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
