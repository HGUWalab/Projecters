<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TEAMPLEIN</title>
    <link href="../resources/css/styles.css?ver=1" rel="stylesheet" />
    <link href="../resources/css/project.css?ver=1" rel="stylesheet" />
</head>

<body id="page-top">
<!-- Navigation-->
    <nav class="sb-topnav navbar navbar-expand justify-content-between">
        <!-- Navbar Brand-->
        <a class="navbar-brand" onclick="location.href='${pageContext.request.contextPath}/main/mainpage'"><img src="../resources/img/logo.png"></a>
        <a class="nav-link" href="mypage1.html">
            <h3>Mypage</h3>
        </a>
    </nav>
   
    <img class="thumb" src="../resources/img/thumb.jpg">
    <div class="container">
        <div class="applycount text-center align-content-center">
            <h6 class="b1"><text-green>👋 5</text-green>명이 신청하셨습니다</h6>
          
        </div>
        <h1 class="projectTitle">김광교수님 랩실에서 함께 공프기하실 개발자를 구합니다. <br>두줄 꽉 채운 제목은 이런 모습이 되겠지요</h1>
        <h3 class="subTitle"><text-primary>Its related tags are</text-primary></h3>
        <div class="tags">
            <div class="tag"><h5>React</h5></div>
            <div class="tag"><h5>html</h5></div>
            <div class="tag"><h5>Spring Boot</h5></div>
            <div class="tag"><h5>Figma</h5></div>
            <div class="tag"><h5>Illerstrator</h5></div>
        </div>
        <h3 class="subTitle"><text-primary>What we need from you </text-primary></h3>
        <div class="description b1">안녕하세요. 김광교수님 랩실원 20학번 김하은입니다. 
            이번에 진행하는 공프기의 팀원을 구합니다. 저는 그동안 10개의 프로젝트를 Apple의 system-ui가 익숙한 나로서는 San Francisco와 Apple SD 산돌고딕 Neo가 없는 다른 환경에서 이를 대체할 수 있는 글꼴을 꾸준히 갈망해왔다. Inter는 San Francisco가 없는 다른 환경에서 대체 역할을 쏠쏠히 해오고 있다고는 하지만, 타협 없이 네오 그로테스크의 뜻을 가진 San Francisco와 달리 몇몇 소문자 글자가 휴머니스트적인 인상을 가지고 있기 때문에, 이를 다듬어 아예 완벽한 따라쟁이를 만들어버리는 것은 어떨까 싶은 것이다. 이어서 맑은 고딕과 나눔고딕을 대신해 본문용 무료 글꼴의 대명사로 쓰이고 있는 Noto Sans KR—본고딕은, 그 글자를 조형하는 여러 사람들이 공통적으로 자간을 조정하는 데 시간을 쏟고 있다는 것과, 본고딕의 한글 크기가 대부분의 한글 글꼴들과 비슷하게 다국어 타이포그래피 환경에서는 조금 크게 자리잡아 라틴 글자와 섞어쓸 때 글자 비율을 어느정도 조정해서 쓰는 점이 제품을 만드는 데 어느정도 부채가 쌓이는 상황이라 보았고, 이처럼 적합하지 않은 글꼴로부터 생기는 추가적인 소요를 줄이자는 데에서 이 프로젝트를 2020년 11월부터 천천히 다듬어왔다. 
            기본적인 글꼴 방향은 주어진 리소스가 허락하는 선에서 최대한 눈에 익숙하며, 글꼴에 구태여 손을 보지 않아도 되게끔 만들자였다. Apple의 타이포그래피 환경에 익숙해 다른 환경에서도 그러한 조형과 얼마큼 함께하길 바란다면, 또는 표준을 구성하는 데 마땅한 글꼴이 없어 어려움이 있는 상황이라면 이 글꼴이 도움이 되었으면 한다. 진행해본 경험이 있으며 어쩌고 기술스택은 html, css, javascript, flutter, 어쩌고 외에 몇개가 있습니다. 저와 함께 하시고 싶으시면 신청을 하세요. 신청하실때 학기와 깃허브 링크, 본인의 일하는 스타일을 반드시 적어주세요. 멋진 동료를 기다립니다.</div>
        </div>
        <div class="ddibCount">
            <span class="iconify" data-icon="bi:heart-fill" style="color: #c04040;"></span>
            <h4><text-red>20</text-red>명이 찜하셨습니다</h4>
        </div>
        <div class="projectButtons">
            <button class="bigButton first">
                <span class="iconify" data-icon="bi:heart" style="color: white;" data-width="18" data-height="18"></span>
                <h3>찜하기</h3>
            </button>
            <button class="bigButton">
                <h3>수정하기</h3>
            </button>
        </div>

    </body>

    <script src="https://code.iconify.design/2/2.2.1/iconify.min.js"></script>

</body>
</html>
