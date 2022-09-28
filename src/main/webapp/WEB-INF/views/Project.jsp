<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>팀플,in</title>
    <link href="${pageContext.request.contextPath}/resources/css/styles.css?ver=1" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/resources/css/project.css?ver=1" rel="stylesheet" />
</head>

<body id="page-top">
<!-- Navigation-->
    <nav class="sb-topnav navbar navbar-expand justify-content-between">
        <!-- Navbar Brand-->
        <a class="navbar-brand" onclick="location.href='${pageContext.request.contextPath}/main/mainpage'"><img src="${pageContext.request.contextPath}/resources/img/logo.png"></a>
        <a class="nav-link" href="${pageContext.request.contextPath}/mypage/mypage1">
            <h3>Mypage</h3>
        </a>
    </nav>
   
    <img class="thumb" src="${post.picture}">
    <div class="container">
        <div class="applycount text-center align-content-center">
            <h6 class="b1"><text-green>👋 ${post.form_count}</text-green>명이 신청하셨습니다</h6>
          
        </div>
        <h1 class="projectTitle">${post.title}</h1>
        <h3 class="subTitle"><text-primary>Its related tags are</text-primary></h3>
        <div class="tags">
			 <c:forTokens var="tag" items="${tag.tag_name}" delims=",">
				<div class="tag"><h5>${tag}</h5></div>
			</c:forTokens>
		</div>
        <h3 class="subTitle"><text-primary>What we need from you </text-primary></h3>
        <div class="description b1">${post.content}</div>
        <div class="ddibCount">
            <span class="iconify" data-icon="bi:heart-fill" style="color: #c04040;"></span>
            <h4><text-red>${post.ddib_count}</text-red>명이 찜하셨습니다</h4>
        </div>
        <div class="projectButtons">
            <button class="bigButton first">
                <span class="iconify" data-icon="bi:heart" style="color: white;" data-width="18" data-height="18"></span>
                <h3>찜하기</h3>
            </button>
            <button class="bigButton">
                <h3>신청하기</h3>
            </button>
        </div>

    </body>

    <script src="https://code.iconify.design/2/2.2.1/iconify.min.js"></script>

</body>
</html>
