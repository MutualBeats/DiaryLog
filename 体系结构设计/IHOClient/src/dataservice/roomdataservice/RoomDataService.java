/**
 * @author huangxiao
 * 2016年10月15日
 */
package dataservice.roomdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.RoomPO;

public interface RoomDataService {
	public ArrayList<RoomPO> findAll(String HotelID) throws RemoteException;
	
	public RoomPO find(String HotelID, String roomID) throws RemoteException;
	
	public void insert(RoomPO po) throws RemoteException;
	
	public void update(RoomPO po) throws RemoteException;
}
