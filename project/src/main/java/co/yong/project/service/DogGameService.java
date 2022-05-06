package co.yong.project.service;

import java.util.List;

public interface DogGameService {

	List<DogKindVO> dkindSelectList();

	List<DogSabiltyVO> dSabiltySelectList();

	List<DogShopVO> dShopSelectList();

	DogKindVO dKindSelect(DogKindVO vo);

	DogSabiltyVO dSabiltySelect(DogSabiltyVO vo);

	int dogsabiltyInsert(DogSabiltyVO vo);
	
	int dogshopInsert(DogShopVO vo);
	
	int dogsabiltyUpdate(DogSabiltyVO vo);
	
	int dogshopUpdate(DogShopVO vo);
	
	int dogsabiltyDelete(DogSabiltyVO vo);
	
	int dogshopDelete(DogShopVO vo);

}
