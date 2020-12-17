package com.niu.springboot.repository;

import com.niu.springboot.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @description: userMapper
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/17 8:27 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/17 8:27 上午
 * @updateRemark:
 * @version: 1.0
 *
 * JpaRepository<SysUser,Integer> 参数1 要映射的实体类
 *                                参数2 实体类主键的数据类型
 *  每个dao层接口都要继承这个类
 **/
@Repository
public interface SysUserRepository  extends JpaRepository<SysUser,Integer> {

    SysUser findByNameAndPwd(String name,String pwd);
    /***
     *
     * ?1表示第一个参数，?2表示第二个参数
     * 这里的写法是hql写法
     * nativeQuery = false 代表使用hql ，默认不设置的话就是false 默认使用的hql
     * 要想使用 原生的sql  改为 true即可
     */
    @Query(value = "from SysUser where name = ?1 and pwd =?2",nativeQuery = false)
    SysUser findByNameAndPwdUseSQL(String name,String pwd);


}
