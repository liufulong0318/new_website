package com.golden.website.dao;

import com.golden.website.dataobject.GdHzuserDetail;
import java.util.List;

public interface GdHzuserDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_hzuser_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_hzuser_detail
     *
     * @mbg.generated
     */
    int insert(GdHzuserDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_hzuser_detail
     *
     * @mbg.generated
     */
    GdHzuserDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_hzuser_detail
     *
     * @mbg.generated
     */
    List<GdHzuserDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_hzuser_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GdHzuserDetail record);
}