<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link href="../css/loginpage.css" rel="stylesheet">
<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id"
	content="224479674698-ri9ho0fpp1nrso3c2j5u9rqhu798jend.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div class="container d-flex align-items-center justify-content-center">
		<div
			class="rounded-3 border border-second p-2 col-xxl-3 column text-center">
			<div class="fs-3 mb-4">
				<b>Projecters</b>
			</div>
			<div class="fw-light fs-5 mt-4">간편하게 로그인하고</div>
			<div class="fw-bolder fs-5 mb-4">다양한 서비스를 이용하세요.</div>
			<div class="col">
				<button class="bg-light border-0 rounded" id="my-signin2">G</button>
			</div>
		</div>
	</div>
	<!-- 구글 로그인 부분 -->
	<script>
    function renderButton() {
        gapi.signin2.render('my-signin2', {
          'scope': 'profile email',
          'width': 240,
          'height': 50,
          'longtitle': true,
          'theme': 'dark',
          'onsuccess': onSuccess,
          'onfailure': onFailure
        });
      }
    function onSuccess(googleUser) {
    	var profile = googleUser.getBasicProfile();

        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);    
        
        $(function(){
			$.ajax({
				url:'/wabang/login/loginCheck',
				type:'post',
				data:{
					"email" : profile.getEmail(),
					"profile" : profile.getName()
				},
				success:function(data){
					alert("구글아이디로 로그인 되었습니다.");
					location.href="../main/mainpage";
				}
			});
		}) 
    }
    function onFailure(error) {
       console.log(error);
    } 
    </script>
	<script
		src="https://apis.google.com/js/platform.js?onload=renderButton" async
		defer></script>
</body>
</html>
