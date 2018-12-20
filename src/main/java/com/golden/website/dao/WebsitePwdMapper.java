package com.golden.website.dao;

import com.golden.website.dataobject.WebsitePwd;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface WebsitePwdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_pwd
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_pwd
     *
     * @mbg.generated
     */
    @Insert("insert into website_pwd (id,password) values (#{id},#{password})")
    int insert(WebsitePwd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_pwd
     *
     * @mbg.generated
     */
    WebsitePwd selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_pwd
     *
     * @mbg.generated
     */
    List<WebsitePwd> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_pwd
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WebsitePwd record);
}