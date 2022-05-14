<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="94676816828-ciiggf716isr71pkqtb3p05l95vghi1l.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body>
    <div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
    <script>
      function onSignIn(googleUser) {
        // Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());

        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
      }
      function haeun(){
    	  sendData("김하은 개발자님", "chamsaeroro@handong.ac.kr");
      }
      function younghun(){
    	  sendData("김영헌 개발자님", "dudgjs4248@naver.com");
    	  
      }
      function inhyuk(){
    	  sendData("이인혁 개발자님", "Inhyuk@handong.ac.kr");
      }
      function sendData(name, email){
    	  console.log(name);
    	  $.ajax({
    		  url:'../login/loginCheck',
    		  type: 'post',
    		  data:{
    			  "email": email,
    			  "name": name
    		  },
    		  success:function(data){
    			  alert(name + "임시로그인 되었습니다.");
    			  location.href="../main/mainpage";
    		  }
    	  })
      }
    </script>
    <button onclick = younghun()>김영헌 로그인</button>
    <button onclick = haeun()>김하은 로그인</button>
    <button onclick = inhyuk()>이인혁 로그인</button>
  </body>
</html>