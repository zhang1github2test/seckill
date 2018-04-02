--使用数据库
use seckill;
-- 创建秒杀库存表
create table seckill_table(
   seckill_id  bigint  not null   auto_increment comment '商品库存id',
   name varchar(120) not null comment '商品名称',
    number int not null comment '库存数量',
    create_time TIMESTAMP  not null DEFAULT CURRENT_TIMESTAMP  comment '创建时间',
    start_time  TIMESTAMP  not null  comment '描述开启时间',
    end_time TIMESTAMP not null   comment '秒杀结束时间',
     primary key (seckill_id),
     key idx_start_time(start_time ),
     key idx_end_time(end_time),
     key idx_create_time(create_time)

    )engine=InnoDB auto_increment=1000 DEFAULT charset = utf8 comment = '秒杀库存';

    --初始化数据
    insert into
        seckill_table (name,number,start_time,end_time)
    VALUES
        ('1000元秒杀iphone7',100,'2018-4-2 00:00:00','2018-4-3 00:00:0'),
        ('500元秒杀ipad2',200,'2018-4-2 00:00:00','2018-4-3 00:00:0'),
        ('300元秒杀小米4',300,'2018-4-2 00:00:00','2018-4-3 00:00:0'),
        ('200元秒杀红米note',400,'2018-4-2 00:00:00','2018-4-3 00:00:0')

    --秒杀成功明细表
    -- 用户登录认证相关的信息
    create table success_killed(
        seckill_id bigint not null comment '秒杀商品Id',
        user_phone bigint not null comment '用户手机号',
        state tinyint not null DEFAULT -1 comment '状态标识：-1：无效  0：成功 1：已发货',
        crate_time  TIMESTAMP not null comment '创建时间',
        primary key (seckill_id,user_phone)/*联合主键*/
    )engine=InnoDB  DEFAULT charset = utf8 comment = '秒杀成功明细表';



