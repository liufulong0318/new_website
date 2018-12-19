package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class WebsiteLunbotu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_lunbotu.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_lunbotu.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_lunbotu.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_lunbotu.link
     *
     * @mbg.generated
     */
    private String link;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_lunbotu.order
     *
     * @mbg.generated
     */
    private Integer order;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_lunbotu.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_lunbotu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_lunbotu.id
     *
     * @return the value of website_lunbotu.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_lunbotu.id
     *
     * @param id the value for website_lunbotu.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_lunbotu.name
     *
     * @return the value of website_lunbotu.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_lunbotu.name
     *
     * @param name the value for website_lunbotu.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_lunbotu.url
     *
     * @return the value of website_lunbotu.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_lunbotu.url
     *
     * @param url the value for website_lunbotu.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_lunbotu.link
     *
     * @return the value of website_lunbotu.link
     *
     * @mbg.generated
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_lunbotu.link
     *
     * @param link the value for website_lunbotu.link
     *
     * @mbg.generated
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_lunbotu.order
     *
     * @return the value of website_lunbotu.order
     *
     * @mbg.generated
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_lunbotu.order
     *
     * @param order the value for website_lunbotu.order
     *
     * @mbg.generated
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_lunbotu.createtime
     *
     * @return the value of website_lunbotu.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_lunbotu.createtime
     *
     * @param createtime the value for website_lunbotu.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_lunbotu
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" {");
        sb.append("\"id\":\"").append(id);
        sb.append("\", \"name\":\"").append(name);
        sb.append("\", \"url\":\"").append(url);
        sb.append("\", \"link\":\"").append(link);
        sb.append("\", \"order\":\"").append(order);
        sb.append("\", \"createtime\":\"").append(createtime);
        sb.append("\"}");
        return sb.toString();
    }
}