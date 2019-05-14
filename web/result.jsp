<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="e" uri="https://www.owasp.org/index.php/OWASP_Java_Encoder_Project" %>
<!DOCTYPE HTML>
  <html>
    <body>
      <div>test</div>
      <div>
        <c:choose>
          <c:when test="${not empty returnVal}">
            <ul>
              <c:forEach var="returnVal_i" items="${returnVal}">
                <li>${returnVal_i}</li>
                <li><e:forHtml value="${returnVal_i}" /></li>
              </c:forEach>
            </ul>
          </c:when>
          <c:otherwise>You did not select Yes to get a web response</c:otherwise>
        </c:choose>
      </div>
      <div>
        <a href="index.jsp" id="back">Back</a>
      </div>
    </body>
  </html>
