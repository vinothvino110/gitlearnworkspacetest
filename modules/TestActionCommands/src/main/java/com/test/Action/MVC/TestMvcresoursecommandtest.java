package com.test.Action.MVC;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=com_liferay_blade_samples_portlet_resourcecommand_CaptchaPortlet",
			"mvc.command.name=/blade/captcha"
		},
		service = MVCResourceCommand.class
	)
	public class TestMvcresoursecommandtest implements MVCResourceCommand {
	@Override
	public boolean serveResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {

		if (_log.isInfoEnabled()) {
			_log.info("get captcha resource ");
		}

		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);

			return false;
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);

			return true;
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
			TestMvcresoursecommandtest.class);
		

	}