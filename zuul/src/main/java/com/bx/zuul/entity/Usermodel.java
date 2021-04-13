package com.bx.zuul.entity;

import java.io.Serializable;

/**
 * usermodel
 * @author 
 */
public class Usermodel implements Serializable {
    private Integer id;

    private String serviceUrl;

    private String serviceModel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceModel() {
        return serviceModel;
    }

    public void setServiceModel(String serviceModel) {
        this.serviceModel = serviceModel;
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
        Usermodel other = (Usermodel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServiceUrl() == null ? other.getServiceUrl() == null : this.getServiceUrl().equals(other.getServiceUrl()))
            && (this.getServiceModel() == null ? other.getServiceModel() == null : this.getServiceModel().equals(other.getServiceModel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServiceUrl() == null) ? 0 : getServiceUrl().hashCode());
        result = prime * result + ((getServiceModel() == null) ? 0 : getServiceModel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceUrl=").append(serviceUrl);
        sb.append(", serviceModel=").append(serviceModel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}