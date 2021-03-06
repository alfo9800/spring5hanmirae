package org.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	/**
	 * 외부(웹브라우저)에서 스래시루트 / 라는 이름으로 요청 받으면, home.jsp파일에 render(렌더링-화면출력) 됩니다.아래
	 * HomeController.java 를 저장하면,이클립스에서는 HomeController.class 실행가능한 파일을 생성
	 * 그래서,저장시 콘솔에 보시면, Reloading Context with... is completed 재실행 되었다고 나옵니다.
	 * 그래서,.java 클래스는 수정 후 약간 기다린 후 Reloading... 메세지 후 결과 확인이 가능합니다.
	 */
	@RequestMapping(value="/sample/contact",method=RequestMethod.POST)//post는 데이터를 전송하는 역할.
	public String contact_send() {
		//데이터전송 후에 다른 페이지 이동이 필요합니다. 새로고침=자동등록을 방지하기 위해서. (게시판에 계속 글이 등록되는 것을 방지하기 위함)
		return "redirect:/sample/blog";//URL경로를 사용.
	}
	@RequestMapping(value="/sample/contact",method=RequestMethod.GET)//get방식은 홈페이지를 보여주는 역할. 
	public String contact() {
		return "sample/contact";
	}
	@RequestMapping(value="/sample/blog",method=RequestMethod.GET)
	public String blog() {
		return "sample/blog";
	}
	@RequestMapping(value="/sample/work",method=RequestMethod.GET)
	public String work() {
		return "sample/work";
	}
	@RequestMapping(value="/sample/weare",method=RequestMethod.GET)
	public String weare() {
		//외부에서 /weare경로로 접근했을 때,sample/weare.jsp와 매핑시키라는 의미.
		return "sample/weare"; //리턴 반환값이 상대경로의 파일명(perfix).jsp생략
	}
	@RequestMapping(value="/sample",method=RequestMethod.GET) //여기가 절대경로.
	public String index() {
		//매서드(함수)의 구성: 리턴(반환값출력)형태지정 매서드 명(매개변수) {구현내용}=> string index(){}
		//상단 리퀘스트매핑에서 지정한 경로로 접근을 하게되면, 아래에 있는 index()메서드를 실행하라.
		//매서드명 제일 앞에 있는 public는 접근권한에 대한 키워드인데요, public(공공-다른클래스에서 접근가능), private(내부-현재 HomeController에서만 접근가능)
		//public String index() {} 매서드 기본형태
		//$(document).ready(function(){  });  j쿼리 기본형태
		//리턴반환 값으로 사용한 String 클래스는 문자열을 반환하고, 여기서는 index.jsp에 매칭되는 문자열을 반환.
		//위에 index.jsp는 상대경로가 필요합니다. 스프링 MVC 프로젝트에서 상대경로의 최상위는 views폴더 최상위 root입니다.
		//접두사(prefix), 접미사(suffix) -> index(접두사-파일명).jsp(접미사-확장자)
		return "sample/index"; //접두사만 반환값으로 넣습니다. & 여기가 상대경로.
	}
    /*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("개발자들이 변수 값 확인용으로 사용하는 것이 로그입니다. 환영합니다. 현재 여러분 컴퓨터언어는 {} 입니다.", locale);
		logger.info("환영합니다. 현재 여러분의 컴퓨터 언어는 " + locale + "입니다.");
		System.out.println("위에 locale클래스를 사용하는 이유는 다국어 지원 때문에 변수로 사용하게 됩니다.");
		System.out.println("함수-c언어나자바스크립트-와 메서드-자바,스프링에서 사용함-는 같은 대상을 가리킵니다.");
		System.out.println("함수-메서드는 함수명('매개변수-입력값'){구현내용}형식이고, 입력값->출력값 구현됩니다.");
		Date date = new Date();//Date 날짜관련 클래스형 변수 date 선언했습니다. date변수 메서드를 사용 가능하게 됨
		//date 변수는 실행가능한 변수=클래스형변수=오브젝트=인스턴스 라고 합니다.
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		//DateFormat 클래스형 변수 dateformat 이 선언되었고, 실행가능한 변수로 되었습니다.(위)
		String formattedDate = dateFormat.format(date);//변수가 실행됩니다.
		//위 변수가 실행되어서 출력된 결과값이 String클래스형 변수 formattedDate변수에 담기게 됩니다.
		model.addAttribute("TomcatserverTime", formattedDate );//serverTime 변수값으로 jsp파일로 이동.
		//위 model이라는 클래스형 변수를 이용해서, serverTime 변수값을 아래 home(생략.jsp)로 전송해 줌.
		System.out.println("현재 서버의 시간은"+ formattedDate + "입니다." );
		return "home";//결과적으로 return 출력값이 home(생략.jsp)에 연동됩니다.
		//스프링에서 뷰단으로 데이터 이동(전송)에 대해서 살펴보았습니다.
	
	}*/
}
