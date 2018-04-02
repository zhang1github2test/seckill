package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * zhshl  2018/4/2
 */
public interface SuccessKillDao {
    /**
     * 插入购买明细,可过滤重复
     * @param seckillId
     * @param userPhone
     * @return  插入的行数
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);

}
