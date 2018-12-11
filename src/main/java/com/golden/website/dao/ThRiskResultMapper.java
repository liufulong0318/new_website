package com.golden.website.dao;

import com.golden.website.dataobject.ThRiskResult;
import java.util.List;

public interface ThRiskResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_risk_result
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_risk_result
     *
     * @mbg.generated
     */
    int insert(ThRiskResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_risk_result
     *
     * @mbg.generated
     */
    ThRiskResult selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_risk_result
     *
     * @mbg.generated
     */
    List<ThRiskResult> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_risk_result
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThRiskResult record);
}