package com.test.Action.MVC;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

@Component(
		 property = {
		 "javax.portlet.name=com_test_Action_mvcRendercommandtestPortlet",
		 "mvc.command.name=/resources/view"
		 }, service = MVCRenderCommand.class
		 )

public class TestMVCRenderCommand implements MVCRenderCommand{
@Override
public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
	
	System.out.println("qqqqqqqqqqqqww");
	System.out.println("This is ovrriden mvc command method...........");
	return "/renderview.jsp";
}
}
