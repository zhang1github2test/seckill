package org.seckill.entity;

import java.util.Date;

/**
 * zhshl  2018/4/2
 */
public class SuccessKilled {
    /**
     * 秒杀商品的id
     */
    private long seckilled;
    /**
     * 用户手机号
     */
    private long userPhone;
    /**
     * 订单的状态
     */
    private short state;
    /**
     * 秒杀成功时间
     */
    private Date createTime;

    private Seckill seckill;
    public long getSeckilled() {
        return seckilled;
    }

    public void setSeckilled(long seckilled) {
        this.seckilled = seckilled;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckilled=" + seckilled +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
