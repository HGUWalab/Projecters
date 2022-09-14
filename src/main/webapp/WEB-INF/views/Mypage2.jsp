<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="../resources/css/styles.css?ver=1005" rel="stylesheet" />
        <link href="../resources/css/mypage.css?ver=10552" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand">
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-0 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Brand-->
            <a class="navbar-brand" href="index.html"><img src="../resources/img/logo.png"></a>
            
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-light" id="sidenavAccordion">
                    <div class="d-flex sb-sidenav-menu">
                    	<div class="d-flex profile">
                    		<img src="../resources/img/profile.png"  alt="..." >
                    		<h3>김한동 학부생</h3>
                    		<h5>22000197@handong.ac.kr</h5>
                    	</div>
                        <div class="nav">
                            <a class="nav-link" href="${pageContext.request.contextPath}/mypage/mypage1">
                                내가 올린 프로젝트 
                            </a>
                            <hr>
                            <a class="nav-link" href="${pageContext.request.contextPath}/mypage/mypage2">
                                내가 신청한 프로젝트
                            </a>
                             <hr>
                            <a class="nav-link" href="${pageContext.request.contextPath}/mypage/mypage3">
                                내가 찜한 프로젝트
                            </a>
                        </div>
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mypageTabTitle mt-4">내가 신청한 프로젝트</h1>
                        <div class="row">
                            <div class="card text-black mb-4">
                                <div class="d-flex card-body">
                                    <div class="card-info">
                                        <button class="card-status">
                                            <h6 class="state-button">모집중</h6>
                                        </button>

                                    </div>
                                    <h5 class="cardTitle"> 📱 Flutter를 이용한 앱 개발 프로젝트</h5>
                                   	
                                </div>
                                <div class="d-flex centerButton">
                               	  	<button class="card-status">
                                    	<h6 class="state-button">대기</h6>
                                    </button>
                                </div>
                                <div class="card-footer d-flex  justify-content-end">
                                    
                                    <div class="applicant small text-black">👋 현재 신청자  <strong> 18명</strong></div>
                                    <div class="card-action">
                                        <button class="cardButton">
                                            취소
                                        </button>
                                        <button class="cardButton">
                                            삭제
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2022</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
      
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="../../js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="../../js/datatables-simple-demo.js"></script>
    </body>
</html>