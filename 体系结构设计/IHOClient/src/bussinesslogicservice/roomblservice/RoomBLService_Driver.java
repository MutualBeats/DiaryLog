/**
 * @author huangxiao
 * 2016年10月15日
 */
package bussinesslogicservice.roomblservice;

import java.util.ArrayList;

import util.ResultMessage;
import util.RoomCheckRecord;
import util.RoomConditionOfDate;
import util.RoomType;
import vo.RoomVO;

public class RoomBLService_Driver {

	public void drive(RoomBLService roomBLService) {
		ResultMessage result;
		ArrayList<RoomVO> roomList = new ArrayList<RoomVO>();
		roomList.add(new RoomVO("00000001", "1234", RoomType.Single, 100, new ArrayList<RoomCheckRecord>(), new ArrayList<RoomConditionOfDate>()));
		result = roomBLService.importRoom(roomList);
		if(result == ResultMessage.Success)
			System.out.println("Success\n");
		else
			System.out.println("Failed\n");
		result = roomBLService.updateRoom(roomList);
		if(result == ResultMessage.Success)
			System.out.println("Success\n");
		else
			System.out.println("Failed\n");
		
		ArrayList<RoomVO> rooms = roomBLService.getRoomList("00000001");
		for (RoomVO roomVO : rooms)
			System.out.println(roomVO.hotelID + '\t' + roomVO.roomID + '\t' + roomVO.type + '\t' + roomVO.price + '\n');
		
		RoomVO vo = roomBLService.getRoomInfo("00000001", "1024");
		System.out.println(vo.hotelID + '\t' + vo.roomID + '\t' + vo.type + '\t'+ vo.price + '\n');
	}
}
