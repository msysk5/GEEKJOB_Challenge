<%-- 
    Document   : Java7
    Created on : 2018/02/02, 15:27:29
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<% 
   char c = 'A'; 
   switch(c){
        case 'A':
            out.print("英語");
            break;
        case 'あ':
            out.print("日本語");
            break;
        default:
            out.print("");
 }
%>   
