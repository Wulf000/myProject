package cn.beyond.beyond.entity.ul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UlSourceDataHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UlSourceDataHistoryExample() {
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

        public Criteria andGradeModelIsNull() {
            addCriterion("grade_model is null");
            return (Criteria) this;
        }

        public Criteria andGradeModelIsNotNull() {
            addCriterion("grade_model is not null");
            return (Criteria) this;
        }

        public Criteria andGradeModelEqualTo(String value) {
            addCriterion("grade_model =", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelNotEqualTo(String value) {
            addCriterion("grade_model <>", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelGreaterThan(String value) {
            addCriterion("grade_model >", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelGreaterThanOrEqualTo(String value) {
            addCriterion("grade_model >=", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelLessThan(String value) {
            addCriterion("grade_model <", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelLessThanOrEqualTo(String value) {
            addCriterion("grade_model <=", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelLike(String value) {
            addCriterion("grade_model like", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelNotLike(String value) {
            addCriterion("grade_model not like", value, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelIn(List<String> values) {
            addCriterion("grade_model in", values, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelNotIn(List<String> values) {
            addCriterion("grade_model not in", values, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelBetween(String value1, String value2) {
            addCriterion("grade_model between", value1, value2, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andGradeModelNotBetween(String value1, String value2) {
            addCriterion("grade_model not between", value1, value2, "gradeModel");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeIsNull() {
            addCriterion("before_loan_grade is null");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeIsNotNull() {
            addCriterion("before_loan_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeEqualTo(Float value) {
            addCriterion("before_loan_grade =", value, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeNotEqualTo(Float value) {
            addCriterion("before_loan_grade <>", value, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeGreaterThan(Float value) {
            addCriterion("before_loan_grade >", value, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("before_loan_grade >=", value, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeLessThan(Float value) {
            addCriterion("before_loan_grade <", value, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeLessThanOrEqualTo(Float value) {
            addCriterion("before_loan_grade <=", value, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeIn(List<Float> values) {
            addCriterion("before_loan_grade in", values, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeNotIn(List<Float> values) {
            addCriterion("before_loan_grade not in", values, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeBetween(Float value1, Float value2) {
            addCriterion("before_loan_grade between", value1, value2, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andBeforeLoanGradeNotBetween(Float value1, Float value2) {
            addCriterion("before_loan_grade not between", value1, value2, "beforeLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeIsNull() {
            addCriterion("under_loan_grade is null");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeIsNotNull() {
            addCriterion("under_loan_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeEqualTo(Float value) {
            addCriterion("under_loan_grade =", value, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeNotEqualTo(Float value) {
            addCriterion("under_loan_grade <>", value, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeGreaterThan(Float value) {
            addCriterion("under_loan_grade >", value, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("under_loan_grade >=", value, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeLessThan(Float value) {
            addCriterion("under_loan_grade <", value, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeLessThanOrEqualTo(Float value) {
            addCriterion("under_loan_grade <=", value, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeIn(List<Float> values) {
            addCriterion("under_loan_grade in", values, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeNotIn(List<Float> values) {
            addCriterion("under_loan_grade not in", values, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeBetween(Float value1, Float value2) {
            addCriterion("under_loan_grade between", value1, value2, "underLoanGrade");
            return (Criteria) this;
        }

        public Criteria andUnderLoanGradeNotBetween(Float value1, Float value2) {
            addCriterion("under_loan_grade not between", value1, value2, "underLoanGrade");
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