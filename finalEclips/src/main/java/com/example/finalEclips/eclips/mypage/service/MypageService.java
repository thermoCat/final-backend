package com.example.finalEclips.eclips.mypage.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.finalEclips.eclips.mypage.dto.ApplyStatusDto;
import com.example.finalEclips.eclips.mypage.dto.ApprovalListDto;
import com.example.finalEclips.eclips.mypage.dto.ReservationActivateDto;
import com.example.finalEclips.eclips.mypage.dto.ReviewDto;
import com.example.finalEclips.eclips.mypage.dto.StoreActivateDto;
import com.example.finalEclips.eclips.mypage.dto.StoreEditDto;
import com.example.finalEclips.eclips.mypage.dto.StoreInfoDto;
import com.example.finalEclips.eclips.mypage.dto.StoreRegisterDto;
import com.example.finalEclips.eclips.mypage.dto.UserActivateDto;

public interface MypageService {

    // 사용자 아이디 + 기간별로 리뷰 조회
    Page<ReviewDto> getReviewByPeriod(@Param("userId") String userId, @Param("period") String period,
            Pageable pageable);

    // 리뷰 삭제
    void deleteReview(int reviewId);

    // 사용자 아이디 예약 조회
    List<UserActivateDto> getActivateByPeriod(@Param("userId") String userId, @Param("period") String period);

    // 예약 삭제
    void deleteActivate(int activateId);

    // 사업자 : 등록 신청 결과 조회
    ApplyStatusDto getApproval(@Param("userId") String userId);

    // 사업자 : 재신청 조회
    StoreRegisterDto getStoreRegisterInfo(@Param("userId") String userId);

    // 사업자 : 업소정보 조회
    StoreEditDto getStoreInfo(@Param("userId") String userId);

    // 사업자 : 예약 활성화 업데이트
    void saveStoreInfo(ReservationActivateDto reservationActivateDto);

    // 사업자 : 예약 조회
    List<StoreActivateDto> getStoreActivateByPeriod(@Param("userId") String userId, @Param("period") String period);

    // 승인관리 리스트
    List<ApprovalListDto> getApprovalManagementList(@Param("status") String status);

    // 승인관리 상세모달
    List<StoreInfoDto> getModalStoreInfo(@Param("storeId") int storeId);

    // 승인 반려 상태값 변경
    void updateApprovalStatus(StoreInfoDto storeInfoDto);

}
