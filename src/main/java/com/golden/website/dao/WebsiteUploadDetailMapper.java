package com.golden.website.dao;

import com.golden.website.dataobject.WebsiteUploadDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface WebsiteUploadDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_upload_detail
     *
     * @mbg.generated
     */
    @Delete("UPDATE website_upload_detail SET isdelete = '1' where fileid = #{fileid}")
    int deleteByPrimaryKey(Integer fileid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_upload_detail
     *
     * @mbg.generated
     */
    @Insert("INSERT INTO website_upload_detail SET filename = #{filename},fileupdate=#{fileupdate},filepath=#{filepath},fileuploader=#{fileuploader},isdelete=#{isdelete},filedesc=#{filedesc},filetype=#{filetype}")
    int insert(WebsiteUploadDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_upload_detail
     *
     * @mbg.generated
     */
    WebsiteUploadDetail selectByPrimaryKey(Integer fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_upload_detail
     *
     * @mbg.generated
     */
    @Select("SELECT fileid,filename,fileupdate,filepath,fileuploader,isdelete,filedesc,filetype  FROM website_upload_detail WHERE  isdelete = '0' "  )
    List<WebsiteUploadDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_upload_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WebsiteUploadDetail record);
}