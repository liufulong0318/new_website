package com.golden.website.dao;

import com.golden.website.dataobject.GoldenMessage;
import java.util.List;

public interface GoldenMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_message
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_message
     *
     * @mbg.generated
     */
    int insert(GoldenMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_message
     *
     * @mbg.generated
     */
    GoldenMessage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_message
     *
     * @mbg.generated
     */
    List<GoldenMessage> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_message
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GoldenMessage record);
}