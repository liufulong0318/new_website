package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteProductbuyinfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WebsiteProductbuyinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_productbuyinfo
     *
     * @mbg.generated
     */
    @Delete("DELETE FROM WEBSITE_PRODUCTBUYINFO WHERE ID = #{id}")
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_productbuyinfo
     *
     * @mbg.generated
     */
    @Insert("INSERT INTO WEBSITE_PRODUCTBUYINFO (ID,TITLE,CONTENT,`ORDER`,IMGPATH,parameter,price,details,notice,CREATETIME,CREATEUSER) VALUES (#{id},#{title},#{content},#{order},#{imgpath},#{parameter},#{price},#{details},#{notice},#{createtime},#{createuser})")
    int insert(WebsiteProductbuyinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_productbuyinfo
     *
     * @mbg.generated
     */
    @Select("SELECT * FROM WEBSITE_PRODUCTBUYINFO WHERE ID = #{id}")
    WebsiteProductbuyinfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_productbuyinfo
     *
     * @mbg.generated
     */
    @Select("SELECT * FROM WEBSITE_PRODUCTBUYINFO ORDER BY `ORDER` ASC")
    List<WebsiteProductbuyinfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_productbuyinfo
     *
     * @mbg.generated
     */
    @Update("UPDATE WEBSITE_PRODUCTBUYINFO SET TITLE = #{title},CONTENT=#{content},`ORDER`=#{order},IMGPATH=#{imgpath},parameter = #{parameter},price=#{price},details=#{details},notice=#{notice} WHERE ID = #{id}")
    int updateByPrimaryKey(WebsiteProductbuyinfo record);
    @Update("UPDATE WEBSITE_PRODUCTBUYINFO SET TITLE = #{title},CONTENT=#{content},`ORDER`=#{order},parameter = #{parameter},price=#{price},details=#{details},notice=#{notice} WHERE ID = #{id}")
    int updateByPrimaryKeyNotUrl(WebsiteProductbuyinfo websiteProductbuyinfo);
}