package cn.beyond.beyond.entity.ul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UlOperatedTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UlOperatedTaskExample() {
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

        public Criteria andCreditNoIsNull() {
            addCriterion("credit_no is null");
            return (Criteria) this;
        }

        public Criteria andCreditNoIsNotNull() {
            addCriterion("credit_no is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNoEqualTo(String value) {
            addCriterion("credit_no =", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotEqualTo(String value) {
            addCriterion("credit_no <>", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoGreaterThan(String value) {
            addCriterion("credit_no >", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoGreaterThanOrEqualTo(String value) {
            addCriterion("credit_no >=", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoLessThan(String value) {
            addCriterion("credit_no <", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoLessThanOrEqualTo(String value) {
            addCriterion("credit_no <=", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoLike(String value) {
            addCriterion("credit_no like", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotLike(String value) {
            addCriterion("credit_no not like", value, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoIn(List<String> values) {
            addCriterion("credit_no in", values, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotIn(List<String> values) {
            addCriterion("credit_no not in", values, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoBetween(String value1, String value2) {
            addCriterion("credit_no between", value1, value2, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCreditNoNotBetween(String value1, String value2) {
            addCriterion("credit_no not between", value1, value2, "creditNo");
            return (Criteria) this;
        }

        public Criteria andCustCdIsNull() {
            addCriterion("cust_cd is null");
            return (Criteria) this;
        }

        public Criteria andCustCdIsNotNull() {
            addCriterion("cust_cd is not null");
            return (Criteria) this;
        }

        public Criteria andCustCdEqualTo(String value) {
            addCriterion("cust_cd =", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdNotEqualTo(String value) {
            addCriterion("cust_cd <>", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdGreaterThan(String value) {
            addCriterion("cust_cd >", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_cd >=", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdLessThan(String value) {
            addCriterion("cust_cd <", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdLessThanOrEqualTo(String value) {
            addCriterion("cust_cd <=", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdLike(String value) {
            addCriterion("cust_cd like", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdNotLike(String value) {
            addCriterion("cust_cd not like", value, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdIn(List<String> values) {
            addCriterion("cust_cd in", values, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdNotIn(List<String> values) {
            addCriterion("cust_cd not in", values, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdBetween(String value1, String value2) {
            addCriterion("cust_cd between", value1, value2, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustCdNotBetween(String value1, String value2) {
            addCriterion("cust_cd not between", value1, value2, "custCd");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("oper_type is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(String value) {
            addCriterion("oper_type =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(String value) {
            addCriterion("oper_type <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(String value) {
            addCriterion("oper_type >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("oper_type >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(String value) {
            addCriterion("oper_type <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(String value) {
            addCriterion("oper_type <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLike(String value) {
            addCriterion("oper_type like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotLike(String value) {
            addCriterion("oper_type not like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<String> values) {
            addCriterion("oper_type in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<String> values) {
            addCriterion("oper_type not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(String value1, String value2) {
            addCriterion("oper_type between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(String value1, String value2) {
            addCriterion("oper_type not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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