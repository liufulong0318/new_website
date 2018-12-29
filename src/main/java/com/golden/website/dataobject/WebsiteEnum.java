package com.golden.website.dataobject;

import java.io.Serializable;

public class WebsiteEnum implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_enum.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_enum.enum_key
     *
     * @mbg.generated
     */
    private Integer enumkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_enum.enum_value
     *
     * @mbg.generated
     */
    private String enumvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_enum.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_enum
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_enum.id
     *
     * @return the value of website_enum.id
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_enum.id
     *
     * @param id the value for website_enum.id
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_enum.enum_key
     *
     * @return the value of website_enum.enum_key
     * @mbg.generated
     */
    public Integer getEnumkey() {
        return enumkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_enum.enum_key
     *
     * @param enumKey the value for website_enum.enum_key
     * @mbg.generated
     */
    public void setEnumkey(Integer enumkey) {
        this.enumkey = enumkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_enum.enum_value
     *
     * @return the value of website_enum.enum_value
     * @mbg.generated
     */
    public String getEnumvalue() {
        return enumvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_enum.enum_value
     *
     * @param enumValue the value for website_enum.enum_value
     * @mbg.generated
     */
    public void setEnumvalue(String enumvalue) {
        this.enumvalue = enumvalue == null ? null : enumvalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_enum.type
     *
     * @return the value of website_enum.type
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_enum.type
     *
     * @param type the value for website_enum.type
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_enum
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" {");
        sb.append(" \"id\":\"").append(id);
        sb.append("\", \"enumkey\":\"").append(enumkey);
        sb.append("\", \"enumvalue\":\"").append(enumvalue);
        sb.append("\", \"type\":\"").append(type);
        sb.append("\"}");
        return sb.toString();
    }
}