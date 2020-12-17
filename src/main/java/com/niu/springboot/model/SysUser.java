package com.niu.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * @description: user
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/17 8:26 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/17 8:26 上午
 * @updateRemark:
 * @version: 1.0
 **/
@Entity(name = "sys_user") //name值代表数据库对应的表名，如不写默认按照实体类的驼峰命名法单词中间加_
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"}) //加这个注解是为了放在jpa对象直接转json有空的值报错
public class SysUser {

    @Id
    @GeneratedValue
    private Integer id;
    /**
     *
     *   这里是映射数据表字段与实体字段 若数据库表字段为 user_name  这里需要写成
     *   @Column(name = "user_name")
     *   private String userName;
     */
    @Column(name = "name")
    private String name;

    @Column(name = "pwd")
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
