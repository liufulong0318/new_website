package com.golden.website.dao;

import com.golden.website.dataobject.UserSysLoginlog;
import java.util.List;

public interface UserSysLoginlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_loginlog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_loginlog
     *
     * @mbg.generated
     */
    int insert(UserSysLoginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_loginlog
     *
     * @mbg.generated
     */
    UserSysLoginlog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_loginlog
     *
     * @mbg.generated
     */
    List<UserSysLoginlog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_loginlog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserSysLoginlog record);
}