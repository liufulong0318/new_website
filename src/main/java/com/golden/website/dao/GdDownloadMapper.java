package com.golden.website.dao;

import com.golden.website.dataobject.GdDownload;
import java.util.List;

public interface GdDownloadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_download
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_download
     *
     * @mbg.generated
     */
    int insert(GdDownload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_download
     *
     * @mbg.generated
     */
    GdDownload selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_download
     *
     * @mbg.generated
     */
    List<GdDownload> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_download
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GdDownload record);
}