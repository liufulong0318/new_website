package com.golden.website.dao;

import com.golden.website.dataobject.ThShopBusiness;
import java.util.List;

public interface ThShopBusinessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business
     *
     * @mbg.generated
     */
    int insert(ThShopBusiness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business
     *
     * @mbg.generated
     */
    ThShopBusiness selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business
     *
     * @mbg.generated
     */
    List<ThShopBusiness> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_business
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ThShopBusiness record);
}