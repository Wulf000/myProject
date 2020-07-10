package cn.beyond.beyond.entity.ul;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UlOperatedVoucherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UlOperatedVoucherExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andCiNoIsNull() {
            addCriterion("ci_no is null");
            return (Criteria) this;
        }

        public Criteria andCiNoIsNotNull() {
            addCriterion("ci_no is not null");
            return (Criteria) this;
        }

        public Criteria andCiNoEqualTo(String value) {
            addCriterion("ci_no =", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoNotEqualTo(String value) {
            addCriterion("ci_no <>", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoGreaterThan(String value) {
            addCriterion("ci_no >", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoGreaterThanOrEqualTo(String value) {
            addCriterion("ci_no >=", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoLessThan(String value) {
            addCriterion("ci_no <", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoLessThanOrEqualTo(String value) {
            addCriterion("ci_no <=", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoLike(String value) {
            addCriterion("ci_no like", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoNotLike(String value) {
            addCriterion("ci_no not like", value, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoIn(List<String> values) {
            addCriterion("ci_no in", values, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoNotIn(List<String> values) {
            addCriterion("ci_no not in", values, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoBetween(String value1, String value2) {
            addCriterion("ci_no between", value1, value2, "ciNo");
            return (Criteria) this;
        }

        public Criteria andCiNoNotBetween(String value1, String value2) {
            addCriterion("ci_no not between", value1, value2, "ciNo");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceIsNull() {
            addCriterion("washed_balance is null");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceIsNotNull() {
            addCriterion("washed_balance is not null");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceEqualTo(BigDecimal value) {
            addCriterion("washed_balance =", value, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceNotEqualTo(BigDecimal value) {
            addCriterion("washed_balance <>", value, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceGreaterThan(BigDecimal value) {
            addCriterion("washed_balance >", value, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("washed_balance >=", value, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceLessThan(BigDecimal value) {
            addCriterion("washed_balance <", value, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("washed_balance <=", value, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceIn(List<BigDecimal> values) {
            addCriterion("washed_balance in", values, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceNotIn(List<BigDecimal> values) {
            addCriterion("washed_balance not in", values, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("washed_balance between", value1, value2, "washedBalance");
            return (Criteria) this;
        }

        public Criteria andWashedBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("washed_balance not between", value1, value2, "washedBalance");
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