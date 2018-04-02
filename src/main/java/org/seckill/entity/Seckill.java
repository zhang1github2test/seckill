package org.seckill.entity;

import java.util.Date;

/**
 * zhshl  2018/4/2
 */
public class Seckill
{
    /**
     * 秒杀的商品id
     */
    private long seckillid;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品数量
     */
    private int number;
    /**
     * 秒杀开始时间
     */
    private Date starttime;
    /**
     * 秒杀结束时间
     */
    private Date endTime;
    /**
     * 数据创建时间
     */
    private Date createTime;

    public long getSeckillid() {
        return seckillid;
    }

    public void setSeckillid(long seckillid) {
        this.seckillid = seckillid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillid=" + seckillid +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", starttime=" + starttime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
