package cn.beyond.beyond.entity.ul;

import java.math.BigDecimal;
import java.util.Date;

public class UlSourceData {
    private String id;

    private String creditNo;

    private String custName;

    private String custCd;

    private BigDecimal formalLimit;

    private BigDecimal tempLimit;

    private Date creditExpire;

    private String status;

    private String prdCode;

    private String prdName;

    private String juriname;

    private String idno;

    private String idtype;

    private String mobile;

    private String taxpayerno;

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

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo == null ? null : creditNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd == null ? null : custCd.trim();
    }

    public BigDecimal getFormalLimit() {
        return formalLimit;
    }

    public void setFormalLimit(BigDecimal formalLimit) {
        this.formalLimit = formalLimit;
    }

    public BigDecimal getTempLimit() {
        return tempLimit;
    }

    public void setTempLimit(BigDecimal tempLimit) {
        this.tempLimit = tempLimit;
    }

    public Date getCreditExpire() {
        return creditExpire;
    }

    public void setCreditExpire(Date creditExpire) {
        this.creditExpire = creditExpire;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    public String getJuriname() {
        return juriname;
    }

    public void setJuriname(String juriname) {
        this.juriname = juriname == null ? null : juriname.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTaxpayerno() {
        return taxpayerno;
    }

    public void setTaxpayerno(String taxpayerno) {
        this.taxpayerno = taxpayerno == null ? null : taxpayerno.trim();
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