package com.golden.website.dao;

import com.golden.website.dataobject.MzEnumeration;
import java.util.List;

public interface MzEnumerationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_enumeration
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_enumeration
     *
     * @mbg.generated
     */
    int insert(MzEnumeration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_enumeration
     *
     * @mbg.generated
     */
    MzEnumeration selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_enumeration
     *
     * @mbg.generated
     */
    List<MzEnumeration> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_enumeration
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MzEnumeration record);
}