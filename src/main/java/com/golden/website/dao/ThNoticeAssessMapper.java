package com.golden.website.dao;

import com.golden.website.dataobject.ThNoticeAssess;
import java.util.List;

public interface ThNoticeAssessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_notice_assess
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_notice_assess
     *
     * @mbg.generated
     */
    int insert(ThNoticeAssess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_notice_assess
     *
     * @mbg.generated
     */
    ThNoticeAssess selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_notice_assess
     *
     * @mbg.generated
     */
    List<ThNoticeAssess> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_notice_assess
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThNoticeAssess record);
}