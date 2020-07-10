package cn.beyond.beyond.entity.ul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UlGradeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UlGradeHistoryExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRuleCodeIsNull() {
            addCriterion("rule_code is null");
            return (Criteria) this;
        }

        public Criteria andRuleCodeIsNotNull() {
            addCriterion("rule_code is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCodeEqualTo(String value) {
            addCriterion("rule_code =", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotEqualTo(String value) {
            addCriterion("rule_code <>", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeGreaterThan(String value) {
            addCriterion("rule_code >", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_code >=", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeLessThan(String value) {
            addCriterion("rule_code <", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeLessThanOrEqualTo(String value) {
            addCriterion("rule_code <=", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeLike(String value) {
            addCriterion("rule_code like", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotLike(String value) {
            addCriterion("rule_code not like", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeIn(List<String> values) {
            addCriterion("rule_code in", values, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotIn(List<String> values) {
            addCriterion("rule_code not in", values, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeBetween(String value1, String value2) {
            addCriterion("rule_code between", value1, value2, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotBetween(String value1, String value2) {
            addCriterion("rule_code not between", value1, value2, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andSystemGradeIsNull() {
            addCriterion("system_grade is null");
            return (Criteria) this;
        }

        public Criteria andSystemGradeIsNotNull() {
            addCriterion("system_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSystemGradeEqualTo(Float value) {
            addCriterion("system_grade =", value, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeNotEqualTo(Float value) {
            addCriterion("system_grade <>", value, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeGreaterThan(Float value) {
            addCriterion("system_grade >", value, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("system_grade >=", value, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeLessThan(Float value) {
            addCriterion("system_grade <", value, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeLessThanOrEqualTo(Float value) {
            addCriterion("system_grade <=", value, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeIn(List<Float> values) {
            addCriterion("system_grade in", values, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeNotIn(List<Float> values) {
            addCriterion("system_grade not in", values, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeBetween(Float value1, Float value2) {
            addCriterion("system_grade between", value1, value2, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andSystemGradeNotBetween(Float value1, Float value2) {
            addCriterion("system_grade not between", value1, value2, "systemGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeIsNull() {
            addCriterion("artf_fix_grade is null");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeIsNotNull() {
            addCriterion("artf_fix_grade is not null");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeEqualTo(Float value) {
            addCriterion("artf_fix_grade =", value, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeNotEqualTo(Float value) {
            addCriterion("artf_fix_grade <>", value, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeGreaterThan(Float value) {
            addCriterion("artf_fix_grade >", value, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("artf_fix_grade >=", value, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeLessThan(Float value) {
            addCriterion("artf_fix_grade <", value, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeLessThanOrEqualTo(Float value) {
            addCriterion("artf_fix_grade <=", value, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeIn(List<Float> values) {
            addCriterion("artf_fix_grade in", values, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeNotIn(List<Float> values) {
            addCriterion("artf_fix_grade not in", values, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeBetween(Float value1, Float value2) {
            addCriterion("artf_fix_grade between", value1, value2, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfFixGradeNotBetween(Float value1, Float value2) {
            addCriterion("artf_fix_grade not between", value1, value2, "artfFixGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeIsNull() {
            addCriterion("artf_grade_code is null");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeIsNotNull() {
            addCriterion("artf_grade_code is not null");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeEqualTo(String value) {
            addCriterion("artf_grade_code =", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeNotEqualTo(String value) {
            addCriterion("artf_grade_code <>", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeGreaterThan(String value) {
            addCriterion("artf_grade_code >", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("artf_grade_code >=", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeLessThan(String value) {
            addCriterion("artf_grade_code <", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeLessThanOrEqualTo(String value) {
            addCriterion("artf_grade_code <=", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeLike(String value) {
            addCriterion("artf_grade_code like", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeNotLike(String value) {
            addCriterion("artf_grade_code not like", value, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeIn(List<String> values) {
            addCriterion("artf_grade_code in", values, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeNotIn(List<String> values) {
            addCriterion("artf_grade_code not in", values, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeBetween(String value1, String value2) {
            addCriterion("artf_grade_code between", value1, value2, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeCodeNotBetween(String value1, String value2) {
            addCriterion("artf_grade_code not between", value1, value2, "artfGradeCode");
            return (Criteria) this;
        }

        public Criteria andArtfGradeIsNull() {
            addCriterion("artf_grade is null");
            return (Criteria) this;
        }

        public Criteria andArtfGradeIsNotNull() {
            addCriterion("artf_grade is not null");
            return (Criteria) this;
        }

        public Criteria andArtfGradeEqualTo(Float value) {
            addCriterion("artf_grade =", value, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeNotEqualTo(Float value) {
            addCriterion("artf_grade <>", value, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeGreaterThan(Float value) {
            addCriterion("artf_grade >", value, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("artf_grade >=", value, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeLessThan(Float value) {
            addCriterion("artf_grade <", value, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeLessThanOrEqualTo(Float value) {
            addCriterion("artf_grade <=", value, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeIn(List<Float> values) {
            addCriterion("artf_grade in", values, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeNotIn(List<Float> values) {
            addCriterion("artf_grade not in", values, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeBetween(Float value1, Float value2) {
            addCriterion("artf_grade between", value1, value2, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfGradeNotBetween(Float value1, Float value2) {
            addCriterion("artf_grade not between", value1, value2, "artfGrade");
            return (Criteria) this;
        }

        public Criteria andArtfCommentIsNull() {
            addCriterion("artf_comment is null");
            return (Criteria) this;
        }

        public Criteria andArtfCommentIsNotNull() {
            addCriterion("artf_comment is not null");
            return (Criteria) this;
        }

        public Criteria andArtfCommentEqualTo(String value) {
            addCriterion("artf_comment =", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentNotEqualTo(String value) {
            addCriterion("artf_comment <>", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentGreaterThan(String value) {
            addCriterion("artf_comment >", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentGreaterThanOrEqualTo(String value) {
            addCriterion("artf_comment >=", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentLessThan(String value) {
            addCriterion("artf_comment <", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentLessThanOrEqualTo(String value) {
            addCriterion("artf_comment <=", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentLike(String value) {
            addCriterion("artf_comment like", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentNotLike(String value) {
            addCriterion("artf_comment not like", value, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentIn(List<String> values) {
            addCriterion("artf_comment in", values, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentNotIn(List<String> values) {
            addCriterion("artf_comment not in", values, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentBetween(String value1, String value2) {
            addCriterion("artf_comment between", value1, value2, "artfComment");
            return (Criteria) this;
        }

        public Criteria andArtfCommentNotBetween(String value1, String value2) {
            addCriterion("artf_comment not between", value1, value2, "artfComment");
            return (Criteria) this;
        }

        public Criteria andGradedTimeIsNull() {
            addCriterion("graded_time is null");
            return (Criteria) this;
        }

        public Criteria andGradedTimeIsNotNull() {
            addCriterion("graded_time is not null");
            return (Criteria) this;
        }

        public Criteria andGradedTimeEqualTo(Date value) {
            addCriterion("graded_time =", value, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeNotEqualTo(Date value) {
            addCriterion("graded_time <>", value, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeGreaterThan(Date value) {
            addCriterion("graded_time >", value, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("graded_time >=", value, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeLessThan(Date value) {
            addCriterion("graded_time <", value, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeLessThanOrEqualTo(Date value) {
            addCriterion("graded_time <=", value, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeIn(List<Date> values) {
            addCriterion("graded_time in", values, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeNotIn(List<Date> values) {
            addCriterion("graded_time not in", values, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeBetween(Date value1, Date value2) {
            addCriterion("graded_time between", value1, value2, "gradedTime");
            return (Criteria) this;
        }

        public Criteria andGradedTimeNotBetween(Date value1, Date value2) {
            addCriterion("graded_time not between", value1, value2, "gradedTime");
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