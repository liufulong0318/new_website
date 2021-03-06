package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteEnum;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WebsiteEnumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_enum
     *
     * @mbg.generated
     */
    @Delete("delete from website_enum where id =#{id}")
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_enum
     *
     * @mbg.generated
     */
    @Insert("insert into website_enum (id,enumkey,enumvalue,type) values (#{id},#{enumkey},#{enumvalue},#{type})")
    int insert(WebsiteEnum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_enum
     *
     * @mbg.generated
     */
    @Select("select * from website_enum where id = #{id}")
    WebsiteEnum selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_enum
     *
     * @mbg.generated
     */
    @Select("select * from website_enum  order by enumkey asc")
    List<WebsiteEnum> selectAll();

    @Select("select * from website_enum where type = #{type}")
    List<WebsiteEnum> selectAllByType(String type);

    @Select("select * from website_enum where type = #{type}")
    List<WebsiteEnum> selectAllByEnumkey(String enumkey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_enum
     *
     * @mbg.generated
     */
    @Update("update website_enum set enumkey = #{enumkey}, enumvalue = #{enumvalue},type = #{type} where id=#{id}")
    int updateByPrimaryKey(WebsiteEnum record);

    @Select("select * from website_enum where type = 2")
    List<WebsiteEnum> getAllMenu();

    @Select("select * from website_enum where type = 1")
    List<WebsiteEnum> getAllModule();
}