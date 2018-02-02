<%-- 
    Document   : Java5
    Created on : 2018/02/02, 14:37:16
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int num = 5;
    
if(num == 1){
    out.print("1です！");
} else if(num == 2){
    out.print("プログラミングキャンプ！");
} else {
    out.print("その他です！");
}

%>
