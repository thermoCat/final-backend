package com.example.finalEclips.eclips.notice.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.finalEclips.eclips.notice.dto.CreateNoticeDto;
import com.example.finalEclips.eclips.notice.dto.NoticeAttachmentDto;
import com.example.finalEclips.eclips.notice.dto.NoticeDto;
import com.example.finalEclips.eclips.notice.dto.NoticeUpdateDto;

public interface NoticeService {
	List<NoticeDto> getNotices();
	NoticeAttachmentDto getNoticeAttachment(int id);
	
	//파일 업로드
    void deleteNoticeAttachments(int noticeId);
	void createNoticeAttachments(int noticeId, List<MultipartFile> files);
	
	List<NoticeDto> getSearchNotices(String search);
	NoticeDto getNoticeById(int id);
	void updateNoticeById(int id, NoticeUpdateDto noticeUpdateDto);
	void deleteNoticeById(int id);
	void createNotice(CreateNoticeDto createNoticeDto);
}
