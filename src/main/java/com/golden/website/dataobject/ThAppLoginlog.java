package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class ThAppLoginlog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_app_loginlog.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_app_loginlog.cerNo
     *
     * @mbg.generated
     */
    private String cerno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_app_loginlog.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table th_app_loginlog
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_app_loginlog.id
     *
     * @return the value of th_app_loginlog.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_app_loginlog.id
     *
     * @param id the value for th_app_loginlog.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_app_loginlog.cerNo
     *
     * @return the value of th_app_loginlog.cerNo
     *
     * @mbg.generated
     */
    public String getCerno() {
        return cerno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_app_loginlog.cerNo
     *
     * @param cerno the value for th_app_loginlog.cerNo
     *
     * @mbg.generated
     */
    public void setCerno(String cerno) {
        this.cerno = cerno == null ? null : cerno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_app_loginlog.createTime
     *
     * @return the value of th_app_loginlog.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_app_loginlog.createTime
     *
     * @param createtime the value for th_app_loginlog.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_app_loginlog
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
        sb.append(", cerno=").append(cerno);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}