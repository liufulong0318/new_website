package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class GoldenProjectSqDown implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.projectId
     *
     * @mbg.generated
     */
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.receiveCompany
     *
     * @mbg.generated
     */
    private String receivecompany;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.receivePeople
     *
     * @mbg.generated
     */
    private String receivepeople;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.sendTime
     *
     * @mbg.generated
     */
    private Date sendtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.sendUser
     *
     * @mbg.generated
     */
    private String senduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.sys_createTime
     *
     * @mbg.generated
     */
    private Date sysCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.sys_createUserId
     *
     * @mbg.generated
     */
    private String sysCreateuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.telNo
     *
     * @mbg.generated
     */
    private String telno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.sendType
     *
     * @mbg.generated
     */
    private Integer sendtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_project_sq_down.sqId
     *
     * @mbg.generated
     */
    private Integer sqid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table golden_project_sq_down
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.id
     *
     * @return the value of golden_project_sq_down.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.id
     *
     * @param id the value for golden_project_sq_down.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.projectId
     *
     * @return the value of golden_project_sq_down.projectId
     *
     * @mbg.generated
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.projectId
     *
     * @param projectid the value for golden_project_sq_down.projectId
     *
     * @mbg.generated
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.receiveCompany
     *
     * @return the value of golden_project_sq_down.receiveCompany
     *
     * @mbg.generated
     */
    public String getReceivecompany() {
        return receivecompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.receiveCompany
     *
     * @param receivecompany the value for golden_project_sq_down.receiveCompany
     *
     * @mbg.generated
     */
    public void setReceivecompany(String receivecompany) {
        this.receivecompany = receivecompany == null ? null : receivecompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.receivePeople
     *
     * @return the value of golden_project_sq_down.receivePeople
     *
     * @mbg.generated
     */
    public String getReceivepeople() {
        return receivepeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.receivePeople
     *
     * @param receivepeople the value for golden_project_sq_down.receivePeople
     *
     * @mbg.generated
     */
    public void setReceivepeople(String receivepeople) {
        this.receivepeople = receivepeople == null ? null : receivepeople.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.remark
     *
     * @return the value of golden_project_sq_down.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.remark
     *
     * @param remark the value for golden_project_sq_down.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.sendTime
     *
     * @return the value of golden_project_sq_down.sendTime
     *
     * @mbg.generated
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.sendTime
     *
     * @param sendtime the value for golden_project_sq_down.sendTime
     *
     * @mbg.generated
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.sendUser
     *
     * @return the value of golden_project_sq_down.sendUser
     *
     * @mbg.generated
     */
    public String getSenduser() {
        return senduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.sendUser
     *
     * @param senduser the value for golden_project_sq_down.sendUser
     *
     * @mbg.generated
     */
    public void setSenduser(String senduser) {
        this.senduser = senduser == null ? null : senduser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.sys_createTime
     *
     * @return the value of golden_project_sq_down.sys_createTime
     *
     * @mbg.generated
     */
    public Date getSysCreatetime() {
        return sysCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.sys_createTime
     *
     * @param sysCreatetime the value for golden_project_sq_down.sys_createTime
     *
     * @mbg.generated
     */
    public void setSysCreatetime(Date sysCreatetime) {
        this.sysCreatetime = sysCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.sys_createUserId
     *
     * @return the value of golden_project_sq_down.sys_createUserId
     *
     * @mbg.generated
     */
    public String getSysCreateuserid() {
        return sysCreateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.sys_createUserId
     *
     * @param sysCreateuserid the value for golden_project_sq_down.sys_createUserId
     *
     * @mbg.generated
     */
    public void setSysCreateuserid(String sysCreateuserid) {
        this.sysCreateuserid = sysCreateuserid == null ? null : sysCreateuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.telNo
     *
     * @return the value of golden_project_sq_down.telNo
     *
     * @mbg.generated
     */
    public String getTelno() {
        return telno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.telNo
     *
     * @param telno the value for golden_project_sq_down.telNo
     *
     * @mbg.generated
     */
    public void setTelno(String telno) {
        this.telno = telno == null ? null : telno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.sendType
     *
     * @return the value of golden_project_sq_down.sendType
     *
     * @mbg.generated
     */
    public Integer getSendtype() {
        return sendtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.sendType
     *
     * @param sendtype the value for golden_project_sq_down.sendType
     *
     * @mbg.generated
     */
    public void setSendtype(Integer sendtype) {
        this.sendtype = sendtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_project_sq_down.sqId
     *
     * @return the value of golden_project_sq_down.sqId
     *
     * @mbg.generated
     */
    public Integer getSqid() {
        return sqid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_project_sq_down.sqId
     *
     * @param sqid the value for golden_project_sq_down.sqId
     *
     * @mbg.generated
     */
    public void setSqid(Integer sqid) {
        this.sqid = sqid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_project_sq_down
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
        sb.append(", projectid=").append(projectid);
        sb.append(", receivecompany=").append(receivecompany);
        sb.append(", receivepeople=").append(receivepeople);
        sb.append(", remark=").append(remark);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", senduser=").append(senduser);
        sb.append(", sysCreatetime=").append(sysCreatetime);
        sb.append(", sysCreateuserid=").append(sysCreateuserid);
        sb.append(", telno=").append(telno);
        sb.append(", sendtype=").append(sendtype);
        sb.append(", sqid=").append(sqid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}