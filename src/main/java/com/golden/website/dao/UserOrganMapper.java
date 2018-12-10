package com.golden.website.dao;

import com.golden.website.dataobject.UserOrgan;
import java.util.List;

public interface UserOrganMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_organ
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_organ
     *
     * @mbg.generated
     */
    int insert(UserOrgan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_organ
     *
     * @mbg.generated
     */
    UserOrgan selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_organ
     *
     * @mbg.generated
     */
    List<UserOrgan> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_organ
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserOrgan record);
}