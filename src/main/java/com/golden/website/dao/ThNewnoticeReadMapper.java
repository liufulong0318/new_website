package com.golden.website.dao;

import com.golden.website.dataobject.ThNewnoticeRead;
import java.util.List;

public interface ThNewnoticeReadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice_read
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice_read
     *
     * @mbg.generated
     */
    int insert(ThNewnoticeRead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice_read
     *
     * @mbg.generated
     */
    ThNewnoticeRead selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice_read
     *
     * @mbg.generated
     */
    List<ThNewnoticeRead> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice_read
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThNewnoticeRead record);
}