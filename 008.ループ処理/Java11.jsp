<%-- 
    Document   : Java11
    Created on : 2018/02/07, 11:47:10
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.text.*" %>
<%
    long total = 1;
    for (long i = 0; i < 20; i++){
    total *= 8;
}

out.print(total);
%>
