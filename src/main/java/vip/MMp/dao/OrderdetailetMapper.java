package vip.MMp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.MMp.domain.Orderdetailet;
import vip.MMp.domain.OrderdetailetExample;

public interface OrderdetailetMapper {
    long countByExample(OrderdetailetExample example);

    int deleteByExample(OrderdetailetExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(Orderdetailet row);

    int insertSelective(Orderdetailet row);

    List<Orderdetailet> selectByExample(OrderdetailetExample example);

    Orderdetailet selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("row") Orderdetailet row, @Param("example") OrderdetailetExample example);

    int updateByExample(@Param("row") Orderdetailet row, @Param("example") OrderdetailetExample example);

    int updateByPrimaryKeySelective(Orderdetailet row);

    int updateByPrimaryKey(Orderdetailet row);
}