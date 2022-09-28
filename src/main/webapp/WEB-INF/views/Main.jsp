<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>팀플,in</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->

		<link href="${pageContext.request.contextPath}/resources/css/main.css?ver=5" rel="stylesheet" />
     	<link href="${pageContext.request.contextPath}/resources/css/styles.css?ver=1" rel="stylesheet" />
</head>
<script type="text/javascript" charset="utf-8">
	sessionStorage.setItem("contextpath", "${pageContext.request.contextPath}");
</script>
<script>
function searchPost() {
    var search = document.getElementById('searchText').value.trim();
    var contextPath = sessionStorage.getItem("contextpath");
    console.log(contextPath);
    console.log(search);
    if (search.length > 1) {
    	location.href = contextPath+"/main/mainpage/" + search;
      } else {
        alert('검색어(' + search + ')가 너무 짧습니다.');
    }
};
function goDetail(post_id){
    var contextPath = sessionStorage.getItem("contextpath");
	location.href = contextPath+"/main/project/"+post_id;
}
function Ddib(){
	alert("찜 되었습니다!");
}

</script>
     <body id="page-top">
        <!-- Navigation-->
        <nav class="sb-topnav navbar navbar-expand justify-content-between">
            <!-- Navbar Brand-->
            <a class="navbar-brand" onclick="location.href='${pageContext.request.contextPath}/main/mainpage'"><img src="${pageContext.request.contextPath}/resources/img/logo.png"></a>
            <a class="nav-link" href="${pageContext.request.contextPath}/mypage/mypage1">
                <h3>Mypage</h3>
            </a>
        </nav>
     	<header class="masthead  text-black text-center">
            <div class="container d-flex align-items-center flex-column">
                <!-- Masthead Avatar Image-->
                <img class="masthead-avatar mb-5" src="${pageContext.request.contextPath}/resources/img/main.png"  alt="..." />
                <!-- Masthead Heading-->
                <h1 class="t1 masthead-heading mb-0">당신에게 맞는 팀을 찾으세요</h1>
              
                <!-- Masthead Subheading-->
                <p class="b1 mb-0">기획, 디자인, 개발 어떤 경험이든 팀플in에 있습니다. </p>
                <form class="d-md-inline-block mt-5 mb-5">
                    <div class="input-group">
                        <input class="form-control" id="searchText" onkeyup="if(window.event.keyCode==13){searchPost()}" type="text" placeholder="Search for..." aria-label="ex) React, Figma ..." aria-describedby="btnNavbarSearch" />
                        <button class="btn btn-primary" id="btnNavbarSearch" type="button" onclick="searchPost()"><i class="fas fa-search"></i></button>
                    </div>
                </form>
            </div>
            <div class="tagtitle btn-toolbar  justify-content-between">
                <h3>지금 인기있는 프로젝트 태그 TOP10 👋</h3>
                
                <button class="actionButton" type="button" onclick="location.href='${pageContext.request.contextPath}/post/projectform'">팀원 모집 글쓰기</button>
            </div>
            <div class="mainTags">
            	<c:forTokens  var="tag" items="${top10tags}" delims=",[]">
                	<div class="tag">
                		<h5><text-primary>${tag}<text-primary></h5>
                	</div>
                </c:forTokens>
            </div>
            <div class="mainContent">
                <div class="totalState ">
                    <h6 class="b1">현재 <b>팀플인</b>에서</h6>
                    <h6 class="p1">${formCount}</h6>
                    <h6 class="b1">명이 프로젝트에 신청하였으며 </h6>
                    <h6 class="p1">${postCount}</h6>
                    <h6 class="b1">개의 프로젝트가 팀원을 모집중입니다. </h6>
                    
                </div>
                <div class="toggleButton">
                    <h4>모집중인 프로젝트만 보기</h4>
                    <input type="checkbox" id="switch" /><label for="switch">Toggle</label>
                </div>
               
                <div class="projectCards row">
	  				 <c:forEach var="pList" items="${postList}">
	  				 	<div class="projectCard col-md-4">
		  				 	<div class="topInfo">
		  				 	<!-- <img class="thumb" src="${pList.picture}"/> -->
		  				 	<img class="thumb" src="${pList.picture}"/>
		  				 		<%-- <img class="thumb" src="${tmpFilePath}/${pList.picture}"> --%> 	  				 		
		  				 		<%-- <img class="thumb" src="<%=request.getContextPath()%>/${pList.picture}">  배포 때 이거 --%>
		  				 		<div class="postTags">
			  				 		<c:forTokens var="tag" items="${pList.tag_name}" delims=",">
										<h5 class="postTag">${tag}</h5>
									</c:forTokens>
								</div>
		               			<h3 onclick="goDetail('${pList.post_id}')">${pList.title}</h3>
			               	</div>
	               			<div class="bottomInfo">
		               			<h4>👋  신청인원 ${pList.form_count}명</h4>	
		               			<div class="postButtons"> 
		               				<button onclick="Ddib()"><h5>찜하기</h5></button>
		               				<button onclick="location.href='${pageContext.request.contextPath}/form/postform/${pList.post_id}'"><h5>바로 신청하기</h5></button>
		               			</div>
	               			</div>
	               		</div>	
	           
	               	</c:forEach>					
                </div>          
			</div>
        </header>
        </body>
</html>