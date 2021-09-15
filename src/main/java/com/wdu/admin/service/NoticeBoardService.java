package com.wdu.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdu.admin.model.NoticeBoard;
import com.wdu.admin.repository.NoticeBoardRepository;
import com.wdu.exception.GenericException;

@Service
public class NoticeBoardService {
	@Autowired
	NoticeBoardRepository noticeBoardRepository;
	public int save(NoticeBoard noticeBoard) throws GenericException {
		return noticeBoardRepository.save(noticeBoard);
		
	}
	public List<NoticeBoard> getActiveNoticeBoard() throws GenericException {
		return noticeBoardRepository.getActiveNoticeBoard();
	}
	
	public int deleteNoticeBoardByID(int id) throws GenericException {
		return noticeBoardRepository.deleteNoticeBoardByID(id)
;
	}
	

}
