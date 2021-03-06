package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteInvoice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WebsiteInvoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_invoice
     *
     * @mbg.generated
     */
    @Delete("delete from website_invoice where id = #{id}")
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_invoice
     *
     * @mbg.generated
     */
    @Insert("insert into website_invoice (id,type,tin,phone,bank,bankacount,createtime) values (#{id},#{type},#{tin},#{phone},#{bank},#{bankacount},#{createtime})")
    int insert(WebsiteInvoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_invoice
     *
     * @mbg.generated
     */
    @Select("select id,type,tin,phone,bank,bankacount,createtime from website_invoice where id = #{id}")
    WebsiteInvoice selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_invoice
     *
     * @mbg.generated
     */
    @Select("select id,type,tin,phone,bank,bankacount,createtime from website_invoice")
    List<WebsiteInvoice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_invoice
     *
     * @mbg.generated
     */
    @Update("update website_invoice set type=#{type},tin=#{tin},phone=#{phone},bank=#{bank},bankacount=#{bankacount},createtime=#{createtime} where id = #{id}")
    int updateByPrimaryKey(WebsiteInvoice record);
}