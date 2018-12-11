package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class ThShopStore implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_store.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_store.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_store.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_store.shopId
     *
     * @mbg.generated
     */
    private Integer shopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_shop_store.userName
     *
     * @mbg.generated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table th_shop_store
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_store.id
     *
     * @return the value of th_shop_store.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_store.id
     *
     * @param id the value for th_shop_store.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_store.createTime
     *
     * @return the value of th_shop_store.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_store.createTime
     *
     * @param createtime the value for th_shop_store.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_store.deleted
     *
     * @return the value of th_shop_store.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_store.deleted
     *
     * @param deleted the value for th_shop_store.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_store.shopId
     *
     * @return the value of th_shop_store.shopId
     *
     * @mbg.generated
     */
    public Integer getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_store.shopId
     *
     * @param shopid the value for th_shop_store.shopId
     *
     * @mbg.generated
     */
    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_shop_store.userName
     *
     * @return the value of th_shop_store.userName
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_shop_store.userName
     *
     * @param username the value for th_shop_store.userName
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_shop_store
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
        sb.append(", shopid=").append(shopid);
        sb.append(", username=").append(username);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}