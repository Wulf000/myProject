package cn.beyond.beyond.entity.ul;

import java.util.Date;

public class UlSourceDataHistory {
    private String id;

    private String creditNo;

    private String gradeModel;

    private Float beforeLoanGrade;

    private Float underLoanGrade;

    private Date createTime;

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

    public String getGradeModel() {
        return gradeModel;
    }

    public void setGradeModel(String gradeModel) {
        this.gradeModel = gradeModel == null ? null : gradeModel.trim();
    }

    public Float getBeforeLoanGrade() {
        return beforeLoanGrade;
    }

    public void setBeforeLoanGrade(Float beforeLoanGrade) {
        this.beforeLoanGrade = beforeLoanGrade;
    }

    public Float getUnderLoanGrade() {
        return underLoanGrade;
    }

    public void setUnderLoanGrade(Float underLoanGrade) {
        this.underLoanGrade = underLoanGrade;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}