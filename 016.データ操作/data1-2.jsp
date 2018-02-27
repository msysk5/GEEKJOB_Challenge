<%-- 
    Document   : data1-2
    Created on : 2018/02/22, 15:22:39
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("UTF-8");

String txtName = request.getParameter("txtName");
out.println(request.getParameter("txtName"));

String rdoGender = request.getParameter("rdoGender");
if(Integer.parseInt(rdoGender)==1){
	out.println("男");
}else{
	out.println("女");
}

String txtHobby = request.getParameter("txtHobby");
out.println(request.getParameter("txtHobby"));



%>
