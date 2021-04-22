package com.bx.servicecorder.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * order_event
 * @author 
 */
@Data
public class OrderEvent implements Serializable {
    private Integer id;

    private Integer eventid;

    private Byte ordertype;

    private String context;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;
}