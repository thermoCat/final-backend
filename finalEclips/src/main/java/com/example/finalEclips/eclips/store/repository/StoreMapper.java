package com.example.finalEclips.eclips.store.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.finalEclips.eclips.common.dto.PaginationDto;
import com.example.finalEclips.eclips.store.dto.IndustryDto;
import com.example.finalEclips.eclips.store.dto.SidoDto;
import com.example.finalEclips.eclips.store.dto.SigunguDto;
import com.example.finalEclips.eclips.store.dto.StoreDto;

@Mapper
public interface StoreMapper {
    List<StoreDto> findPaginatedStores(PaginationDto<?> paginationDto); // 페이지 쪼개기
    int findPaginatedStoresCount(PaginationDto<?> paginationDto); // 총 페이치 카운트
    List<SidoDto> findSidoName(); // 시도
    List<SigunguDto> findSigunguName(); // 시군구
    List<IndustryDto> findIndustryName(); // 업종명
}
