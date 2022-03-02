package com.test.Action.MVC;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

@Component(
	    property = {
	        "javax.portlet.name=com_test_Action_mvcRendercommandtestPortlet",
	        "mvc.command.name=/greet"
	    },
	    service = MVCActionCommand.class
	)
public class MvcActioncommandtest implements MVCActionCommand{

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		System.out.println("Action method running");
		String Name= ParamUtil.get(actionRequest, "name", StringPool.BLANK);
		String greetingMessage = "Hello " + Name + "! Welcome to OSGi";
		actionRequest.setAttribute("GREETER_MESSAGE", greetingMessage);
		SessionMessages.add(actionRequest, "greetingMessage", greetingMessage);
		
		return false;
		
	}

}
