package com.ssh.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport
	implements RequestAware, SessionAware,ServletRequestAware, ServletResponseAware{

	protected Map<String, Object> request;
	
	protected Map<String, Object> session;
	
	protected HttpServletRequest httpRequest;
	
	protected HttpServletResponse httpResponse;
	
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		this.httpResponse = arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.httpRequest = arg0;
	}

}
