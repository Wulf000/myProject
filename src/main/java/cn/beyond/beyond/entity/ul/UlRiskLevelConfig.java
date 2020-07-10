package cn.beyond.beyond.entity.ul;

import java.util.Date;

public class UlRiskLevelConfig {
    private String id;

    private String levelName;

    private Integer execInterval;

    private Float gradeMin;

    private Float gradeMax;

    private String gradeType;

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

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getExecInterval() {
        return execInterval;
    }

    public void setExecInterval(Integer execInterval) {
        this.execInterval = execInterval;
    }

    public Float getGradeMin() {
        return gradeMin;
    }

    public void setGradeMin(Float gradeMin) {
        this.gradeMin = gradeMin;
    }

    public Float getGradeMax() {
        return gradeMax;
    }

    public void setGradeMax(Float gradeMax) {
        this.gradeMax = gradeMax;
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType == null ? null : gradeType.trim();
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