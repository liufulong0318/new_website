package com.golden.website.dataobject;

import java.io.Serializable;

public class MzProvince implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_province.id
     *
     * @mbg.generated
     */
    private Short id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_province.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_province.parentid
     *
     * @mbg.generated
     */
    private Short parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_province.deleted
     *
     * @mbg.generated
     */
    private Short deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_province.sortNo
     *
     * @mbg.generated
     */
    private Short sortno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_province.state
     *
     * @mbg.generated
     */
    private Short state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mz_province
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_province.id
     *
     * @return the value of mz_province.id
     *
     * @mbg.generated
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_province.id
     *
     * @param id the value for mz_province.id
     *
     * @mbg.generated
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_province.name
     *
     * @return the value of mz_province.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_province.name
     *
     * @param name the value for mz_province.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_province.parentid
     *
     * @return the value of mz_province.parentid
     *
     * @mbg.generated
     */
    public Short getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_province.parentid
     *
     * @param parentid the value for mz_province.parentid
     *
     * @mbg.generated
     */
    public void setParentid(Short parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_province.deleted
     *
     * @return the value of mz_province.deleted
     *
     * @mbg.generated
     */
    public Short getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_province.deleted
     *
     * @param deleted the value for mz_province.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_province.sortNo
     *
     * @return the value of mz_province.sortNo
     *
     * @mbg.generated
     */
    public Short getSortno() {
        return sortno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_province.sortNo
     *
     * @param sortno the value for mz_province.sortNo
     *
     * @mbg.generated
     */
    public void setSortno(Short sortno) {
        this.sortno = sortno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_province.state
     *
     * @return the value of mz_province.state
     *
     * @mbg.generated
     */
    public Short getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_province.state
     *
     * @param state the value for mz_province.state
     *
     * @mbg.generated
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mz_province
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
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", deleted=").append(deleted);
        sb.append(", sortno=").append(sortno);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}