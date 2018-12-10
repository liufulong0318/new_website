package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class GcSysinfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.infoId
     *
     * @mbg.generated
     */
    private String infoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.createby
     *
     * @mbg.generated
     */
    private String createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.dataId
     *
     * @mbg.generated
     */
    private String dataid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.source
     *
     * @mbg.generated
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gc_sysinfo.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gc_sysinfo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.infoId
     *
     * @return the value of gc_sysinfo.infoId
     *
     * @mbg.generated
     */
    public String getInfoid() {
        return infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.infoId
     *
     * @param infoid the value for gc_sysinfo.infoId
     *
     * @mbg.generated
     */
    public void setInfoid(String infoid) {
        this.infoid = infoid == null ? null : infoid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.content
     *
     * @return the value of gc_sysinfo.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.content
     *
     * @param content the value for gc_sysinfo.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.createTime
     *
     * @return the value of gc_sysinfo.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.createTime
     *
     * @param createtime the value for gc_sysinfo.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.createby
     *
     * @return the value of gc_sysinfo.createby
     *
     * @mbg.generated
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.createby
     *
     * @param createby the value for gc_sysinfo.createby
     *
     * @mbg.generated
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.dataId
     *
     * @return the value of gc_sysinfo.dataId
     *
     * @mbg.generated
     */
    public String getDataid() {
        return dataid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.dataId
     *
     * @param dataid the value for gc_sysinfo.dataId
     *
     * @mbg.generated
     */
    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.deleted
     *
     * @return the value of gc_sysinfo.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.deleted
     *
     * @param deleted the value for gc_sysinfo.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.source
     *
     * @return the value of gc_sysinfo.source
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.source
     *
     * @param source the value for gc_sysinfo.source
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gc_sysinfo.type
     *
     * @return the value of gc_sysinfo.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gc_sysinfo.type
     *
     * @param type the value for gc_sysinfo.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gc_sysinfo
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", infoid=").append(infoid);
        sb.append(", content=").append(content);
        sb.append(", createtime=").append(createtime);
        sb.append(", createby=").append(createby);
        sb.append(", dataid=").append(dataid);
        sb.append(", deleted=").append(deleted);
        sb.append(", source=").append(source);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}