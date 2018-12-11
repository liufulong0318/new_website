package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class ThScoreSale implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.shopid
     *
     * @mbg.generated
     */
    private Integer shopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.shopcode
     *
     * @mbg.generated
     */
    private String shopcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_score_sale.score
     *
     * @mbg.generated
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table th_score_sale
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.id
     *
     * @return the value of th_score_sale.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.id
     *
     * @param id the value for th_score_sale.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.shopid
     *
     * @return the value of th_score_sale.shopid
     *
     * @mbg.generated
     */
    public Integer getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.shopid
     *
     * @param shopid the value for th_score_sale.shopid
     *
     * @mbg.generated
     */
    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.username
     *
     * @return the value of th_score_sale.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.username
     *
     * @param username the value for th_score_sale.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.createTime
     *
     * @return the value of th_score_sale.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.createTime
     *
     * @param createtime the value for th_score_sale.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.state
     *
     * @return the value of th_score_sale.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.state
     *
     * @param state the value for th_score_sale.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.deleted
     *
     * @return the value of th_score_sale.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.deleted
     *
     * @param deleted the value for th_score_sale.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.shopcode
     *
     * @return the value of th_score_sale.shopcode
     *
     * @mbg.generated
     */
    public String getShopcode() {
        return shopcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.shopcode
     *
     * @param shopcode the value for th_score_sale.shopcode
     *
     * @mbg.generated
     */
    public void setShopcode(String shopcode) {
        this.shopcode = shopcode == null ? null : shopcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_score_sale.score
     *
     * @return the value of th_score_sale.score
     *
     * @mbg.generated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_score_sale.score
     *
     * @param score the value for th_score_sale.score
     *
     * @mbg.generated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_score_sale
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
        sb.append(", shopid=").append(shopid);
        sb.append(", username=").append(username);
        sb.append(", createtime=").append(createtime);
        sb.append(", state=").append(state);
        sb.append(", deleted=").append(deleted);
        sb.append(", shopcode=").append(shopcode);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}