package com.golden.website.dao;

import com.golden.website.dataobject.ThNewnotice;
import java.util.List;

public interface ThNewnoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice
     *
     * @mbg.generated
     */
    int insert(ThNewnotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice
     *
     * @mbg.generated
     */
    ThNewnotice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice
     *
     * @mbg.generated
     */
    List<ThNewnotice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_newnotice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThNewnotice record);
}