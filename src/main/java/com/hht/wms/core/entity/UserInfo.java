package com.hht.wms.core.entity;

/**
 * 
 * user_info
 * 用户信息表
 *
 * @author hansh
 *
 * @mbg.generated
 */
public class UserInfo {
    /**
     * 用户ID
     * 表字段 : user_info.user_id
     */
    private String userId;

    /**
     * 用户名称
     * 表字段 : user_info.user_name
     */
    private String userName;

    /**
     * 序号
     * 表字段 : user_info.age
     */
    private Integer age;

    /**
     * 性别
     * 表字段 : user_info.sex
     */
    private String sex;

    /**
     * 
     * 表字段 : user_info.password
     */
    private String password;

    /**
     * 获取 用户ID 字段:user_info.user_id
     *
     * @return user_info.user_id, 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置 用户ID 字段:user_info.user_id
     *
     * @param userId the value for user_info.user_id, 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取 用户名称 字段:user_info.user_name
     *
     * @return user_info.user_name, 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户名称 字段:user_info.user_name
     *
     * @param userName the value for user_info.user_name, 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 序号 字段:user_info.age
     *
     * @return user_info.age, 序号
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置 序号 字段:user_info.age
     *
     * @param age the value for user_info.age, 序号
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取 性别 字段:user_info.sex
     *
     * @return user_info.sex, 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置 性别 字段:user_info.sex
     *
     * @param sex the value for user_info.sex, 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取  字段:user_info.password
     *
     * @return user_info.password, 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置  字段:user_info.password
     *
     * @param password the value for user_info.password, 
     */
    public void setPassword(String password) {
        this.password = password;
    }
}