package com.golden.website.dataobject;

import java.io.Serializable;

public class ThMember implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_member.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_member.busid
     *
     * @mbg.generated
     */
    private Integer busid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_member.cusno
     *
     * @mbg.generated
     */
    private String cusno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table th_member
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_member.id
     *
     * @return the value of th_member.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_member.id
     *
     * @param id the value for th_member.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_member.busid
     *
     * @return the value of th_member.busid
     *
     * @mbg.generated
     */
    public Integer getBusid() {
        return busid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_member.busid
     *
     * @param busid the value for th_member.busid
     *
     * @mbg.generated
     */
    public void setBusid(Integer busid) {
        this.busid = busid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_member.cusno
     *
     * @return the value of th_member.cusno
     *
     * @mbg.generated
     */
    public String getCusno() {
        return cusno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_member.cusno
     *
     * @param cusno the value for th_member.cusno
     *
     * @mbg.generated
     */
    public void setCusno(String cusno) {
        this.cusno = cusno == null ? null : cusno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_member
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
        sb.append(", busid=").append(busid);
        sb.append(", cusno=").append(cusno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}