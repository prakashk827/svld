package com.wdu.admin.repository;

import java.util.List;

import com.wdu.admin.model.NoticeBoard;
import com.wdu.exception.GenericException;

public interface NoticeBoardRepository {

	int save(NoticeBoard noticeBoard) throws GenericException;

	List<NoticeBoard> getActiveNoticeBoard() throws GenericException;
	
	int deleteNoticeBoardByID(int id) throws GenericException;



}
