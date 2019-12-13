<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../resources/home/js/jquery.js" ></script>
</head>
<body>
<Script>
	$(document).ready(function(){
		$.ajax({
			url:'show',
			type:'POST',
			dataType:'json',
			success:function(data){
				var post='';
				for (var x in data) {
					 post+='<div>';
			            post+=data[x].content+'</div>'+'</br>'+'<center>';
			            post+='Write by :'+data[x].accountName+', Time: '+data[x].writeTime+'</center>';
			            $("#ta").html(post);
			    }			
			}
		});
	});
	</Script>
	<div rows="10" cols="10" id="ta"></div>
</body>
</html>