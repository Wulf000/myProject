package cn.beyond.beyond.entity.ul;

import java.util.Date;

public class UlGrade {
    private String id;

    private String ruleCode;

    private String ruleName;

    private Float systemGrade;

    private Float artfFixGrade;

    private String artfGradeCode;

    private Float artfGrade;

    private String artfComment;

    private Date gradedTime;

    private String gradeModel;

    private String createTlr;

    private Date createTime;

    private String updateTlr;

    private Date updateTime;

    private String taskId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public Float getSystemGrade() {
        return systemGrade;
    }

    public void setSystemGrade(Float systemGrade) {
        this.systemGrade = systemGrade;
    }

    public Float getArtfFixGrade() {
        return artfFixGrade;
    }

    public void setArtfFixGrade(Float artfFixGrade) {
        this.artfFixGrade = artfFixGrade;
    }

    public String getArtfGradeCode() {
        return artfGradeCode;
    }

    public void setArtfGradeCode(String artfGradeCode) {
        this.artfGradeCode = artfGradeCode == null ? null : artfGradeCode.trim();
    }

    public Float getArtfGrade() {
        return artfGrade;
    }

    public void setArtfGrade(Float artfGrade) {
        this.artfGrade = artfGrade;
    }

    public String getArtfComment() {
        return artfComment;
    }

    public void setArtfComment(String artfComment) {
        this.artfComment = artfComment == null ? null : artfComment.trim();
    }

    public Date getGradedTime() {
        return gradedTime;
    }

    public void setGradedTime(Date gradedTime) {
        this.gradedTime = gradedTime;
    }

    public String getGradeModel() {
        return gradeModel;
    }

    public void setGradeModel(String gradeModel) {
        this.gradeModel = gradeModel == null ? null : gradeModel.trim();
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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }
}