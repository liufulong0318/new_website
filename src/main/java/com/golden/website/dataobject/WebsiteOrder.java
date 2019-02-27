package com.golden.website.dataobject;

import java.io.Serializable;
import java.util.Date;

public class WebsiteOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.id
     *
     * @mbg.generated
     */
    private String id;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.orderNum
     *
     * @mbg.generated
     */
    private String orderNum;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.product_name
     *
     * @mbg.generated
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.product_tag
     *
     * @mbg.generated
     */
    private Integer productTag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.product_total
     *
     * @mbg.generated
     */
    private Integer productTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.product_purchaser
     *
     * @mbg.generated
     */
    private String productPurchaser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.product_phone
     *
     * @mbg.generated
     */
    private String productPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.payment_status
     *
     * @mbg.generated
     */
    private String paymentStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.payment_method
     *
     * @mbg.generated
     */
    private String paymentMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.payment_time
     *
     * @mbg.generated
     */
    private Date paymentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.order_time
     *
     * @mbg.generated
     */
    private Date orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.option_name
     *
     * @mbg.generated
     */
    private String optionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.optiion_time
     *
     * @mbg.generated
     */
    private Date optiionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.receiving_method
     *
     * @mbg.generated
     */
    private String receivingMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.receiving_address
     *
     * @mbg.generated
     */
    private String receivingAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.receiving_name
     *
     * @mbg.generated
     */
    private String receivingName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.receiving_phone
     *
     * @mbg.generated
     */
    private String receivingPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.receiving_status
     *
     * @mbg.generated
     */
    private String receivingStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.sender
     *
     * @mbg.generated
     */
    private String sender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.express_company_name
     *
     * @mbg.generated
     */
    private String expressCompanyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.express_num
     *
     * @mbg.generated
     */
    private String expressNum;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.express_out_time
     *
     * @mbg.generated
     */
    private Date expressOutTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column website_order.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.id
     *
     * @return the value of website_order.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.id
     *
     * @param id the value for website_order.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.product_name
     *
     * @return the value of website_order.product_name
     *
     * @mbg.generated
     */
    public String getProductName() {
        return productName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.product_name
     *
     * @param productName the value for website_order.product_name
     *
     * @mbg.generated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.product_tag
     *
     * @return the value of website_order.product_tag
     *
     * @mbg.generated
     */
    public Integer getProductTag() {
        return productTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.product_tag
     *
     * @param productTag the value for website_order.product_tag
     *
     * @mbg.generated
     */
    public void setProductTag(Integer productTag) {
        this.productTag = productTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.product_total
     *
     * @return the value of website_order.product_total
     *
     * @mbg.generated
     */
    public Integer getProductTotal() {
        return productTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.product_total
     *
     * @param productTotal the value for website_order.product_total
     *
     * @mbg.generated
     */
    public void setProductTotal(Integer productTotal) {
        this.productTotal = productTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.product_purchaser
     *
     * @return the value of website_order.product_purchaser
     *
     * @mbg.generated
     */
    public String getProductPurchaser() {
        return productPurchaser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.product_purchaser
     *
     * @param productPurchaser the value for website_order.product_purchaser
     *
     * @mbg.generated
     */
    public void setProductPurchaser(String productPurchaser) {
        this.productPurchaser = productPurchaser == null ? null : productPurchaser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.product_phone
     *
     * @return the value of website_order.product_phone
     *
     * @mbg.generated
     */
    public String getProductPhone() {
        return productPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.product_phone
     *
     * @param productPhone the value for website_order.product_phone
     *
     * @mbg.generated
     */
    public void setProductPhone(String productPhone) {
        this.productPhone = productPhone == null ? null : productPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.payment_status
     *
     * @return the value of website_order.payment_status
     *
     * @mbg.generated
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.payment_status
     *
     * @param paymentStatus the value for website_order.payment_status
     *
     * @mbg.generated
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus == null ? null : paymentStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.payment_method
     *
     * @return the value of website_order.payment_method
     *
     * @mbg.generated
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.payment_method
     *
     * @param paymentMethod the value for website_order.payment_method
     *
     * @mbg.generated
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.payment_time
     *
     * @return the value of website_order.payment_time
     *
     * @mbg.generated
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.payment_time
     *
     * @param paymentTime the value for website_order.payment_time
     *
     * @mbg.generated
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.order_time
     *
     * @return the value of website_order.order_time
     *
     * @mbg.generated
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.order_time
     *
     * @param orderTime the value for website_order.order_time
     *
     * @mbg.generated
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.option_name
     *
     * @return the value of website_order.option_name
     *
     * @mbg.generated
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.option_name
     *
     * @param optionName the value for website_order.option_name
     *
     * @mbg.generated
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.optiion_time
     *
     * @return the value of website_order.optiion_time
     *
     * @mbg.generated
     */
    public Date getOptiionTime() {
        return optiionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.optiion_time
     *
     * @param optiionTime the value for website_order.optiion_time
     *
     * @mbg.generated
     */
    public void setOptiionTime(Date optiionTime) {
        this.optiionTime = optiionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.receiving_method
     *
     * @return the value of website_order.receiving_method
     *
     * @mbg.generated
     */
    public String getReceivingMethod() {
        return receivingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.receiving_method
     *
     * @param receivingMethod the value for website_order.receiving_method
     *
     * @mbg.generated
     */
    public void setReceivingMethod(String receivingMethod) {
        this.receivingMethod = receivingMethod == null ? null : receivingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.receiving_address
     *
     * @return the value of website_order.receiving_address
     *
     * @mbg.generated
     */
    public String getReceivingAddress() {
        return receivingAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.receiving_address
     *
     * @param receivingAddress the value for website_order.receiving_address
     *
     * @mbg.generated
     */
    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress == null ? null : receivingAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.receiving_name
     *
     * @return the value of website_order.receiving_name
     *
     * @mbg.generated
     */
    public String getReceivingName() {
        return receivingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.receiving_name
     *
     * @param receivingName the value for website_order.receiving_name
     *
     * @mbg.generated
     */
    public void setReceivingName(String receivingName) {
        this.receivingName = receivingName == null ? null : receivingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.receiving_phone
     *
     * @return the value of website_order.receiving_phone
     *
     * @mbg.generated
     */
    public String getReceivingPhone() {
        return receivingPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.receiving_phone
     *
     * @param receivingPhone the value for website_order.receiving_phone
     *
     * @mbg.generated
     */
    public void setReceivingPhone(String receivingPhone) {
        this.receivingPhone = receivingPhone == null ? null : receivingPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.receiving_status
     *
     * @return the value of website_order.receiving_status
     *
     * @mbg.generated
     */
    public String getReceivingStatus() {
        return receivingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.receiving_status
     *
     * @param receivingStatus the value for website_order.receiving_status
     *
     * @mbg.generated
     */
    public void setReceivingStatus(String receivingStatus) {
        this.receivingStatus = receivingStatus == null ? null : receivingStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.sender
     *
     * @return the value of website_order.sender
     *
     * @mbg.generated
     */
    public String getSender() {
        return sender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.sender
     *
     * @param sender the value for website_order.sender
     *
     * @mbg.generated
     */
    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.express_company_name
     *
     * @return the value of website_order.express_company_name
     *
     * @mbg.generated
     */
    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.express_company_name
     *
     * @param expressCompanyName the value for website_order.express_company_name
     *
     * @mbg.generated
     */
    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName == null ? null : expressCompanyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column website_order.express_out_time
     *
     * @return the value of website_order.express_out_time
     *
     * @mbg.generated
     */
    public Date getExpressOutTime() {
        return expressOutTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column website_order.express_out_time
     *
     * @param expressOutTime the value for website_order.express_out_time
     *
     * @mbg.generated
     */
    public void setExpressOutTime(Date expressOutTime) {
        this.expressOutTime = expressOutTime;
    }

    public String getExpressNum() {
        return expressNum;
    }

    public void setExpressNum(String expressNum) {
        this.expressNum = expressNum;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_order
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" {");
        sb.append("\"id\":\"").append(id);
        sb.append(",\"productName\":\"").append(productName);
        sb.append(",\"productTag\":\"").append(productTag);
        sb.append(",\"productTotal\":\"").append(productTotal);
        sb.append(",\"productPurchaser\":\"").append(productPurchaser);
        sb.append(",\"productPhone\":\"").append(productPhone);
        sb.append(",\"paymentStatus\":\"").append(paymentStatus);
        sb.append(",\"paymentMethod\":\"").append(paymentMethod);
        sb.append(",\"paymentTime\":\"").append(paymentTime);
        sb.append(",\"orderTime\":\"").append(orderTime);
        sb.append(",\"optionName\":\"").append(optionName);
        sb.append(",\"optiionTime\":\"").append(optiionTime);
        sb.append(",\"receivingMethod\":\"").append(receivingMethod);
        sb.append(",\"receivingAddress\":\"").append(receivingAddress);
        sb.append(",\"receivingName\":\"").append(receivingName);
        sb.append(",\"receivingPhone\":\"").append(receivingPhone);
        sb.append(",\"receivingStatus\":\"").append(receivingStatus);
        sb.append(",\"sender\":\"").append(sender);
        sb.append(",\"expressCompanyName\":\"").append(expressCompanyName);
        sb.append(",\"expressNum\":\"").append(expressNum);
        sb.append(",\"expressOutTime\":\"").append(expressOutTime);
        sb.append(",\"remarks\":\"").append(remarks);
        sb.append("\"}");
        return sb.toString();
    }
}