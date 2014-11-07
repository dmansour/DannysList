$(document).ready(function(){
	$.ajax({
		url:"res/header.jsp",
	}).done(function(data){
		$("body").prepend(data);
	})
})