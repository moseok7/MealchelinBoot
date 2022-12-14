package kh.project4.mealchelin.mapper;

import kh.project4.mealchelin.member.PointDTO;
import kh.project4.mealchelin.order.CartVO;
import kh.project4.mealchelin.order.OrderCriteria;
import kh.project4.mealchelin.order.OrderCriteriaUser;
import kh.project4.mealchelin.order.OrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
	
	public void addOrder (String mId) throws Exception;
	
	public OrderVO orderDetail (int oId) throws Exception;
	
	public List<OrderVO> showOrderList (String mId) throws Exception;
	
	public int countPageOrder (OrderCriteriaUser cri) throws Exception;
	
	
	public void addCart (CartVO cart) throws Exception;
	
	public List<CartVO> showCart (String mId) throws Exception;
	
	public int checkProduct(CartVO cart);
	
	public CartVO selectOne (int ucId) throws Exception;
	
	public void update (int ucId, int cquantity) throws Exception;
	
	public void delete (int ucId) throws Exception;
	
	public void resetCart (String mId) throws Exception;
	
	
	public List<OrderVO> orderAdmin() throws Exception;
	
	public void updateAdmin (int oId,int statusCode) throws Exception;
	
	public void deleteAdmin (int oId) throws Exception;

	public OrderVO detailAdmin(int oId) throws Exception;
	
	// 검색기능
	public List<OrderVO> selectOrderList(OrderCriteria cri) throws Exception;

    public int countPage(OrderCriteria cri) throws Exception;

    PointDTO loadCurrentPoint(String mId) throws Exception;

    void usePoint(@Param("mId")String mId, @Param("usePoint")int usePoint) throws Exception;
}
