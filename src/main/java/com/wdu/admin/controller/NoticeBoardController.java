package com.wdu.admin.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.admin.model.NoticeBoard;
import com.wdu.admin.service.NoticeBoardService;
import com.wdu.exception.GenericException;

@RestController
@RequestMapping("/admin")
@CrossOrigin(originPatterns = "*")
public class NoticeBoardController {

	@Autowired
	NoticeBoardService noticeBoardService;

	@PostMapping("/notice-board")
	public void save(@RequestBody NoticeBoard noticeBoard) throws GenericException, ParseException {
		int rowAffected = noticeBoardService.save(noticeBoard);
		
		if (rowAffected > 0) {
			throw new GenericException("Record Inserted Successfully", HttpStatus.OK.value(), "success");
		} else {

			throw new GenericException("Error while inserting notice board records",
					HttpStatus.INTERNAL_SERVER_ERROR.value(), "error");
		}
	}

	@GetMapping("/notice-board")
	public List<NoticeBoard> getActiveNoticeBoard() throws GenericException {
		List<NoticeBoard> noticeBoardList = noticeBoardService.getActiveNoticeBoard();
		if (noticeBoardList.isEmpty()) {
			throw new GenericException("No records found", HttpStatus.NOT_FOUND.value(), "error");
		}
		return noticeBoardList;
	}
	
	
	@DeleteMapping("/notice-board/{id}")
	public void deleteNoticeBoardByID(@PathVariable("id") int id) throws GenericException {
		int rowAffected = noticeBoardService.deleteNoticeBoardByID(id)
;
		if (rowAffected > 0) {
			throw new GenericException("Record deleted successfully", HttpStatus.OK.value(), "success");
		} else {
			throw new GenericException("Error while deleting record", HttpStatus.NOT_FOUND.value(),"error");
		}
	}

}
