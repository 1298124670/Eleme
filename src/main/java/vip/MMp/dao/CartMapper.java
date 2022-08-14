package vip.MMp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.MMp.domain.Cart;
import vip.MMp.domain.CartExample;

public interface CartMapper {
    long countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart row);

    int insertSelective(Cart row);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer cartid);

    int updateByExampleSelective(@Param("row") Cart row, @Param("example") CartExample example);

    int updateByExample(@Param("row") Cart row, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart row);

    int updateByPrimaryKey(Cart row);
}