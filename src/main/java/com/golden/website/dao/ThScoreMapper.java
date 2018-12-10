package com.golden.website.dao;

import com.golden.website.dataobject.ThScore;
import java.util.List;

public interface ThScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_score
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_score
     *
     * @mbg.generated
     */
    int insert(ThScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_score
     *
     * @mbg.generated
     */
    ThScore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_score
     *
     * @mbg.generated
     */
    List<ThScore> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThScore record);
}