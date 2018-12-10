package com.golden.website.dao;

import com.golden.website.dataobject.GdEnumeration;
import java.util.List;

public interface GdEnumerationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_enumeration
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_enumeration
     *
     * @mbg.generated
     */
    int insert(GdEnumeration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_enumeration
     *
     * @mbg.generated
     */
    GdEnumeration selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_enumeration
     *
     * @mbg.generated
     */
    List<GdEnumeration> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_enumeration
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GdEnumeration record);
}