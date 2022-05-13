package co.yong.project.service;

import java.util.List;

public interface DogGameService {


	List<DogSabiltyVO> dSabiltySelectList();

	List<DogShopVO> dShopSelectList();
	
	List<User_infoVO> userSelectList();
	
	List<MonsterVO> monsterList();
	
	


	DogSabiltyVO dSabiltySelect(String name);	
	
	DogShopVO dshopSelect(DogShopVO vo);
	
	User_infoVO userSelect(User_infoVO vo);
	
	DogShopVO shopabilityselect(DogShopVO vo);
	
	MonsterVO monsterselect(MonsterVO vo);
	

	
	int  userInsert(User_infoVO vo);
	
	int  dogInsert(DogSabiltyVO vo);
	
	
	
	int dogsabiltyUpdate(DogSabiltyVO vo);
	
	int dogshopUpdate(DogShopVO vo);
	
	int userUpdate(User_infoVO vo);
	

	
	

}