package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteCooperativeuser;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface WebsiteCooperativeuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_cooperativeuser
     *
     * @mbg.generated
     */
    @Delete("delete from website_cooperativeuser where id = #{id}")
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_cooperativeuser
     *
     * @mbg.generated
     */
    @Insert("insert into website_cooperativeuser (id,title,imgurl,`order`,createtime) values (#{id},#{title},#{imgurl},#{order},#{createtime})")
    int insert(WebsiteCooperativeuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_cooperativeuser
     *
     * @mbg.generated
     */
    @Select("select * from website_cooperativeuser where id =#{id}")
    WebsiteCooperativeuser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_cooperativeuser
     *
     * @mbg.generated
     */
    @Select("select * from website_cooperativeuser order by `order` asc")
    List<WebsiteCooperativeuser> selectAll();
    @Select("select * from website_cooperativeuser order by `order` asc limit 0,12")
    List<WebsiteCooperativeuser> selectAll_1_12();
    @Select("select * from website_cooperativeuser order by `order` asc limit 12,12")
    List<WebsiteCooperativeuser> selectAll_13_24();
    @Select("select * from website_cooperativeuser order by `order` asc limit 24,12")
    List<WebsiteCooperativeuser> selectAll_25_36();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_cooperativeuser
     *
     * @mbg.generated
     */
    @Update("update website_cooperativeuser set title = #{title},imgurl=#{imgurl}, `order`= #{order},createtime = #{createtime} where id = #{id}")
    int updateByPrimaryKey(WebsiteCooperativeuser record);

    @Update("update website_cooperativeuser set title = #{title}, `order`= #{order},createtime = #{createtime} where id = #{id}")
    int updateByPrimaryKeyNotUrl(WebsiteCooperativeuser record);

}