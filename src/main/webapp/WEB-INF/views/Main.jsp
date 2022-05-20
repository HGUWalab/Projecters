<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Projecters</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="../resources/css/main.css?ver=1" rel="stylesheet" />
        <link href="../resources/css/styles.css?ver=1" rel="stylesheet" />
</head>
     <body id="page-top">
        <!-- Navigation-->
        <nav class="sb-topnav navbar navbar-expand justify-content-between">
            <!-- Navbar Brand-->
            <a class="navbar-brand" onclick="location.href='${pageContext.request.contextPath}/main/mainpage'"><img src="../resources/img/logo.png"></a>
            <a class="nav-link" href="${pageContext.request.contextPath}/mypage/mypage1">
                <h3>Mypage</h3>
            </a>
        </nav>
     	<header class="masthead  text-black text-center">
            <div class="container d-flex align-items-center flex-column">
                <!-- Masthead Avatar Image-->
                <img class="masthead-avatar mb-5" src="../resources/img/main.png"  alt="..." />
                <!-- Masthead Heading-->
                <h1 class="t1 masthead-heading mb-0">당신에게 맞는 팀을 찾으세요</h1>
              
                <!-- Masthead Subheading-->
                <p class="b1 mb-0">기획, 디자인, 개발 어떤 경험이든 팀플in에 있습니다. </p>
                <form class="d-md-inline-block mt-5 mb-5">
                    <div class="input-group">
                        <input class="form-control" type="text" placeholder="Search for..." aria-label="ex) React, Figma ..." aria-describedby="btnNavbarSearch" />
                        <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                    </div>
                </form>

              
            </div>
            <div class="tagtitle btn-toolbar  justify-content-between">
                <h3>지금 인기있는 프로젝트 태그 TOP10 👋</h3>
                <button class="actionButton" type="button" onclick="location.href='${pageContext.request.contextPath}/post/projectform'">팀원 모집 글쓰기</button>
            </div>
            <div class="mainTags">
                <div class="tag">
                    <h5><text-primary>React<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary> Spring Boot<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary>React<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary> Spring Boot<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary>React<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary> Spring Boot<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary>React<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary> Spring Boot<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary>React<text-primary></h5>
                </div>
                <div class="tag">
                    <h5><text-primary> Spring Boot<text-primary></h5>
                </div>
            </div>
            <div class="mainContent">
                <div class="totalState">
                    <h6 class="b1">현재 <b>팀플인</b>에서 </h6>
                    <h6 class="p1">${postCount}</h6>
                    <h6 class="b1">개의 프로젝트에서 팀원을 모집중이며 </h6>
                    <h6 class="p1">${recruiting}</h6>
                    <h6 class="b1">팀이 성사되었습니다. </h6>
                </div>
                <div class="toggleButton">
                    <h4>모집중인 프로젝트만 보기</h4>
                    <input type="checkbox" id="switch" /><label for="switch">Toggle</label>
                </div>
                
                
                <div class="projectCards">
                     		<c:forEach var="pList" items="${postList}">
               			<div>${pList.tag_name}</div><br>
               			<div>${pList.picture}</div>
               			<div>${pList.title}</div><br>
               			<div>${pList.form_count}</div><br>			
               		</c:forEach>	
                </div>
            </div>
        </div>
            
        </header>
        </body>
</html>