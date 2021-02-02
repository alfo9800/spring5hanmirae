package org.edu.dao;

import java.util.HashMap;
import java.util.List;

import org.edu.vo.AttachVO;
import org.edu.vo.BoardVO;
import org.edu.vo.PageVO;

public interface IF_BoardDAO {
	public List<BoardVO> selectBoard(PageVO pageVO) throws Exception; //(List형) BoardVO를 가져다가 쓴다는 의미 //select(매개변수 PageVO형 pageVO를 쓰겠다는 의미
	public int countBoard(PageVO pageVO) throws Exception;
	
	//게시물 상세조회 시작
	public BoardVO readBoard(Integer bno) throws Exception;
	//public List<HashMap<String,Object>> readAttach(Integer bno) throws Exception;
	public List<AttachVO> readAttach(Integer bno) throws Exception;
	public void updateViewCount(Integer bno) throws Exception;
	//게시물 상세조회 끝
	
	public void insertBoard(BoardVO boardVO) throws Exception;
	public void deleteBoard(Integer bno) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
	
	//---첨부파일 관련---
	//저장
	public void insertAttach(String save_file_name, String real_file_name) throws Exception;
	//삭제
	public void deleteAttach(String save_file_name) throws Exception;
	public void deleteAttachAll(Integer bno) throws Exception;
	//수정
	public void updateAttach(String save_file_name, String real_file_name, Integer bno) throws Exception;
	
}

