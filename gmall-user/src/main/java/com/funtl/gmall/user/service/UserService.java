package com.funtl.gmall.user.service;

import com.funtl.gmall.user.bean.UmsMember;
import com.funtl.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author songtao
 * @create 2019-08-2019/8/27-22:32
 */
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
