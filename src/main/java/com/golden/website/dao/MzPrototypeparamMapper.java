package com.golden.website.dao;

import com.golden.website.dataobject.MzPrototypeparam;
import java.util.List;

public interface MzPrototypeparamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_prototypeparam
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_prototypeparam
     *
     * @mbg.generated
     */
    int insert(MzPrototypeparam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_prototypeparam
     *
     * @mbg.generated
     */
    MzPrototypeparam selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_prototypeparam
     *
     * @mbg.generated
     */
    List<MzPrototypeparam> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_prototypeparam
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MzPrototypeparam record);
}