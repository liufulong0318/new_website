package com.golden.website.dao;

import com.golden.website.dataobject.ThShopBusinessAccount;
import java.util.List;

public interface ThShopBusinessAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business_account
     *
     * @mbg.generated
     */
    int insert(ThShopBusinessAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business_account
     *
     * @mbg.generated
     */
    ThShopBusinessAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business_account
     *
     * @mbg.generated
     */
    List<ThShopBusinessAccount> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThShopBusinessAccount record);
}