package com.golden.website.dao;

import com.golden.website.dataobject.UserSysRole;
import java.util.List;

public interface UserSysRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_role
     *
     * @mbg.generated
     */
    int insert(UserSysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_role
     *
     * @mbg.generated
     */
    UserSysRole selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_role
     *
     * @mbg.generated
     */
    List<UserSysRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sys_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserSysRole record);
}