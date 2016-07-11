<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Marketing Tech</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="<spring:url value="/resources/css/index.css"/>" type="text/css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<style>

    body{
        background: #1F1F1F url("<spring:url value="/resources/img/pattern.png"/>") repeat top left;
        color:#fff;
        font-family: "Anderson 1938","Helvetica Neue",Helvetica,Arial,sans-serif;
    }
</style>


    <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>-->



</head>
<body>

<div class="container">
    <div class="row headerRow">
        <div class="col-lg-2">
            <img src="<spring:url value="/resources/img/rei-logo-sm-white.png"/>">
        </div>
        <div class="col-lg-10">
            <h1 class="MarketingTech">Marketing Tech</h1>
        </div>
    </div>
    <div class="row appSelectBox">

        <div class="appSubBox col-lg-6">
            <div class="apps col-lg-10 col-lg-offset-1">
                <p class="appsTitle">Apps</p>
                <div class="mtItem">
                    <!--<div style="background-image: url('<spring:url value="/resources/img/tiles.jpeg"/>');"></div>-->
                    <div>
                        <span class="glyphicon glyphicon-envelope" />
                    </div>
                    <p>VendorMail</p>
                </div>
                <div class="mtItem">
                    <div>
                        <span class="glyphicon glyphicon-th-list" />
                    </div>
                    <p>Template Builder</p>
                </div>
                <div class="mtItem">
                    <div>
                        <span class="glyphicon glyphicon-refresh" />
                    </div>
                    <p>Clones</p>
                </div>
                <div class="mtItem">
                    <div>
                        <span class="glyphicon glyphicon-blackboard" />
                    </div>
                    <p>Tech Signs & Guides</p>
                </div>
            </div>
        </div>

        <div class="appSubBox col-lg-6">
            <div class="reports col-lg-10 col-lg-offset-1">
                <p class="appsTitle">Reports</p>
                <div class="mtItem">
                    <div>
                        <span class="glyphicon glyphicon-tree-conifer" />
                    </div>
                    <p>Product Content Team</p>
                </div>
                <div class="mtItem">
                    <div>
                        <span class="glyphicon glyphicon-camera" />
                    </div>
                    <p>Studio</p>
                </div>
            </div>
        </div>

    </div>
</div>
</body>
</html>