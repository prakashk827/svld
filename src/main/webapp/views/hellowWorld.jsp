<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%-- <h1>My name is ${object.myName}</h1>
<h1>My friend name is ${object.myFriendName}</h1>
<h1>My lecture name is ${object.myLectureName}</h1> --%>



<c:forEach  items="${cities}" var="city" >  
   <p style="color:red">My city name is :
   <span style="color:green"> <c:out value="${city}"/> </span>
   
   </p>  
</c:forEach>  

</body>
</html>