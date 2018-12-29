package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteAboutus;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WebsiteAboutusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_aboutus
     *
     * @mbg.generated
     */
    @Delete("delete from website_aboutus where id =#{id}")
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_aboutus
     *
     * @mbg.generated
     */
    @Insert("insert into website_aboutus (id,title,imgurl,content,introduction,honor,culture,course,`order`,createtime) values (#{id},#{title},#{imgurl},#{content},#{introduction},#{honor},#{culture},#{course},#{order},#{createtime})")
    int insert(WebsiteAboutus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_aboutus
     *
     * @mbg.generated
     */
    @Select("select * from website_aboutus where id =#{id}")
    WebsiteAboutus selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_aboutus
     *
     * @mbg.generated
     */
    @Select("select * from website_aboutus order by `order` asc")
    List<WebsiteAboutus> selectAll();

    @Select("select * from website_aboutus order by `order` asc limit 0,1")
    WebsiteAboutus selectTopOne();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_aboutus
     *
     * @mbg.generated
     */
    @Update("update website_aboutus set title = #{title},imgurl = #{imgurl},content = #{content},introduction = #{introduction},honor = #{honor},culture = #{culture},course=#{course},`order`=#{order},createtime=#{createtime}")
    int updateByPrimaryKey(WebsiteAboutus record);

    @Update("update website_aboutus set title = #{title},content = #{content},introduction = #{introduction},honor = #{honor},culture = #{culture},course=#{course},`order`=#{order},createtime=#{createtime}")
    int updateByPrimaryKeyNotUrl(WebsiteAboutus record);
}