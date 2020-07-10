package cn.beyond.beyond.entity.ul;

import java.math.BigDecimal;
import java.util.Date;

public class UlOperatedVoucher {
    private String id;

    private String taskId;

    private String ciNo;

    private BigDecimal washedBalance;

    private Date createTime;

    private String createTlr;

    private Date updateTime;

    private String updateTlr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getCiNo() {
        return ciNo;
    }

    public void setCiNo(String ciNo) {
        this.ciNo = ciNo == null ? null : ciNo.trim();
    }

    public BigDecimal getWashedBalance() {
        return washedBalance;
    }

    public void setWashedBalance(BigDecimal washedBalance) {
        this.washedBalance = washedBalance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateTlr() {
        return createTlr;
    }

    public void setCreateTlr(String createTlr) {
        this.createTlr = createTlr == null ? null : createTlr.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateTlr() {
        return updateTlr;
    }

    public void setUpdateTlr(String updateTlr) {
        this.updateTlr = updateTlr == null ? null : updateTlr.trim();
    }
}