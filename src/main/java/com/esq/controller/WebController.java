package com.esq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esq.util.CommonUtil;

/**
  * web平台统一入口
 * @author esqabc
 * @Create 2019-11-11 11:11:11
 * @Website www.esqabc.com
 * @WeChat 110
 */
@Controller
public class WebController{
	private static Logger log = LoggerFactory.getLogger(WebController.class);
	/**
	 * 登录页面
	 */
	@RequestMapping("/login")
	public String loginPage() {
		System.out.println("朋友您来登录了，请多多关照一下==》"+CommonUtil.ESQABC_WEBSITE);
		log.info("朋友您来登录了，请多多关照一下==》"+CommonUtil.ESQABC_WEBSITE);
		log.error("朋友您来登录了，请多多关照一下==》"+CommonUtil.ESQABC_WEBSITE);
		return "login";
	}
	/**
	 * 首页页面
	 */
	@RequestMapping("/index")
	public String indexPage() {
		System.out.println("朋友您来首页了，请多多关照一下==》"+CommonUtil.ESQABC_WEBSITE);
		log.info("朋友您来首页了，请多多关照一下==》"+CommonUtil.ESQABC_WEBSITE);
		log.error("朋友您来首页了，请多多关照一下==》"+CommonUtil.ESQABC_WEBSITE);
		return "index";
	}
}
