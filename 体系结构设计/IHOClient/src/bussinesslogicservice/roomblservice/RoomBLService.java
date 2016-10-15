/**
 * @author huangxiao
 * 2016年10月14日
 */
package bussinesslogicservice.roomblservice;

import java.util.ArrayList;

import util.ResultMessage;
import vo.RoomVO;

public interface RoomBLService {
	/**
	 * 录入客房
	 */
	public ResultMessage importRoom(ArrayList<RoomVO> importRoomList);
	/**
	 * 更新客房信息
	 */
	public ResultMessage updateRoom(ArrayList<RoomVO> updateRoomList);
	/**
	 * 获得某酒店的所有房间
	 */
	public ArrayList<RoomVO> getRoom(String hotelID);
}
