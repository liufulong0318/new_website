package com.golden.website.dao;

import com.golden.website.dataobject.UserRole;
import java.util.List;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    UserRole selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    List<UserRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserRole record);
}