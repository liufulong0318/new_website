package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteLunbotu;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface WebsiteLunbotuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_lunbotu
     *
     * @mbg.generated
     */
    @Delete("delete from website_lunbotu where id =#{id}")
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_lunbotu
     *
     * @mbg.generated
     */
    @Insert("insert into website_lunbotu (id,name,url,link,`order`,createtime) values (#{id},#{name},#{url},#{link},#{order},#{createtime})")
    int insert(WebsiteLunbotu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_lunbotu
     *
     * @mbg.generated
     */
    @Select("select * from website_lunbotu where id = #{id}")
    WebsiteLunbotu selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_lunbotu
     *
     * @mbg.generated
     */
    @Select("select * from website_lunbotu order by `order` asc")
    List<WebsiteLunbotu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_lunbotu
     *
     * @mbg.generated
     */
    @Update("update website_lunbotu set name = #{name}, url = #{url},link = #{link},`order` = #{order},createtime = #{createtime} where id = #{id}")
    int updateByPrimaryKey(WebsiteLunbotu record);

    @Update("update website_lunbotu set name = #{name}, link = #{link},`order` = #{order},createtime = #{createtime} where id = #{id}")
    int updateByPrimaryKeyNotUrl(WebsiteLunbotu record);
}