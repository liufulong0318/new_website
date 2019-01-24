package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class WebsiteProductbuyinfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_productbuyinfo.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_productbuyinfo.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_productbuyinfo.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_productbuyinfo.order
     *
     * @mbg.generated
     */
    private Integer order;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_productbuyinfo.imgpath
     *
     * @mbg.generated
     */
    private String imgpath;

    private String parameter;

    private String price;

    private String details;

    private String notice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_productbuyinfo.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_productbuyinfo.createuser
     *
     * @mbg.generated
     */
    private String createuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_productbuyinfo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_productbuyinfo.id
     *
     * @return the value of website_productbuyinfo.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_productbuyinfo.id
     *
     * @param id the value for website_productbuyinfo.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_productbuyinfo.title
     *
     * @return the value of website_productbuyinfo.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_productbuyinfo.title
     *
     * @param title the value for website_productbuyinfo.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_productbuyinfo.content
     *
     * @return the value of website_productbuyinfo.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_productbuyinfo.content
     *
     * @param content the value for website_productbuyinfo.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_productbuyinfo.order
     *
     * @return the value of website_productbuyinfo.order
     *
     * @mbg.generated
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_productbuyinfo.order
     *
     * @param order the value for website_productbuyinfo.order
     *
     * @mbg.generated
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_productbuyinfo.imgpath
     *
     * @return the value of website_productbuyinfo.imgpath
     *
     * @mbg.generated
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_productbuyinfo.imgpath
     *
     * @param imgpath the value for website_productbuyinfo.imgpath
     *
     * @mbg.generated
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_productbuyinfo.createtime
     *
     * @return the value of website_productbuyinfo.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_productbuyinfo.createtime
     *
     * @param createtime the value for website_productbuyinfo.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_productbuyinfo.createuser
     *
     * @return the value of website_productbuyinfo.createuser
     *
     * @mbg.generated
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_productbuyinfo.createuser
     *
     * @param createuser the value for website_productbuyinfo.createuser
     *
     * @mbg.generated
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_productbuyinfo
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" {");
        sb.append("\"id\":\"").append(id);
        sb.append("\", \"title\":\"").append(title);
        sb.append("\", \"content\":\"").append(content);
        sb.append("\", \"order\":\"").append(order);
        sb.append("\", \"imgpath\":\"").append(imgpath);
        sb.append("\", \"createtime\":\"").append(createtime);
        sb.append("\", \"createuser\":\"").append(createuser);
        sb.append("\"}");
        return sb.toString();
    }
}