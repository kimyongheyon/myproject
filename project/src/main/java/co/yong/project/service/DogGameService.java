package co.yong.project.service;

import java.util.List;

public interface DogGameService {

	List<DogKindVO> dkindSelectList();

	List<DogSabiltyVO> dSabiltySelectList();

	List<DogShopVO> dShopSelectList();
	
	List<User_infoVO> userSelectList();

	DogKindVO dKindSelect(DogKindVO vo);

	DogSabiltyVO dSabiltySelect(DogSabiltyVO vo);
	
	DogShopVO dshopSelect(DogShopVO vo);
	
	User_infoVO userSelect(User_infoVO vo);
	

	int dogsabiltyInsert(DogSabiltyVO vo);
	
	int dogshopInsert(DogShopVO vo);
	
	int userInsert(User_infoVO vo);
	
	
	int dogsabiltyUpdate(DogSabiltyVO vo);
	
	int dogshopUpdate(DogShopVO vo);
	
	int userUpdate(User_infoVO vo);
	
	
	int dogsabiltyDelete(DogSabiltyVO vo);
	
	int dogshopDelete(DogShopVO vo);

}
