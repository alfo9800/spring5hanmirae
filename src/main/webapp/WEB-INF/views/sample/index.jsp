<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp: JavaSeverPage 자바서버용페이지 -->
<%--자바주석 시작 
- jsp에서 자바프로그램을 사용할 때 쓰는 태그 < %~~~~~% >  
- @page:골뱅이-애노테이션,페이지-지시자. 
- language:java언어.
- 콘텐츠타입:text/html. 문자셋:유니코드(한글)
- 페이징인코딩:유니코드(한글)
자바주석 끝 --%>

<!-- Homecontroller.java에서 index.jsp로 매칭 시킨 결과가 나오는 페이지 입니다.<br>
- html에서는 /resources/sample/index.html 이렇게 접근합니다.<br>
- jsp프로그램에서는 위 html처럼 바로접근 못하고, 홈컨트롤러를 거쳐서 index.jsp를 접근하는 이유는 보안때문 입니다. (은행,관공서 등에서 사용. 스프링을 배우는 목적)<br>
- 다른 예로, PHP는 위에 있는 html처럼 파일에 바로 접근이 가능합니다. (그래서, 중소기업에서 사용)<br>
- 출발은 자바...자바에서 출발한 스프링프레임워크는 :자바에서 웹프로그램 만드는데 특화된 라이브러리(프로그램묶음)를 구조화 시켜
   개발자가 편하게 만들어 놓은 것<br>
- jsp는 지금 보이는 프로젝트는 스프링MVC프로젝트입니다.<br>
- 여기서 MVC에서 view단에 해당하는 기술 부분이 jsp입니다.<br>
- MVC = Model(데이터베이스) - View(jsp페이지) <-> Controller(컨트롤러자바클래스)<br>
- org.edu.controller 패키지명:자바클래스가 있는 폴더 경로를 말합니다.<br>
- 패키지를 사용하는 이유: 자바클래스를 기능별로 묶어 놓기 위해서 명시적으로 만든 묶음.<br>
 -->
 
<%@ include file="./include/header.jsp" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- 위 부트스트랩 코어 -->
<section>
<!-- 본문슬라이드영역 시작 -->

<!-- 이미지를 불러오는 태그 img src -->
<!-- 경로:상대(.img/...), 절대경로(/resources/sample/img/...) -->
<!-- 태그안쪽에 지정한 스타일을 인라인스타일  -->
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/resources/sample/img/tree.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/resources/sample/img/plant.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/resources/sample/img/light.jpg" class="d-block w-100" alt="...">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<!-- 분문슬라이드영역 끝 -->

</section>
<%@ include file="./include/footer.jsp" %><!-- 공통된 footer 적용 -->