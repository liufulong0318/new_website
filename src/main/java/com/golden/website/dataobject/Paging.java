package com.golden.website.dataobject;

import java.io.Serializable;

public class Paging implements Serializable {
    private Integer number = 0;//当前页
    private Integer rows = 2;//每页显示行数
    private Integer total = 0;//总页数
    private Integer start = 0;//开始行
    private Integer end = 10;//结束行

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
        this.start = number*rows;
        this.end = number*rows+rows;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
