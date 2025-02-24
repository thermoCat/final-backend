package com.example.finalEclips.eclips.store.dto;

import lombok.Data;

@Data
public class FilterRequestDto {
	private int sidoId;
	private String sidoName;
	private String sigunguName;
	private String industryName;
	private int sigunguId;
	private int industryId;
	private int userId;
	private float averageRating;
	private int price;
	private String contact;
	private String takeout;
	private String delivery;
	private String wifi;
	private String pet;
	private String kid;
	private String parking;
	private String mainMenu;
	private String storeName;
}
