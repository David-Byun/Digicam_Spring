<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"/>
    <style>
        h2{
            color:red;
            background : black;
        }
    </style>
    <script>
        $(function() {
            $('h1').css('color', 'blue');
            $('h1').click(function(){
                $(this).text("Replace Text");
            })
        })
    </script>
    <title></title>
</head>
<body>
    <h1>Second Page</h1>
    <h2 id="h2">테스트입니다</h2>
</body>
</html>
