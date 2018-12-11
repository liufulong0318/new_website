package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class GoldenMeeting implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.endTime
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjName1
     *
     * @mbg.generated
     */
    private String fjname1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjName2
     *
     * @mbg.generated
     */
    private String fjname2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjName3
     *
     * @mbg.generated
     */
    private String fjname3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjName4
     *
     * @mbg.generated
     */
    private String fjname4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjName5
     *
     * @mbg.generated
     */
    private String fjname5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjUrl1
     *
     * @mbg.generated
     */
    private String fjurl1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjUrl2
     *
     * @mbg.generated
     */
    private String fjurl2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjUrl3
     *
     * @mbg.generated
     */
    private String fjurl3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjUrl4
     *
     * @mbg.generated
     */
    private String fjurl4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.fjUrl5
     *
     * @mbg.generated
     */
    private String fjurl5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.meetingPeople
     *
     * @mbg.generated
     */
    private String meetingpeople;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.peoples
     *
     * @mbg.generated
     */
    private String peoples;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.startTime
     *
     * @mbg.generated
     */
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.sys_createTime
     *
     * @mbg.generated
     */
    private Date sysCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.sys_createUserId
     *
     * @mbg.generated
     */
    private String sysCreateuserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column golden_meeting.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table golden_meeting
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.id
     *
     * @return the value of golden_meeting.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.id
     *
     * @param id the value for golden_meeting.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.address
     *
     * @return the value of golden_meeting.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.address
     *
     * @param address the value for golden_meeting.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.content
     *
     * @return the value of golden_meeting.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.content
     *
     * @param content the value for golden_meeting.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.endTime
     *
     * @return the value of golden_meeting.endTime
     *
     * @mbg.generated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.endTime
     *
     * @param endtime the value for golden_meeting.endTime
     *
     * @mbg.generated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjName1
     *
     * @return the value of golden_meeting.fjName1
     *
     * @mbg.generated
     */
    public String getFjname1() {
        return fjname1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjName1
     *
     * @param fjname1 the value for golden_meeting.fjName1
     *
     * @mbg.generated
     */
    public void setFjname1(String fjname1) {
        this.fjname1 = fjname1 == null ? null : fjname1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjName2
     *
     * @return the value of golden_meeting.fjName2
     *
     * @mbg.generated
     */
    public String getFjname2() {
        return fjname2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjName2
     *
     * @param fjname2 the value for golden_meeting.fjName2
     *
     * @mbg.generated
     */
    public void setFjname2(String fjname2) {
        this.fjname2 = fjname2 == null ? null : fjname2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjName3
     *
     * @return the value of golden_meeting.fjName3
     *
     * @mbg.generated
     */
    public String getFjname3() {
        return fjname3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjName3
     *
     * @param fjname3 the value for golden_meeting.fjName3
     *
     * @mbg.generated
     */
    public void setFjname3(String fjname3) {
        this.fjname3 = fjname3 == null ? null : fjname3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjName4
     *
     * @return the value of golden_meeting.fjName4
     *
     * @mbg.generated
     */
    public String getFjname4() {
        return fjname4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjName4
     *
     * @param fjname4 the value for golden_meeting.fjName4
     *
     * @mbg.generated
     */
    public void setFjname4(String fjname4) {
        this.fjname4 = fjname4 == null ? null : fjname4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjName5
     *
     * @return the value of golden_meeting.fjName5
     *
     * @mbg.generated
     */
    public String getFjname5() {
        return fjname5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjName5
     *
     * @param fjname5 the value for golden_meeting.fjName5
     *
     * @mbg.generated
     */
    public void setFjname5(String fjname5) {
        this.fjname5 = fjname5 == null ? null : fjname5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjUrl1
     *
     * @return the value of golden_meeting.fjUrl1
     *
     * @mbg.generated
     */
    public String getFjurl1() {
        return fjurl1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjUrl1
     *
     * @param fjurl1 the value for golden_meeting.fjUrl1
     *
     * @mbg.generated
     */
    public void setFjurl1(String fjurl1) {
        this.fjurl1 = fjurl1 == null ? null : fjurl1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjUrl2
     *
     * @return the value of golden_meeting.fjUrl2
     *
     * @mbg.generated
     */
    public String getFjurl2() {
        return fjurl2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjUrl2
     *
     * @param fjurl2 the value for golden_meeting.fjUrl2
     *
     * @mbg.generated
     */
    public void setFjurl2(String fjurl2) {
        this.fjurl2 = fjurl2 == null ? null : fjurl2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjUrl3
     *
     * @return the value of golden_meeting.fjUrl3
     *
     * @mbg.generated
     */
    public String getFjurl3() {
        return fjurl3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjUrl3
     *
     * @param fjurl3 the value for golden_meeting.fjUrl3
     *
     * @mbg.generated
     */
    public void setFjurl3(String fjurl3) {
        this.fjurl3 = fjurl3 == null ? null : fjurl3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjUrl4
     *
     * @return the value of golden_meeting.fjUrl4
     *
     * @mbg.generated
     */
    public String getFjurl4() {
        return fjurl4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjUrl4
     *
     * @param fjurl4 the value for golden_meeting.fjUrl4
     *
     * @mbg.generated
     */
    public void setFjurl4(String fjurl4) {
        this.fjurl4 = fjurl4 == null ? null : fjurl4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.fjUrl5
     *
     * @return the value of golden_meeting.fjUrl5
     *
     * @mbg.generated
     */
    public String getFjurl5() {
        return fjurl5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.fjUrl5
     *
     * @param fjurl5 the value for golden_meeting.fjUrl5
     *
     * @mbg.generated
     */
    public void setFjurl5(String fjurl5) {
        this.fjurl5 = fjurl5 == null ? null : fjurl5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.meetingPeople
     *
     * @return the value of golden_meeting.meetingPeople
     *
     * @mbg.generated
     */
    public String getMeetingpeople() {
        return meetingpeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.meetingPeople
     *
     * @param meetingpeople the value for golden_meeting.meetingPeople
     *
     * @mbg.generated
     */
    public void setMeetingpeople(String meetingpeople) {
        this.meetingpeople = meetingpeople == null ? null : meetingpeople.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.name
     *
     * @return the value of golden_meeting.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.name
     *
     * @param name the value for golden_meeting.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.peoples
     *
     * @return the value of golden_meeting.peoples
     *
     * @mbg.generated
     */
    public String getPeoples() {
        return peoples;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.peoples
     *
     * @param peoples the value for golden_meeting.peoples
     *
     * @mbg.generated
     */
    public void setPeoples(String peoples) {
        this.peoples = peoples == null ? null : peoples.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.remark
     *
     * @return the value of golden_meeting.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.remark
     *
     * @param remark the value for golden_meeting.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.startTime
     *
     * @return the value of golden_meeting.startTime
     *
     * @mbg.generated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.startTime
     *
     * @param starttime the value for golden_meeting.startTime
     *
     * @mbg.generated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.sys_createTime
     *
     * @return the value of golden_meeting.sys_createTime
     *
     * @mbg.generated
     */
    public Date getSysCreatetime() {
        return sysCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.sys_createTime
     *
     * @param sysCreatetime the value for golden_meeting.sys_createTime
     *
     * @mbg.generated
     */
    public void setSysCreatetime(Date sysCreatetime) {
        this.sysCreatetime = sysCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.sys_createUserId
     *
     * @return the value of golden_meeting.sys_createUserId
     *
     * @mbg.generated
     */
    public String getSysCreateuserid() {
        return sysCreateuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.sys_createUserId
     *
     * @param sysCreateuserid the value for golden_meeting.sys_createUserId
     *
     * @mbg.generated
     */
    public void setSysCreateuserid(String sysCreateuserid) {
        this.sysCreateuserid = sysCreateuserid == null ? null : sysCreateuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column golden_meeting.type
     *
     * @return the value of golden_meeting.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column golden_meeting.type
     *
     * @param type the value for golden_meeting.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table golden_meeting
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
        sb.append(", address=").append(address);
        sb.append(", content=").append(content);
        sb.append(", endtime=").append(endtime);
        sb.append(", fjname1=").append(fjname1);
        sb.append(", fjname2=").append(fjname2);
        sb.append(", fjname3=").append(fjname3);
        sb.append(", fjname4=").append(fjname4);
        sb.append(", fjname5=").append(fjname5);
        sb.append(", fjurl1=").append(fjurl1);
        sb.append(", fjurl2=").append(fjurl2);
        sb.append(", fjurl3=").append(fjurl3);
        sb.append(", fjurl4=").append(fjurl4);
        sb.append(", fjurl5=").append(fjurl5);
        sb.append(", meetingpeople=").append(meetingpeople);
        sb.append(", name=").append(name);
        sb.append(", peoples=").append(peoples);
        sb.append(", remark=").append(remark);
        sb.append(", starttime=").append(starttime);
        sb.append(", sysCreatetime=").append(sysCreatetime);
        sb.append(", sysCreateuserid=").append(sysCreateuserid);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}