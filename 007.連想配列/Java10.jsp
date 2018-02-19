<%-- 
    Document   : Java10
    Created on : 2018/02/06, 10:40:04
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<%
    HashMap<String, String> data =
            new HashMap<String, String>();
   
    data.put("1","AAA");
    data.put("hello","world");
    data.put("soeda","33");
    data.put("20","20");
    
    out.println(data);
   
%>
