package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class WebsiteCooperativeuser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_cooperativeuser.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_cooperativeuser.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_cooperativeuser.imgurl
     *
     * @mbg.generated
     */
    private String imgurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_cooperativeuser.order
     *
     * @mbg.generated
     */
    private Integer order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_cooperativeuser.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_cooperativeuser
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_cooperativeuser.id
     *
     * @return the value of website_cooperativeuser.id
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_cooperativeuser.id
     *
     * @param id the value for website_cooperativeuser.id
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_cooperativeuser.title
     *
     * @return the value of website_cooperativeuser.title
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_cooperativeuser.title
     *
     * @param title the value for website_cooperativeuser.title
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_cooperativeuser.imgurl
     *
     * @return the value of website_cooperativeuser.imgurl
     * @mbg.generated
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_cooperativeuser.imgurl
     *
     * @param imgurl the value for website_cooperativeuser.imgurl
     * @mbg.generated
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_cooperativeuser.order
     *
     * @return the value of website_cooperativeuser.order
     * @mbg.generated
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_cooperativeuser.order
     *
     * @param order the value for website_cooperativeuser.order
     * @mbg.generated
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_cooperativeuser.createtime
     *
     * @return the value of website_cooperativeuser.createtime
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_cooperativeuser.createtime
     *
     * @param createtime the value for website_cooperativeuser.createtime
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_cooperativeuser
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" {");
        sb.append(" \"id\":\"").append(id);
        sb.append("\", \"title\":\"").append(title);
        sb.append("\", \"imgurl\":\"").append(imgurl);
        sb.append("\", \"order\":\"").append(order);
        sb.append("\", \"createtime\":\"").append(createtime);
        sb.append("\"}");
        return sb.toString();
    }
}