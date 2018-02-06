<%-- 
    Document   : Java11
    Created on : 2018/02/06, 11:19:24
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int total = 1;
    for (int i = 0; i < 20; i++){
    total *= 8;
}

out.print(total);
%>