package com.agu;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by breeze on 2018/4/11.
 */
@Repository
@Mapper
public interface PaymentMapper {

    @Select("SELECT * FROM PAY ORDER BY QUOTA")
    List<Payment> getPayment();

    @Update("UPDATE PAY SET QUOTA = #{surplusQuota} WHERE NAME = #{name}")
    int update(@Param("surplusQuota") int quota, @Param("name") String name);

    @Update("UPDATE PAY SET QUOTA = #{initValue} WHERE ID = #{id}")
    int init(@Param("initValue") int initValue, @Param("id") int id);
}
