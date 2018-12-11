package com.golden.website.dao;

import com.golden.website.dataobject.GoldenProject;
import java.util.List;

public interface GoldenProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_project
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_project
     *
     * @mbg.generated
     */
    int insert(GoldenProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_project
     *
     * @mbg.generated
     */
    GoldenProject selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_project
     *
     * @mbg.generated
     */
    List<GoldenProject> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_project
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GoldenProject record);
}