package com.example.finalEclips.eclips.store.service;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.finalEclips.eclips.common.dto.PaginationDto;
import com.example.finalEclips.eclips.store.dto.IndustryDto;
import com.example.finalEclips.eclips.store.dto.SidoDto;
import com.example.finalEclips.eclips.store.dto.SigunguDto;
import com.example.finalEclips.eclips.store.dto.StoreDto;
import com.example.finalEclips.eclips.store.dto.StoreRequestDto;
import com.example.finalEclips.eclips.store.repository.StoreMapper;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreMapper storeMapper;

    @Override
    public PageImpl<StoreDto> getStores(StoreRequestDto storeRequestDto, Pageable pageable) {
        PaginationDto<?> paginationDto = PaginationDto.builder().data(storeRequestDto).pageable(pageable).build();
        List<StoreDto> content = storeMapper.findPaginatedStores(paginationDto);
        int totalCount = storeMapper.findPaginatedStoresCount(paginationDto);
        
        return new PageImpl<>(content, pageable, totalCount);
    }

	@Override
	public List<SidoDto> getSido() {
		return storeMapper.findSidoName();
	}

	@Override
	public List<SigunguDto> getSigungu() {
		return storeMapper.findSigunguName();
	}

	@Override
	public List<IndustryDto> getIndustry() {
		return storeMapper.findIndustryName();
	}
    
}
