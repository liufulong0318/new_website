package com.golden.website.dao;

import com.golden.website.dataobject.ThSuggest;
import java.util.List;

public interface ThSuggestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_suggest
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_suggest
     *
     * @mbg.generated
     */
    int insert(ThSuggest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_suggest
     *
     * @mbg.generated
     */
    ThSuggest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_suggest
     *
     * @mbg.generated
     */
    List<ThSuggest> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_suggest
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThSuggest record);
}