<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>TEAMPLEIN</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />

        <!-- Core theme CSS (includes Bootstrap)-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <link href="../../resources/css/styles.css?ver=${3}" rel="stylesheet" />
        <link href="../../resources/css/postform.css?ver=${3}" rel="stylesheet" />
		<script>
	        function submit(){
	        	var title = document.getElementById("inputContact").value;
	        	var content = document.getElementById("inputContent").value;
	        	var post_id = document.getElementById("inputPostId").value;
	        	        	
	        	$.ajax({
	        		url: "../form/apply",
	        		type: 'GET',
	        		data: {
	        			"contact": title,
	        			"content": content,
	        			"post_id": post_id
	        		},success: function(data){
	      			  location.href="../main/mainpage";
	        		}
	        	})     	
	        }
	    </script>
    </head>
    <body id="page-top">
	<!-- Navigation-->
    <nav class="sb-topnav navbar navbar-expand justify-content-between">
        <!-- Navbar Brand-->
        <a class="navbar-brand" onclick="location.href='${pageContext.request.contextPath}/main/mainpage'"><img src="../../resources/img/logo.png"></a>
        <a class="nav-link" href="mypage1.html">
            <h3>Mypage</h3>
        </a>
    </nav>
        <div id="layoutAuthentication_content">
            <main>
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-7">
                            <div class="card shadow-lg border-0 rounded-lg mt-5" >
                                <div class="card-header">
                                	<h3 class="text-center font-weight-light my-3">프로젝트 신청</h3>
                                	<h6 class="text-center">본인이 신청한 이유와 포부를 구체적으로 기재하면 팀에 합류될 가능성이 높아져요 😉</h6>
                                </div>
                                <div class="card-body">
                                    <form action="${pageContext.request.contextPath}/form/apply">
                                        <div class="form-floating mb-3">
                                            <input class="form-control" id="inputContact" type="text" name="contact" required/>
                                            <label for="inputContact">이메일 혹은 전화번호 ('-'없이 입력)</label>
                                       </div>
                  
                                       <div class="form-floating mb-3">
                                            <textarea class="form-control" id="inputContent" name="content" required></textarea>
                                            <label for="inputContent">본인을 마음껏 소개하세요 😊</label>
                                        </div>
                                        <input id="inputPostId" value="${post_id}" type="hidden" name="post_id" required/>
                                       <div class="mt-4 mb-0">
                                            <div class="d-grid">
                                            	<button class="btn btn-primary btn-block" onclick="submit()">완료</button>
                                            </div>
                                     	 </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="../resources/js/scripts.js?ver=2"></script>
    </body>
</html>

