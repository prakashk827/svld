package com.wdu.admin.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wdu.admin.model.NoticeBoard;
import com.wdu.exception.GenericException;

@Repository
public class NoticeBoardRepositoryImpl implements NoticeBoardRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int save(NoticeBoard noticeBoard) throws GenericException {
		int rowAffected = 0;
		String sql = "INSERT INTO `notice_board`(`couponName`, `announceDate`, `announceTime`, `comment`) VALUES(?,?,?,?)";

		Object[] param = { noticeBoard.getCouponName(), noticeBoard.getAnnounceDate(), noticeBoard.getAnnounceTime(),
				noticeBoard.getComment() };
		try {
			rowAffected = jdbc.update(sql, param);
		} catch (Exception e) {
			e.printStackTrace();
			throw new GenericException("Error while inserting notice board records ",
					HttpStatus.INTERNAL_SERVER_ERROR.value(), "error");
		}
		return rowAffected;
	}

	@Override
	public List<NoticeBoard> getActiveNoticeBoard() throws GenericException {
		final String SQL = "SELECT *,DATE_FORMAT(announceDate,'%d-%m-%Y') AS announceDate,TIME_FORMAT(announceTime, \"%H-%i %p\") AS announceTime FROM notice_board WHERE display = 'show' ORDER BY id DESC";
		List<NoticeBoard> noticeBoardList = null;
		try {			
			noticeBoardList = jdbc.query(SQL, new BeanPropertyRowMapper<NoticeBoard>(NoticeBoard.class));
		} catch (Exception e) {
			throw new GenericException("Error while getting records from notice_board table",HttpStatus.INTERNAL_SERVER_ERROR.value(),"error");
		}
		return noticeBoardList;
	}
	
	@Override
	public int deleteNoticeBoardByID(int id) throws GenericException {
		int rowAffected = 0 ;
		final String SQL = "DELETE FROM notice_board WHERE id = ?";

		try {
			rowAffected = jdbc.update(SQL, id);
		} catch (Exception e) {
			throw new GenericException("Error while deleteting record", HttpStatus.INTERNAL_SERVER_ERROR.value(), "error");
		}
		
		return rowAffected;

	}
}
