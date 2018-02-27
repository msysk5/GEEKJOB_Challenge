<%-- 
    Document   : data2-2
    Created on : 2018/02/23, 11:32:53
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String type = request.getParameter("type");
if(Integer.parseInt(type)==1){
	out.println("雑貨");
}else if(Integer.parseInt(type)==2){
	out.println("生鮮食品");
}else {
        out.println("その他");
}
        
String count = request.getParameter("price");
out.println(request.getParameter("price"));

String point = request.getParameter("point");

if(Integer.parseInt(point) < 3000){
	out.println(Integer.parseInt(point) * 0);
}else if(Integer.parseInt(point) >= 5000){
	out.println(Integer.parseInt(point) * 0.05);
}else{
        out.println(Integer.parseInt(point) * 0.04);
}
%>