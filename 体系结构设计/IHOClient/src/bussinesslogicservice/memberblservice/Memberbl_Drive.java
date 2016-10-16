package bussinesslogicservice.memberblservice;

import java.util.ArrayList;

import vo.MemberVO;

public class Memberbl_Drive {
	public void drive(MemberLogicService memberLogicService){
		MemberVO vo1=new MemberVO("1234567890", "腾讯企业",2);
		MemberVO vo2=new MemberVO("1234567891", "1997.01.01",1);
		try{
			memberLogicService.businessRegister(vo1);
			memberLogicService.originalRegister(vo2);
			memberLogicService.get("1234567890", vo1);
			memberLogicService.levelLook("1234567891", vo2);
			ArrayList<Integer> levelList = new ArrayList<>();
			levelList.add(20);
			levelList.add(1);
			memberLogicService.levelUpdate(levelList, 20);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
