package com.bx.zuul.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicePassengerUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ServicePassengerUserInfoExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerDate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterion("registerDate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterion("registerDate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterion("registerDate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registerDate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterion("registerDate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterion("registerDate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterion("registerDate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterion("registerDate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterion("registerDate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterion("registerDate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneIsNull() {
            addCriterion("passengerPhone is null");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneIsNotNull() {
            addCriterion("passengerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneEqualTo(String value) {
            addCriterion("passengerPhone =", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneNotEqualTo(String value) {
            addCriterion("passengerPhone <>", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneGreaterThan(String value) {
            addCriterion("passengerPhone >", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("passengerPhone >=", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneLessThan(String value) {
            addCriterion("passengerPhone <", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneLessThanOrEqualTo(String value) {
            addCriterion("passengerPhone <=", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneLike(String value) {
            addCriterion("passengerPhone like", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneNotLike(String value) {
            addCriterion("passengerPhone not like", value, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneIn(List<String> values) {
            addCriterion("passengerPhone in", values, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneNotIn(List<String> values) {
            addCriterion("passengerPhone not in", values, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneBetween(String value1, String value2) {
            addCriterion("passengerPhone between", value1, value2, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengerphoneNotBetween(String value1, String value2) {
            addCriterion("passengerPhone not between", value1, value2, "passengerphone");
            return (Criteria) this;
        }

        public Criteria andPassengernameIsNull() {
            addCriterion("passengerName is null");
            return (Criteria) this;
        }

        public Criteria andPassengernameIsNotNull() {
            addCriterion("passengerName is not null");
            return (Criteria) this;
        }

        public Criteria andPassengernameEqualTo(String value) {
            addCriterion("passengerName =", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotEqualTo(String value) {
            addCriterion("passengerName <>", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameGreaterThan(String value) {
            addCriterion("passengerName >", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameGreaterThanOrEqualTo(String value) {
            addCriterion("passengerName >=", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLessThan(String value) {
            addCriterion("passengerName <", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLessThanOrEqualTo(String value) {
            addCriterion("passengerName <=", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLike(String value) {
            addCriterion("passengerName like", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotLike(String value) {
            addCriterion("passengerName not like", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameIn(List<String> values) {
            addCriterion("passengerName in", values, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotIn(List<String> values) {
            addCriterion("passengerName not in", values, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameBetween(String value1, String value2) {
            addCriterion("passengerName between", value1, value2, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotBetween(String value1, String value2) {
            addCriterion("passengerName not between", value1, value2, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengergenderIsNull() {
            addCriterion("passengerGender is null");
            return (Criteria) this;
        }

        public Criteria andPassengergenderIsNotNull() {
            addCriterion("passengerGender is not null");
            return (Criteria) this;
        }

        public Criteria andPassengergenderEqualTo(Byte value) {
            addCriterion("passengerGender =", value, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderNotEqualTo(Byte value) {
            addCriterion("passengerGender <>", value, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderGreaterThan(Byte value) {
            addCriterion("passengerGender >", value, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("passengerGender >=", value, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderLessThan(Byte value) {
            addCriterion("passengerGender <", value, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderLessThanOrEqualTo(Byte value) {
            addCriterion("passengerGender <=", value, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderIn(List<Byte> values) {
            addCriterion("passengerGender in", values, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderNotIn(List<Byte> values) {
            addCriterion("passengerGender not in", values, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderBetween(Byte value1, Byte value2) {
            addCriterion("passengerGender between", value1, value2, "passengergender");
            return (Criteria) this;
        }

        public Criteria andPassengergenderNotBetween(Byte value1, Byte value2) {
            addCriterion("passengerGender not between", value1, value2, "passengergender");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Byte value) {
            addCriterion("userState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Byte value) {
            addCriterion("userState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Byte value) {
            addCriterion("userState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("userState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Byte value) {
            addCriterion("userState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Byte value) {
            addCriterion("userState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Byte> values) {
            addCriterion("userState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Byte> values) {
            addCriterion("userState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Byte value1, Byte value2) {
            addCriterion("userState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Byte value1, Byte value2) {
            addCriterion("userState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     */
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