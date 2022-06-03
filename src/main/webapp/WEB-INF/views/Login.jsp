<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <body>
      <script src="https://accounts.google.com/gsi/client" async defer></script>
      <script src="https://apis.google.com/js/platform.js" async defer></script>
      <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
      <script>
        function handleCredentialResponse(response) {
        	const responsePayload = parseJwt(response.credential);
        	console.log("ID: " + responsePayload.sub);
            console.log('Full Name: ' + responsePayload.name);
            console.log('Given Name: ' + responsePayload.given_name);
            console.log('Family Name: ' + responsePayload.family_name);
            console.log("Image URL: " + responsePayload.picture);
            console.log("Email: " + responsePayload.email);
        	
    			$.ajax({
    				url:'/Projecters/login/loginCheck',
    				type:'post',
    				data:{
    					"email" : responsePayload.email,
    					"name" : responsePayload.name
    				},
    				success:function(data){
    					alert("구글아이디로 로그인 되었습니다.");
    					location.href="../main/mainpage";
    				}
    			});
    		
        }
        function parseJwt (token) {
            var base64Url = token.split('.')[1];
            var base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
            var jsonPayload = decodeURIComponent(atob(base64).split('').map(function(c) {
                return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
            }).join(''));

            return JSON.parse(jsonPayload);
        };
        window.onload = function () {
          google.accounts.id.initialize({
            client_id: "383720473305-69kscjtjuv8qkm4bmbbgo64efpmcrl9r.apps.googleusercontent.com",
            callback: handleCredentialResponse
          });
          google.accounts.id.renderButton(
            document.getElementById("buttonDiv"),
            { theme: "outline", size: "large" }  // customization attributes
          );
          google.accounts.id.prompt(); // also display the One Tap dialog
        }
    </script>
    <div id="buttonDiv"></div> 
  </body>
</html>