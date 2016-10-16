/**
 * @author huangxiao
 * 2016年10月14日
 */
package vo;

import java.util.ArrayList;

import util.RoomCheckRecord;
import util.RoomConditionOfDate;
import util.RoomType;

public class RoomVO {
	/**
	 * 所属酒店id
	 */
	public String hotelID;
	/**
	 * 房间号
	 */
	public String roomID;
	/**
	 * 房间类型
	 */
	public RoomType type;
	/**
	 * 房间价格
	 */
	public int price;
	/**
	 * 房间记录
	 */
	public ArrayList<RoomCheckRecord> checkRecordList;
	/**
	 * 房间状态
	 */
	public ArrayList<RoomConditionOfDate> conditionList;
	
	/**
	 * 构造方法
	 * @param hotelID
	 * @param roomID
	 * @param type
	 * @param price
	 * @param checkRecordList
	 * @param conditionList
	 */
	public RoomVO(String hotelID, String roomID, RoomType type, int price, ArrayList<RoomCheckRecord> checkRecordList,
			ArrayList<RoomConditionOfDate> conditionList) {
		super();
		this.hotelID = hotelID;
		this.roomID = roomID;
		this.type = type;
		this.price = price;
		this.checkRecordList = checkRecordList;
		this.conditionList = conditionList;
	}

}
