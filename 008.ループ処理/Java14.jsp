<%-- 
    Document   : Java14
    Created on : 2018/02/06, 15:45:06
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.text.*" %>
<%
    int i = 1000;
    while(i > 100){
        out.println(i);
        i = i / 2;
    }
%>