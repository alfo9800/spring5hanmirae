package org.edu.vo;

import java.util.Date;

import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 게시판에서 사용되는 데이터 입출력 클래스
 * @author 한미래
 *
 */
@SessionAttributes("session_boare_type")
public class BoardVO {
	//멤버변수 선언
	private Integer bno; //int입력값이 null일 때 에러나기 때문에, Integer로 변경
	private String board_type; //게시판 종류(게시판ID:고유값)
	private String title;
	private String content;
	private String writer;
	private Date reg_date;
	private Date update_date;
	private Integer view_count;
	private Integer reply_count;
	
	private String[] save_file_names; //(폴더에 저장되는 실제파일명)리스트형(=세로배치)첨부파일명들을 배열형(=가로배치)할 때의 변수.
	private String[] real_file_names; //(DB에 저장되는 한글파일명)을 배열형으로 변경할 때 사용한 변수.
	
	@Override
	public String toString() {
		return "디버그 BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ reg_date + ", update_date=" + update_date + ", view_count=" + view_count + ", reply_count="
				+ reply_count + "]";
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getBoard_type() {
		//this.board_type = "notice"; //session으로 저장된 값을 사용
		return board_type;
	}
	public void setBoard_type(String board_type) {
		this.board_type = board_type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date regdate) {
		this.reg_date = regdate;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public Integer getView_count() {
		return view_count;
	}
	public void setView_count(Integer view_count) {
		this.view_count = view_count;
	}
	public Integer getReply_count() {
		return reply_count;
	}
	public void setReply_count(Integer reply_count) {
		this.reply_count = reply_count;
	}
	public String[] getSave_file_names() {
		return save_file_names;
	}
	public void setSave_file_names(String[] save_file_names) {
		this.save_file_names = save_file_names;
	}
	public String[] getReal_file_names() {
		return real_file_names;
	}
	public void setReal_file_names(String[] real_file_names) {
		this.real_file_names = real_file_names;
	}
	
}
