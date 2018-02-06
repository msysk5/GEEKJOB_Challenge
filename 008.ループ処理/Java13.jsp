<%-- 
    Document   : Java13
    Created on : 2018/02/06, 14:42:15
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.text.*" %>
<%
    int sum = 0;
    for (int i = 1 ; i <= 100 ; i++) {
        sum += i;
    }
    out.print(sum);
    
%>
