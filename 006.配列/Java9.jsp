<%-- 
    Document   : Java9
    Created on : 2018/02/06, 10:31:55
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
    String[] data = {"10","100","soeda","hayashi","-20","118","END"};
    data[2] = "33";
    out.println(data[0]);
    out.println(data[1]);
    out.println(data[2]);
    out.println(data[3]);
    out.println(data[4]);
    out.println(data[5]);
    out.println(data[6]);
    
    
%>