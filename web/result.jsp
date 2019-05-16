<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="e" uri="https://www.owasp.org/index.php/OWASP_Java_Encoder_Project" %>
<!DOCTYPE HTML>
  <html>
    <body>
      <div>test</div>
      <div>
        <c:choose>
          <c:when test="${not empty returnVal}">
            <c:forEach var="returnVal_i" items="${returnVal}">
              <c:out value="${returnVal_i}" escapeXml="false"/>
              <div><e:forHtml value="${forEncode}" /></div>
            </c:forEach>
          </c:when>
          <c:otherwise>You did not select Yes to get a web response</c:otherwise>
        </c:choose>
      </div>
      <div>
        <a href="index.jsp" id="back">Back</a>
      </div>
    </body>
  </html>
