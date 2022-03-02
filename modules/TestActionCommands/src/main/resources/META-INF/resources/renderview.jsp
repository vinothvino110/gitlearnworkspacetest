<%@ include file="/init.jsp" %>

Iam retuned jsp....


<portlet:renderURL var="Back">
  <portlet:param name="jspPage" value="/view.jsp"/>
  </portlet:renderURL>
  
  <a href="<%=Back%>">Back</a>
