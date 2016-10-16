package vo;

public class StaffVO {
	/*
	 * 酒店工作人员ID
	 */
	public String staffID;
	/*
	 * 酒店工作人员姓名
	 */
	public String staffname;
	/*
	 * 酒店工作人员所在酒店
	 */
	public String hotelname;
	/*
	 * 构造方法
	 * @param staffID
	 * @param staffname
	 * @param hotelname
	 */
	public StaffVO(String staffID, String staffname, String hotelname){
		this.staffID = staffID;
		this.staffname = staffname;
		this.hotelname = hotelname;
	}
}
