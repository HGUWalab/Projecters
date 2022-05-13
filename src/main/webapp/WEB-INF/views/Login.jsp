<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- 	content에 자신의 OAuth2.0 클라이언트ID를 넣습니다. -->
<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id"
	content="383720473305-69kscjtjuv8qkm4bmbbgo64efpmcrl9r.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
	
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
	<button onclick="onSignIn()">hello</button>
	<button onclick="myFunction()">dsadsa</button>
	<script>
    function onSignIn(){
    	console.log("working");
		var auth2 = gapi.auth2.getAuthInstance();
		if(auth2.isSignedIn.get()){
			//Useful data for your client scripts:
			var profile = auth2.currentUser.get().getBasicProfile();
			//console.log("ID: " + profile.getID()); // Don't send this directly to your server!
			console.log("Full Name: " + profile.getName());
			console.log("Given Name: " + profile.getGivenName());
			console.log("Family Name: " + profile.getFamilyName());
			console.log("Image URL: " + profile.getImageUrl());
			console.log("Email: " + profile.getEmail());
			
			// The ID token you need to pass to your backend:
			var id_token = auth2.currentUser.get().getAuthResponse().id_token;
			console.log("ID Token: " + id_token);
			
			$(function(){
				$.ajax({
					url:'/login/loginpage',
					type:'post',
					data:{
						token : id_token,
						email : profile.getEmail(),
						name : profile.getName()
					},
					success:function(data){
						alert("구글아이디로 로그인 되었습니다.");
						location.href="../main/mainpage";
					}
				});
			}) 
		}
	}
    </script>
</body>
</html>