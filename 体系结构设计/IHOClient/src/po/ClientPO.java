package po;

public class ClientPO {
	/*
	 * 用户ID
	 */
	private String clientID; 
	/*
	 * 用户姓名/名称
	 */
	private String clientname;
	/*
	 * 用户联系方式
	 */
	private String tel_number;
	/*
	 * 用户信用值
	 */
	private int credit;
	/*
	 * 构造方法
	 * @param clientID
	 * @param clientname
	 * @param tel_number
	 * @param credit
	 */
	public ClientPO(String clientID, String clientname, String tel_number, int credit){
		this.clientID = clientID;
		this.clientname = clientname;
		this.tel_number = tel_number;
		this.credit = credit;
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getTel_number() {
		return tel_number;
	}
	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
}
