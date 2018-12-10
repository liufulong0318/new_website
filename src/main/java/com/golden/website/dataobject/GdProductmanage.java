package com.golden.website.dataobject;

import java.io.Serializable;

public class GdProductmanage implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.imgURL
     *
     * @mbg.generated
     */
    private String imgurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.introduce
     *
     * @mbg.generated
     */
    private String introduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.price
     *
     * @mbg.generated
     */
    private Long price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.option_tm
     *
     * @mbg.generated
     */
    private String optionTm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.rank
     *
     * @mbg.generated
     */
    private Integer rank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.basic_version
     *
     * @mbg.generated
     */
    private String basicVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.detailsImgUrl
     *
     * @mbg.generated
     */
    private String detailsimgurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.label
     *
     * @mbg.generated
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.module_version
     *
     * @mbg.generated
     */
    private String moduleVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.notesToBuy
     *
     * @mbg.generated
     */
    private String notestobuy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.sys_type
     *
     * @mbg.generated
     */
    private String sysType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_productmanage.baiduyun
     *
     * @mbg.generated
     */
    private String baiduyun;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gd_productmanage
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.id
     *
     * @return the value of gd_productmanage.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.id
     *
     * @param id the value for gd_productmanage.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.imgURL
     *
     * @return the value of gd_productmanage.imgURL
     *
     * @mbg.generated
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.imgURL
     *
     * @param imgurl the value for gd_productmanage.imgURL
     *
     * @mbg.generated
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.title
     *
     * @return the value of gd_productmanage.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.title
     *
     * @param title the value for gd_productmanage.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.introduce
     *
     * @return the value of gd_productmanage.introduce
     *
     * @mbg.generated
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.introduce
     *
     * @param introduce the value for gd_productmanage.introduce
     *
     * @mbg.generated
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.price
     *
     * @return the value of gd_productmanage.price
     *
     * @mbg.generated
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.price
     *
     * @param price the value for gd_productmanage.price
     *
     * @mbg.generated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.remarks
     *
     * @return the value of gd_productmanage.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.remarks
     *
     * @param remarks the value for gd_productmanage.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.option_tm
     *
     * @return the value of gd_productmanage.option_tm
     *
     * @mbg.generated
     */
    public String getOptionTm() {
        return optionTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.option_tm
     *
     * @param optionTm the value for gd_productmanage.option_tm
     *
     * @mbg.generated
     */
    public void setOptionTm(String optionTm) {
        this.optionTm = optionTm == null ? null : optionTm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.rank
     *
     * @return the value of gd_productmanage.rank
     *
     * @mbg.generated
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.rank
     *
     * @param rank the value for gd_productmanage.rank
     *
     * @mbg.generated
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.basic_version
     *
     * @return the value of gd_productmanage.basic_version
     *
     * @mbg.generated
     */
    public String getBasicVersion() {
        return basicVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.basic_version
     *
     * @param basicVersion the value for gd_productmanage.basic_version
     *
     * @mbg.generated
     */
    public void setBasicVersion(String basicVersion) {
        this.basicVersion = basicVersion == null ? null : basicVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.detailsImgUrl
     *
     * @return the value of gd_productmanage.detailsImgUrl
     *
     * @mbg.generated
     */
    public String getDetailsimgurl() {
        return detailsimgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.detailsImgUrl
     *
     * @param detailsimgurl the value for gd_productmanage.detailsImgUrl
     *
     * @mbg.generated
     */
    public void setDetailsimgurl(String detailsimgurl) {
        this.detailsimgurl = detailsimgurl == null ? null : detailsimgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.label
     *
     * @return the value of gd_productmanage.label
     *
     * @mbg.generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.label
     *
     * @param label the value for gd_productmanage.label
     *
     * @mbg.generated
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.module_version
     *
     * @return the value of gd_productmanage.module_version
     *
     * @mbg.generated
     */
    public String getModuleVersion() {
        return moduleVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.module_version
     *
     * @param moduleVersion the value for gd_productmanage.module_version
     *
     * @mbg.generated
     */
    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion == null ? null : moduleVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.notesToBuy
     *
     * @return the value of gd_productmanage.notesToBuy
     *
     * @mbg.generated
     */
    public String getNotestobuy() {
        return notestobuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.notesToBuy
     *
     * @param notestobuy the value for gd_productmanage.notesToBuy
     *
     * @mbg.generated
     */
    public void setNotestobuy(String notestobuy) {
        this.notestobuy = notestobuy == null ? null : notestobuy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.sys_type
     *
     * @return the value of gd_productmanage.sys_type
     *
     * @mbg.generated
     */
    public String getSysType() {
        return sysType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.sys_type
     *
     * @param sysType the value for gd_productmanage.sys_type
     *
     * @mbg.generated
     */
    public void setSysType(String sysType) {
        this.sysType = sysType == null ? null : sysType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_productmanage.baiduyun
     *
     * @return the value of gd_productmanage.baiduyun
     *
     * @mbg.generated
     */
    public String getBaiduyun() {
        return baiduyun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_productmanage.baiduyun
     *
     * @param baiduyun the value for gd_productmanage.baiduyun
     *
     * @mbg.generated
     */
    public void setBaiduyun(String baiduyun) {
        this.baiduyun = baiduyun == null ? null : baiduyun.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_productmanage
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
        sb.append(", imgurl=").append(imgurl);
        sb.append(", title=").append(title);
        sb.append(", introduce=").append(introduce);
        sb.append(", price=").append(price);
        sb.append(", remarks=").append(remarks);
        sb.append(", optionTm=").append(optionTm);
        sb.append(", rank=").append(rank);
        sb.append(", basicVersion=").append(basicVersion);
        sb.append(", detailsimgurl=").append(detailsimgurl);
        sb.append(", label=").append(label);
        sb.append(", moduleVersion=").append(moduleVersion);
        sb.append(", notestobuy=").append(notestobuy);
        sb.append(", sysType=").append(sysType);
        sb.append(", baiduyun=").append(baiduyun);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}