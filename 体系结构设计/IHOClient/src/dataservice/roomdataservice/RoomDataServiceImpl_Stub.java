/**
 * @author huangxiao
 * 2016年10月15日
 */
package dataservice.roomdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.RoomPO;
import util.RoomCheckRecord;
import util.RoomConditionOfDate;
import util.RoomType;

public class RoomDataServiceImpl_Stub implements RoomDataService {

	@Override
	public ArrayList<RoomPO> findAll(String HotelID) throws RemoteException {
		ArrayList<RoomPO> roomList = new ArrayList<RoomPO>();
		roomList.add(new RoomPO(HotelID, "1024", RoomType.Single, 100, new ArrayList<RoomCheckRecord>(), new ArrayList<RoomConditionOfDate>()));
		return roomList;
	}
	
	@Override
	public RoomPO find(String HotelID, String roomNumber) throws RemoteException {
		RoomPO po = new RoomPO(HotelID, roomNumber, RoomType.Single, 100, new ArrayList<RoomCheckRecord>(), new ArrayList<RoomConditionOfDate>());
		return po;
	}

	@Override
	public void insert(RoomPO po) throws RemoteException {
		System.out.println("Insert Succeed!\n");
	}

	@Override
	public void update(RoomPO po) throws RemoteException {
		System.out.println("Update Succeed!\n");
	}

}
