package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class GdRegister implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.loginusername
     *
     * @mbg.generated
     */
    private String loginusername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.loginpwd
     *
     * @mbg.generated
     */
    private String loginpwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.position
     *
     * @mbg.generated
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.companyname
     *
     * @mbg.generated
     */
    private String companyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.companytel
     *
     * @mbg.generated
     */
    private String companytel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.companyadd
     *
     * @mbg.generated
     */
    private String companyadd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.kpzl
     *
     * @mbg.generated
     */
    private String kpzl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.nsrsbh
     *
     * @mbg.generated
     */
    private String nsrsbh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.kptel
     *
     * @mbg.generated
     */
    private String kptel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.khh
     *
     * @mbg.generated
     */
    private String khh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.zh
     *
     * @mbg.generated
     */
    private String zh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.identity
     *
     * @mbg.generated
     */
    private String identity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gd_register.registertime
     *
     * @mbg.generated
     */
    private Date registertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gd_register
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.id
     *
     * @return the value of gd_register.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.id
     *
     * @param id the value for gd_register.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.loginusername
     *
     * @return the value of gd_register.loginusername
     *
     * @mbg.generated
     */
    public String getLoginusername() {
        return loginusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.loginusername
     *
     * @param loginusername the value for gd_register.loginusername
     *
     * @mbg.generated
     */
    public void setLoginusername(String loginusername) {
        this.loginusername = loginusername == null ? null : loginusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.loginpwd
     *
     * @return the value of gd_register.loginpwd
     *
     * @mbg.generated
     */
    public String getLoginpwd() {
        return loginpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.loginpwd
     *
     * @param loginpwd the value for gd_register.loginpwd
     *
     * @mbg.generated
     */
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.username
     *
     * @return the value of gd_register.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.username
     *
     * @param username the value for gd_register.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.position
     *
     * @return the value of gd_register.position
     *
     * @mbg.generated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.position
     *
     * @param position the value for gd_register.position
     *
     * @mbg.generated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.phone
     *
     * @return the value of gd_register.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.phone
     *
     * @param phone the value for gd_register.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.email
     *
     * @return the value of gd_register.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.email
     *
     * @param email the value for gd_register.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.companyname
     *
     * @return the value of gd_register.companyname
     *
     * @mbg.generated
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.companyname
     *
     * @param companyname the value for gd_register.companyname
     *
     * @mbg.generated
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.companytel
     *
     * @return the value of gd_register.companytel
     *
     * @mbg.generated
     */
    public String getCompanytel() {
        return companytel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.companytel
     *
     * @param companytel the value for gd_register.companytel
     *
     * @mbg.generated
     */
    public void setCompanytel(String companytel) {
        this.companytel = companytel == null ? null : companytel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.companyadd
     *
     * @return the value of gd_register.companyadd
     *
     * @mbg.generated
     */
    public String getCompanyadd() {
        return companyadd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.companyadd
     *
     * @param companyadd the value for gd_register.companyadd
     *
     * @mbg.generated
     */
    public void setCompanyadd(String companyadd) {
        this.companyadd = companyadd == null ? null : companyadd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.kpzl
     *
     * @return the value of gd_register.kpzl
     *
     * @mbg.generated
     */
    public String getKpzl() {
        return kpzl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.kpzl
     *
     * @param kpzl the value for gd_register.kpzl
     *
     * @mbg.generated
     */
    public void setKpzl(String kpzl) {
        this.kpzl = kpzl == null ? null : kpzl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.nsrsbh
     *
     * @return the value of gd_register.nsrsbh
     *
     * @mbg.generated
     */
    public String getNsrsbh() {
        return nsrsbh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.nsrsbh
     *
     * @param nsrsbh the value for gd_register.nsrsbh
     *
     * @mbg.generated
     */
    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh == null ? null : nsrsbh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.kptel
     *
     * @return the value of gd_register.kptel
     *
     * @mbg.generated
     */
    public String getKptel() {
        return kptel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.kptel
     *
     * @param kptel the value for gd_register.kptel
     *
     * @mbg.generated
     */
    public void setKptel(String kptel) {
        this.kptel = kptel == null ? null : kptel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.khh
     *
     * @return the value of gd_register.khh
     *
     * @mbg.generated
     */
    public String getKhh() {
        return khh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.khh
     *
     * @param khh the value for gd_register.khh
     *
     * @mbg.generated
     */
    public void setKhh(String khh) {
        this.khh = khh == null ? null : khh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.zh
     *
     * @return the value of gd_register.zh
     *
     * @mbg.generated
     */
    public String getZh() {
        return zh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.zh
     *
     * @param zh the value for gd_register.zh
     *
     * @mbg.generated
     */
    public void setZh(String zh) {
        this.zh = zh == null ? null : zh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.identity
     *
     * @return the value of gd_register.identity
     *
     * @mbg.generated
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.identity
     *
     * @param identity the value for gd_register.identity
     *
     * @mbg.generated
     */
    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gd_register.registertime
     *
     * @return the value of gd_register.registertime
     *
     * @mbg.generated
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gd_register.registertime
     *
     * @param registertime the value for gd_register.registertime
     *
     * @mbg.generated
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gd_register
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
        sb.append(", loginusername=").append(loginusername);
        sb.append(", loginpwd=").append(loginpwd);
        sb.append(", username=").append(username);
        sb.append(", position=").append(position);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", companyname=").append(companyname);
        sb.append(", companytel=").append(companytel);
        sb.append(", companyadd=").append(companyadd);
        sb.append(", kpzl=").append(kpzl);
        sb.append(", nsrsbh=").append(nsrsbh);
        sb.append(", kptel=").append(kptel);
        sb.append(", khh=").append(khh);
        sb.append(", zh=").append(zh);
        sb.append(", identity=").append(identity);
        sb.append(", registertime=").append(registertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}