<%@ include file="/init.jsp" %>

<liferay-ui:success key="greetingMessage" message="message" />
<p>
	<b><liferay-ui:message key="mvcrendercommandtest.caption"/></b>
</p>




<portlet:renderURL var="testrenderurl">
	<portlet:param name="mvcRenderCommandName" value="/resources/view" />
</portlet:renderURL>

<aui:button href="<%= testrenderurl %>" value="goto page render" />



<liferay-portlet:actionURL name="/greet" var="greetURL" />
<aui:form action="<%= greetURL %>" method="post" name="fm">
	<aui:input name="name" type="text" />

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>
<%String str=(String)request.getAttribute("GREETER_MESSAGE"); 
out.println(str);
%>
<%= str%>


<portlet:resourceURL id="/blade/captcha" var="captchaURL" />


<a href="<%= captchaURL %>">capt</a>











