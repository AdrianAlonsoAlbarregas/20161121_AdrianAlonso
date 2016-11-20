<%-- 
    Document   : cabecera
    Created on : 18-nov-2016, 17:07:33
    Author     : Adrian
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<fmt:setLocale value="${sessionScope.idioma}"/>
<fmt:setBundle basename="idioma"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/CSS/estilo.css"/>
        <title>Seguro</title>
    </head>
    <body>
        <header id="cabecera">
            <h1 id="mensajeCabecera"><fmt:message key="Eslogan"/></h1>
        </header>
        <div id="texto">
