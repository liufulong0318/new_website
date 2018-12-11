package com.golden.website.dataobject;

import java.io.Serializable;

public class ThQuestion implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.ask1
     *
     * @mbg.generated
     */
    private String ask1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.ask2
     *
     * @mbg.generated
     */
    private String ask2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.ask3
     *
     * @mbg.generated
     */
    private String ask3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.ask4
     *
     * @mbg.generated
     */
    private String ask4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.askCount
     *
     * @mbg.generated
     */
    private String askcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.askNo
     *
     * @mbg.generated
     */
    private Integer askno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.deleted
     *
     * @mbg.generated
     */
    private Integer deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.moudle
     *
     * @mbg.generated
     */
    private String moudle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column th_question.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table th_question
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.id
     *
     * @return the value of th_question.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.id
     *
     * @param id the value for th_question.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.ask1
     *
     * @return the value of th_question.ask1
     *
     * @mbg.generated
     */
    public String getAsk1() {
        return ask1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.ask1
     *
     * @param ask1 the value for th_question.ask1
     *
     * @mbg.generated
     */
    public void setAsk1(String ask1) {
        this.ask1 = ask1 == null ? null : ask1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.ask2
     *
     * @return the value of th_question.ask2
     *
     * @mbg.generated
     */
    public String getAsk2() {
        return ask2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.ask2
     *
     * @param ask2 the value for th_question.ask2
     *
     * @mbg.generated
     */
    public void setAsk2(String ask2) {
        this.ask2 = ask2 == null ? null : ask2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.ask3
     *
     * @return the value of th_question.ask3
     *
     * @mbg.generated
     */
    public String getAsk3() {
        return ask3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.ask3
     *
     * @param ask3 the value for th_question.ask3
     *
     * @mbg.generated
     */
    public void setAsk3(String ask3) {
        this.ask3 = ask3 == null ? null : ask3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.ask4
     *
     * @return the value of th_question.ask4
     *
     * @mbg.generated
     */
    public String getAsk4() {
        return ask4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.ask4
     *
     * @param ask4 the value for th_question.ask4
     *
     * @mbg.generated
     */
    public void setAsk4(String ask4) {
        this.ask4 = ask4 == null ? null : ask4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.askCount
     *
     * @return the value of th_question.askCount
     *
     * @mbg.generated
     */
    public String getAskcount() {
        return askcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.askCount
     *
     * @param askcount the value for th_question.askCount
     *
     * @mbg.generated
     */
    public void setAskcount(String askcount) {
        this.askcount = askcount == null ? null : askcount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.askNo
     *
     * @return the value of th_question.askNo
     *
     * @mbg.generated
     */
    public Integer getAskno() {
        return askno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.askNo
     *
     * @param askno the value for th_question.askNo
     *
     * @mbg.generated
     */
    public void setAskno(Integer askno) {
        this.askno = askno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.deleted
     *
     * @return the value of th_question.deleted
     *
     * @mbg.generated
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.deleted
     *
     * @param deleted the value for th_question.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.moudle
     *
     * @return the value of th_question.moudle
     *
     * @mbg.generated
     */
    public String getMoudle() {
        return moudle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.moudle
     *
     * @param moudle the value for th_question.moudle
     *
     * @mbg.generated
     */
    public void setMoudle(String moudle) {
        this.moudle = moudle == null ? null : moudle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column th_question.title
     *
     * @return the value of th_question.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column th_question.title
     *
     * @param title the value for th_question.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table th_question
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
        sb.append(", ask1=").append(ask1);
        sb.append(", ask2=").append(ask2);
        sb.append(", ask3=").append(ask3);
        sb.append(", ask4=").append(ask4);
        sb.append(", askcount=").append(askcount);
        sb.append(", askno=").append(askno);
        sb.append(", deleted=").append(deleted);
        sb.append(", moudle=").append(moudle);
        sb.append(", title=").append(title);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}