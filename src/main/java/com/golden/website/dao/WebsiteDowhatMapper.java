package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteDowhat;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WebsiteDowhatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_dowhat
     *
     * @mbg.generated
     */
    @Delete("delete from website_dowhat where id =#{id}")
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_dowhat
     *
     * @mbg.generated
     */
    @Insert("insert into website_dowhat (id,iconurl,title,hrefurl,`order`,createtime) values (#{id},#{iconUrl},#{title},#{hrefUrl},#{order},#{createtime})")
    int insert(WebsiteDowhat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_dowhat
     *
     * @mbg.generated
     */
    @Select("select * from website_dowhat where id = #{id}")
    WebsiteDowhat selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_dowhat
     *
     * @mbg.generated
     */
    @Select("select * from website_dowhat order by `order` asc limit 3")
    List<WebsiteDowhat> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_dowhat
     *
     * @mbg.generated
     */
    @Update("update website_dowhat set title=#{title},hrefUrl=#{hrefUrl},iconUrl=#{iconUrl},`order` = #{order},createtime = #{createtime} where id = #{id}")
    int updateByPrimaryKey(WebsiteDowhat record);
    @Update("update website_dowhat set title=#{title},hrefUrl=#{hrefUrl},`order` = #{order},createtime = #{createtime} where id = #{id}")
    int updateByPrimaryKeyNotUrl(WebsiteDowhat record);
}