package com.golden.website.dao;

import com.golden.website.dataobject.ThActiveRes;
import java.util.List;

public interface ThActiveResMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_active_res
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_active_res
     *
     * @mbg.generated
     */
    int insert(ThActiveRes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_active_res
     *
     * @mbg.generated
     */
    ThActiveRes selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_active_res
     *
     * @mbg.generated
     */
    List<ThActiveRes> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_active_res
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThActiveRes record);
}