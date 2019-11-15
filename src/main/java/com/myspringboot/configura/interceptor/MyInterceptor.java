package com.myspringboot.configura.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 定义拦截器
 * @author Administrator
 *
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

	// controller前执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.err.println("进入了拦截器");
		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null || "".equals(session.getAttribute("user"))) {
			request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
			return false;
		}
		return true;
	}

	// controller方法后执行
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.err.println("进入了拦截器后");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	// 视图页面渲染后执行
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.err.println("进入了拦截器11");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
