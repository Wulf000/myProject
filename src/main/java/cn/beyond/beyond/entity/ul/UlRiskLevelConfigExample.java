package cn.beyond.beyond.entity.ul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UlRiskLevelConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UlRiskLevelConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("level_name =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("level_name >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("level_name <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("level_name like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("level_name not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("level_name in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andExecIntervalIsNull() {
            addCriterion("exec_interval is null");
            return (Criteria) this;
        }

        public Criteria andExecIntervalIsNotNull() {
            addCriterion("exec_interval is not null");
            return (Criteria) this;
        }

        public Criteria andExecIntervalEqualTo(Integer value) {
            addCriterion("exec_interval =", value, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalNotEqualTo(Integer value) {
            addCriterion("exec_interval <>", value, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalGreaterThan(Integer value) {
            addCriterion("exec_interval >", value, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("exec_interval >=", value, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalLessThan(Integer value) {
            addCriterion("exec_interval <", value, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("exec_interval <=", value, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalIn(List<Integer> values) {
            addCriterion("exec_interval in", values, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalNotIn(List<Integer> values) {
            addCriterion("exec_interval not in", values, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalBetween(Integer value1, Integer value2) {
            addCriterion("exec_interval between", value1, value2, "execInterval");
            return (Criteria) this;
        }

        public Criteria andExecIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("exec_interval not between", value1, value2, "execInterval");
            return (Criteria) this;
        }

        public Criteria andGradeMinIsNull() {
            addCriterion("grade_min is null");
            return (Criteria) this;
        }

        public Criteria andGradeMinIsNotNull() {
            addCriterion("grade_min is not null");
            return (Criteria) this;
        }

        public Criteria andGradeMinEqualTo(Float value) {
            addCriterion("grade_min =", value, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinNotEqualTo(Float value) {
            addCriterion("grade_min <>", value, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinGreaterThan(Float value) {
            addCriterion("grade_min >", value, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinGreaterThanOrEqualTo(Float value) {
            addCriterion("grade_min >=", value, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinLessThan(Float value) {
            addCriterion("grade_min <", value, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinLessThanOrEqualTo(Float value) {
            addCriterion("grade_min <=", value, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinIn(List<Float> values) {
            addCriterion("grade_min in", values, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinNotIn(List<Float> values) {
            addCriterion("grade_min not in", values, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinBetween(Float value1, Float value2) {
            addCriterion("grade_min between", value1, value2, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMinNotBetween(Float value1, Float value2) {
            addCriterion("grade_min not between", value1, value2, "gradeMin");
            return (Criteria) this;
        }

        public Criteria andGradeMaxIsNull() {
            addCriterion("grade_max is null");
            return (Criteria) this;
        }

        public Criteria andGradeMaxIsNotNull() {
            addCriterion("grade_max is not null");
            return (Criteria) this;
        }

        public Criteria andGradeMaxEqualTo(Float value) {
            addCriterion("grade_max =", value, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxNotEqualTo(Float value) {
            addCriterion("grade_max <>", value, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxGreaterThan(Float value) {
            addCriterion("grade_max >", value, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxGreaterThanOrEqualTo(Float value) {
            addCriterion("grade_max >=", value, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxLessThan(Float value) {
            addCriterion("grade_max <", value, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxLessThanOrEqualTo(Float value) {
            addCriterion("grade_max <=", value, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxIn(List<Float> values) {
            addCriterion("grade_max in", values, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxNotIn(List<Float> values) {
            addCriterion("grade_max not in", values, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxBetween(Float value1, Float value2) {
            addCriterion("grade_max between", value1, value2, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeMaxNotBetween(Float value1, Float value2) {
            addCriterion("grade_max not between", value1, value2, "gradeMax");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNull() {
            addCriterion("grade_type is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNotNull() {
            addCriterion("grade_type is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeEqualTo(String value) {
            addCriterion("grade_type =", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotEqualTo(String value) {
            addCriterion("grade_type <>", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThan(String value) {
            addCriterion("grade_type >", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("grade_type >=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThan(String value) {
            addCriterion("grade_type <", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThanOrEqualTo(String value) {
            addCriterion("grade_type <=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLike(String value) {
            addCriterion("grade_type like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotLike(String value) {
            addCriterion("grade_type not like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIn(List<String> values) {
            addCriterion("grade_type in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotIn(List<String> values) {
            addCriterion("grade_type not in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeBetween(String value1, String value2) {
            addCriterion("grade_type between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotBetween(String value1, String value2) {
            addCriterion("grade_type not between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTlrIsNull() {
            addCriterion("create_tlr is null");
            return (Criteria) this;
        }

        public Criteria andCreateTlrIsNotNull() {
            addCriterion("create_tlr is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTlrEqualTo(String value) {
            addCriterion("create_tlr =", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrNotEqualTo(String value) {
            addCriterion("create_tlr <>", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrGreaterThan(String value) {
            addCriterion("create_tlr >", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrGreaterThanOrEqualTo(String value) {
            addCriterion("create_tlr >=", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrLessThan(String value) {
            addCriterion("create_tlr <", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrLessThanOrEqualTo(String value) {
            addCriterion("create_tlr <=", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrLike(String value) {
            addCriterion("create_tlr like", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrNotLike(String value) {
            addCriterion("create_tlr not like", value, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrIn(List<String> values) {
            addCriterion("create_tlr in", values, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrNotIn(List<String> values) {
            addCriterion("create_tlr not in", values, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrBetween(String value1, String value2) {
            addCriterion("create_tlr between", value1, value2, "createTlr");
            return (Criteria) this;
        }

        public Criteria andCreateTlrNotBetween(String value1, String value2) {
            addCriterion("create_tlr not between", value1, value2, "createTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrIsNull() {
            addCriterion("update_tlr is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrIsNotNull() {
            addCriterion("update_tlr is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrEqualTo(String value) {
            addCriterion("update_tlr =", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrNotEqualTo(String value) {
            addCriterion("update_tlr <>", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrGreaterThan(String value) {
            addCriterion("update_tlr >", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrGreaterThanOrEqualTo(String value) {
            addCriterion("update_tlr >=", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrLessThan(String value) {
            addCriterion("update_tlr <", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrLessThanOrEqualTo(String value) {
            addCriterion("update_tlr <=", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrLike(String value) {
            addCriterion("update_tlr like", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrNotLike(String value) {
            addCriterion("update_tlr not like", value, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrIn(List<String> values) {
            addCriterion("update_tlr in", values, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrNotIn(List<String> values) {
            addCriterion("update_tlr not in", values, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrBetween(String value1, String value2) {
            addCriterion("update_tlr between", value1, value2, "updateTlr");
            return (Criteria) this;
        }

        public Criteria andUpdateTlrNotBetween(String value1, String value2) {
            addCriterion("update_tlr not between", value1, value2, "updateTlr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}