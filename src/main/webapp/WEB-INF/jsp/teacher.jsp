<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tutor</title>

    <link rel="stylesheet" href="../../resources/css/tabs.css">
    <link rel="stylesheet" href="../../resources/css/style.css">
    <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">

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

    <div class="tab-set">

        <input id="tab-1" name="tab-group" class="tab" type="radio" checked>
        <label for="tab-1">                Test List
        </label>

        <input id="tab-2" name="tab-group" class="tab" type="radio">
        <label for="tab-2">Tests passed by students</label>


        <div class="tab__content">
            <p class="containerHeader">
                Test List
            <form method="post" action="/add-test">
                <button type="submit" >
                    <span style="font-weight: 900;margin: 0">+</span>
                </button>
            </form>
            </p>

            <c:forEach items="${quizList}" var="quiz">
            <div class="singleTestContainer" id="${quiz.id}">
                <span style="margin-top: 5px"><c:out value="${quiz.title}" /></span>
                <a href="single-quiz?id=${quiz.id}">
                    <div>
                        <button class="smallButton">
                            <svg style="width:20px;height:20px" viewBox="0 0 24 24">
                                <path fill="#fff" d="M5,3C3.89,3 3,3.89 3,5V19A2,2 0 0,0 5,21H19A2,2 0 0,0 21,19V12H19V19H5V5H12V3H5M17.78,4C17.61,4 17.43,4.07 17.3,4.2L16.08,5.41L18.58,7.91L19.8,6.7C20.06,6.44 20.06,6 19.8,5.75L18.25,4.2C18.12,4.07 17.95,4 17.78,4M15.37,6.12L8,13.5V16H10.5L17.87,8.62L15.37,6.12Z" />
                            </svg>
                        </button>
                    </div>
                </a>
                    <div>
                        <button class="smallErrorButton" onclick="
                                document.getElementById(${quiz.id}).remove()
                                ">
                            <svg style="width:20px;height:20px" viewBox="0 0 24 24">
                                <path fill="#fff" d="M19,4H15.5L14.5,3H9.5L8.5,4H5V6H19M6,19A2,2 0 0,0 8,21H16A2,2 0 0,0 18,19V7H6V19Z" />
                            </svg>
                        </button>
                    </div>
            </div>
            </c:forEach>
        </div>

        <div class="tab__content">
            <p class="containerHeader">Test passed by students </p>
            <div class="singleTestContainer"><span style="margin-top: 5px">User Name + Test Name + Score + Test Date</span> <button class="smallButton">View Answers</button> <button class="smallGreenButton">Retake</button></div>
            <div class="singleTestContainer"><span style="margin-top: 5px">User Name + Test Name + Score + Test Date</span> <button class="smallButton">View Answers</button> <button class="smallGreenButton">Retake</button></div>
            <div class="singleTestContainer"><span style="margin-top: 5px">User Name + Test Name + Score + Test Date</span> <button class="smallButton">View Answers</button> <button class="smallGreenButton">Retake</button></div>
            <div class="singleTestContainer"><span style="margin-top: 5px">User Name + Test Name + Score + Test Date</span> <button class="smallButton">View Answers</button> <button class="smallGreenButton">Retake</button></div>
            <div class="singleTestContainer"><span style="margin-top: 5px">User Name + Test Name + Score + Test Date</span> <button class="smallButton">View Answers</button> <button class="smallGreenButton">Retake</button></div>
            <div class="singleTestContainer"><span style="margin-top: 5px">User Name + Test Name + Score + Test Date</span> <button class="smallButton">View Answers</button> <button class="smallGreenButton">Retake</button></div>
            <div class="singleTestContainer"><span style="margin-top: 5px">User Name + Test Name + Score + Test Date</span> <button class="smallButton">View Answers</button> <button class="smallGreenButton">Retake</button></div>
        </div>



    </div>
</body>
</html>