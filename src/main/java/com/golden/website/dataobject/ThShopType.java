package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class ThShopType implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_type.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_type.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_type.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_type.introduction
     *
     * @mbg.generated
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_type.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_type.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table th_shop_type
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_type.id
     *
     * @return the value of th_shop_type.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_type.id
     *
     * @param id the value for th_shop_type.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_type.createTime
     *
     * @return the value of th_shop_type.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_type.createTime
     *
     * @param createtime the value for th_shop_type.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_type.deleted
     *
     * @return the value of th_shop_type.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_type.deleted
     *
     * @param deleted the value for th_shop_type.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_type.introduction
     *
     * @return the value of th_shop_type.introduction
     *
     * @mbg.generated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_type.introduction
     *
     * @param introduction the value for th_shop_type.introduction
     *
     * @mbg.generated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_type.name
     *
     * @return the value of th_shop_type.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_type.name
     *
     * @param name the value for th_shop_type.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_type.remark
     *
     * @return the value of th_shop_type.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_type.remark
     *
     * @param remark the value for th_shop_type.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_type
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createtime=").append(createtime);
        sb.append(", deleted=").append(deleted);
        sb.append(", introduction=").append(introduction);
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}