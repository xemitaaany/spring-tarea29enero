<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>

	<h1>The Cars Existence</h1>
	
	<c:forEach items="${carList}" var="car">
		<p>
			${car.name}: $${car.price}
		</p>
	</c:forEach>

</body>
</html>