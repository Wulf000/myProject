package cn.beyond.beyond.entity.ul;

import java.util.Date;

public class UlOperatedTask {
    private String id;

    private String creditNo;

    private String custCd;

    private String custName;

    private String operType;

    private String status;

    private String createTlr;

    private Date createTime;

    private String updateTlr;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo == null ? null : creditNo.trim();
    }

    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd == null ? null : custCd.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateTlr() {
        return createTlr;
    }

    public void setCreateTlr(String createTlr) {
        this.createTlr = createTlr == null ? null : createTlr.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTlr() {
        return updateTlr;
    }

    public void setUpdateTlr(String updateTlr) {
        this.updateTlr = updateTlr == null ? null : updateTlr.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}