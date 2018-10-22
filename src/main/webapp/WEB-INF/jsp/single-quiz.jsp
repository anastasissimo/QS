<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tutor</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <script>

    </script>
</head>
<body>
<div class="topMenu">
    <div class="topMenuSvg">
        <svg style="width:50px;height:50px" viewBox="0 0 24 24">
            <path fill="#fff" d="M12,3C13.74,3 15.36,3.5 16.74,4.35C17.38,3.53 18.38,3 19.5,3A3.5,3.5 0 0,1 23,6.5C23,8 22.05,9.28 20.72,9.78C20.9,10.5 21,11.23 21,12A9,9 0 0,1 12,21A9,9 0 0,1 3,12C3,11.23 3.1,10.5 3.28,9.78C1.95,9.28 1,8 1,6.5A3.5,3.5 0 0,1 4.5,3C5.62,3 6.62,3.53 7.26,4.35C8.64,3.5 10.26,3 12,3M12,5A7,7 0 0,0 5,12A7,7 0 0,0 12,19A7,7 0 0,0 19,12A7,7 0 0,0 12,5M16.19,10.3C16.55,11.63 16.08,12.91 15.15,13.16C14.21,13.42 13.17,12.54 12.81,11.2C12.45,9.87 12.92,8.59 13.85,8.34C14.79,8.09 15.83,8.96 16.19,10.3M7.81,10.3C8.17,8.96 9.21,8.09 10.15,8.34C11.08,8.59 11.55,9.87 11.19,11.2C10.83,12.54 9.79,13.42 8.85,13.16C7.92,12.91 7.45,11.63 7.81,10.3M12,14C12.6,14 13.13,14.19 13.5,14.5L12.5,15.5C12.5,15.92 12.84,16.25 13.25,16.25A0.75,0.75 0 0,0 14,15.5A0.5,0.5 0 0,1 14.5,15A0.5,0.5 0 0,1 15,15.5A1.75,1.75 0 0,1 13.25,17.25C12.76,17.25 12.32,17.05 12,16.72C11.68,17.05 11.24,17.25 10.75,17.25A1.75,1.75 0 0,1 9,15.5A0.5,0.5 0 0,1 9.5,15A0.5,0.5 0 0,1 10,15.5A0.75,0.75 0 0,0 10.75,16.25A0.75,0.75 0 0,0 11.5,15.5L10.5,14.5C10.87,14.19 11.4,14 12,14Z" />
        </svg>
    </div>
    <div class="menuHeader">
        Tutor
    </div>
</div>
    <p class="containerHeader">Редактрирование теста ${quizName}</p>

    <c:forEach items="${questionList}" var="question">
        <div class="mainContainer">

<input value="<c:out value="${question.questionText}" />">
        <c:forEach items="${question.answers}" var="answer">
            <div class="singleTestContainer" style="background-color: #EDEDED" id="${question.id}">
                <div class="checkboxWrapPadd">
                    <input type="checkbox"   <c:if test="${answer.getCorrect()}">checked</c:if>     />
                </div>
                <div class="inputWrap">
                    <input value="<c:out value="${answer.variant}" />">
                </div>
                <div onclick="document.getElementById(${question.id}).remove()" class="deleteIconContainer">
                    <svg style="width:24px;height:24px" viewBox="0 0 24 24">
                        <path fill="#000000" class="deleteIcon" d="M19,4H15.5L14.5,3H9.5L8.5,4H5V6H19M6,19A2,2 0 0,0 8,21H16A2,2 0 0,0 18,19V7H6V19Z" />
                    </svg>
                </div>
            </div>
        </c:forEach>
        <button class="greenButton">save question</button>
        </div>

    </c:forEach>

</body>
</html>