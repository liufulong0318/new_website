package com.golden.website.dao;

import com.golden.website.dataobject.ThTypeTotal;
import java.util.List;

public interface ThTypeTotalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_type_total
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_type_total
     *
     * @mbg.generated
     */
    int insert(ThTypeTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_type_total
     *
     * @mbg.generated
     */
    ThTypeTotal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_type_total
     *
     * @mbg.generated
     */
    List<ThTypeTotal> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_type_total
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThTypeTotal record);
}