<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 17/10/2018
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>

    <link rel="stylesheet" href="../../resources/css/style.css">
    <script>
        function Validate() {


            var first = document.getElementById("1");
            var second = document.getElementById("2");
            if (first.value !== "" && second.value !== "") {
                if (first.value !== second.value) {
                    document.getElementById("submit").disabled = true;
                    alert("Пароли не совпадают");
                    setTimeout(document.getElementById("submit").disabled = false, 3000);
                }
                else {
                    document.getElementById("submit").disabled = false;
                }
            }

        }

    </script>
</head>
<body class="bodyWithBg">
<div class="signUpContainer">
    <svg style="width:100px;height:100px" viewBox="0 0 24 24">
        <path fill="#62c0d4" d="M12,3C13.74,3 15.36,3.5 16.74,4.35C17.38,3.53 18.38,3 19.5,3A3.5,3.5 0 0,1 23,6.5C23,8 22.05,9.28 20.72,9.78C20.9,10.5 21,11.23 21,12A9,9 0 0,1 12,21A9,9 0 0,1 3,12C3,11.23 3.1,10.5 3.28,9.78C1.95,9.28 1,8 1,6.5A3.5,3.5 0 0,1 4.5,3C5.62,3 6.62,3.53 7.26,4.35C8.64,3.5 10.26,3 12,3M12,5A7,7 0 0,0 5,12A7,7 0 0,0 12,19A7,7 0 0,0 19,12A7,7 0 0,0 12,5M16.19,10.3C16.55,11.63 16.08,12.91 15.15,13.16C14.21,13.42 13.17,12.54 12.81,11.2C12.45,9.87 12.92,8.59 13.85,8.34C14.79,8.09 15.83,8.96 16.19,10.3M7.81,10.3C8.17,8.96 9.21,8.09 10.15,8.34C11.08,8.59 11.55,9.87 11.19,11.2C10.83,12.54 9.79,13.42 8.85,13.16C7.92,12.91 7.45,11.63 7.81,10.3M12,14C12.6,14 13.13,14.19 13.5,14.5L12.5,15.5C12.5,15.92 12.84,16.25 13.25,16.25A0.75,0.75 0 0,0 14,15.5A0.5,0.5 0 0,1 14.5,15A0.5,0.5 0 0,1 15,15.5A1.75,1.75 0 0,1 13.25,17.25C12.76,17.25 12.32,17.05 12,16.72C11.68,17.05 11.24,17.25 10.75,17.25A1.75,1.75 0 0,1 9,15.5A0.5,0.5 0 0,1 9.5,15A0.5,0.5 0 0,1 10,15.5A0.75,0.75 0 0,0 10.75,16.25A0.75,0.75 0 0,0 11.5,15.5L10.5,14.5C10.87,14.19 11.4,14 12,14Z" />
    </svg>
    <div class="inputContainer" >
        <form action="login" method="post">
        <input placeholder="name">
        <input placeholder="e-mail">

        <input type="password" placeholder="password" id="1" required="required">
        <input type="password" placeholder="confirm password" id="2" required="required">
        <p class="registerAsTutor">Register ad tutor <input type="checkbox"></p>

    <div style="display: flex; justify-content: space-evenly">
        <button onclick="Validate()" id="submit" type="button">Register</button>
        <a href="login"> <button type="button" class="greenButton">Login</button></a>
    </div>

        </form>
    </div>
</div>
</body>
</html>
