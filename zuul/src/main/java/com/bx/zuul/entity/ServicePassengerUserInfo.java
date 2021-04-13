package com.bx.zuul.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * service_passenger_user_info
 * @author 
 */
public class ServicePassengerUserInfo implements Serializable {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 注册日期
     */
    private Date registerdate;

    /**
     * 乘客手机号
     */
    private String passengerphone;

    /**
     * 乘客姓名
     */
    private String passengername;

    /**
     * 性别。1：男，0：女
     */
    private Byte passengergender;

    /**
     * 用户状态：1：有效，0：失效
     */
    private Byte userstate;

    /**
     * 注册时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getPassengerphone() {
        return passengerphone;
    }

    public void setPassengerphone(String passengerphone) {
        this.passengerphone = passengerphone;
    }

    public String getPassengername() {
        return passengername;
    }

    public void setPassengername(String passengername) {
        this.passengername = passengername;
    }

    public Byte getPassengergender() {
        return passengergender;
    }

    public void setPassengergender(Byte passengergender) {
        this.passengergender = passengergender;
    }

    public Byte getUserstate() {
        return userstate;
    }

    public void setUserstate(Byte userstate) {
        this.userstate = userstate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ServicePassengerUserInfo other = (ServicePassengerUserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegisterdate() == null ? other.getRegisterdate() == null : this.getRegisterdate().equals(other.getRegisterdate()))
            && (this.getPassengerphone() == null ? other.getPassengerphone() == null : this.getPassengerphone().equals(other.getPassengerphone()))
            && (this.getPassengername() == null ? other.getPassengername() == null : this.getPassengername().equals(other.getPassengername()))
            && (this.getPassengergender() == null ? other.getPassengergender() == null : this.getPassengergender().equals(other.getPassengergender()))
            && (this.getUserstate() == null ? other.getUserstate() == null : this.getUserstate().equals(other.getUserstate()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisterdate() == null) ? 0 : getRegisterdate().hashCode());
        result = prime * result + ((getPassengerphone() == null) ? 0 : getPassengerphone().hashCode());
        result = prime * result + ((getPassengername() == null) ? 0 : getPassengername().hashCode());
        result = prime * result + ((getPassengergender() == null) ? 0 : getPassengergender().hashCode());
        result = prime * result + ((getUserstate() == null) ? 0 : getUserstate().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", registerdate=").append(registerdate);
        sb.append(", passengerphone=").append(passengerphone);
        sb.append(", passengername=").append(passengername);
        sb.append(", passengergender=").append(passengergender);
        sb.append(", userstate=").append(userstate);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}