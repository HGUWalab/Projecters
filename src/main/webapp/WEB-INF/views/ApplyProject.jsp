<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<link href="../resources/css/styles.css?ver=${1}" rel="stylesheet" />
    <link href="../resources/css/postform.css?ver=${2}" rel="stylesheet" />
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
<body>
<h1>프로젝트 신청폼(임시)</h1>
<h1>Post_id: ${post_id}</h1>
<form action="${pageContext.request.contextPath}/form/apply">
	<input id="inputPostId" value="${post_id}" type="hidden" name="post_id" required/>
 	<input id="inputContact" type="text" name="contact" required/>
	<textarea id="inputContent" name="content" required></textarea>
	<button onclick="submit()">완료</button>
</form>
</body>
</html>
