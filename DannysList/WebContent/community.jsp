<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="wtf.dannyslist.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p id="demo" style="text-align: center">Feel like you need to rant?? This is the place //TODO it.<p>
<%
	ArrayList<CommentBean> commentBeanArrayList = new ArrayList<CommentBean>();
	CommentDAO.getAllComments(commentBeanArrayList);
	for(CommentBean commentBean: commentBeanArrayList){
		out.println("UserName: "+commentBean.getUsernameString() +"<br>"
				+"Said: "+commentBean.getCommentString()+"<br> <hr></hr>");
	}
%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"s></script>
<script src="res/loader.jsp"></script>
<script>
function myFunction() {
	document.getElementById("demo").innerHTML = "New text!! ";
	//document.getElementById("boss").innerHTML = "I guess you are a boss";
	//document.body.style.backgroundImage="url('img_tree.png')";
    document.body.style.backgroundImage = "url('//fbcdn-sphotos-c-a.akamaihd.net/hphotos-ak-xpa1/v/t1.0-9/13252_10152380142371957_7357100697285782264_n.jpg?oh=7d8ee6a5015af2dc2703ff2034974837&oe=54D8955F&__gda__=1424574306_1353a2ef34b87c9342b84c482a0c1a24')";
	document.body.style.backgroundPosition="bottem left";
	document.body.style.backgroundRepeat="no-repeat";

	//http://fakeplus.com/pictures/jpg/-han-solo_20120522052247.jpg
}
</script>
</body>

  <form class="navbar-form navbar-right" role="search" action="Community">
      <input style="width:445px" text" class="form-control" value="Write some Chars!!" name="comment" id="search">
      <input style="width:445px" text" class="form-control" value="Username... could be anything you want" name="username" id="search">
      <button type="submit" class="btn btn-primary">Submit</button>
      </form>

 
</form>
</html>