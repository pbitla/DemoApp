//package com.example.demo;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class WebInitializer implements WebApplicationInitializer {
//
//	public void onStartup(ServletContext container) throws ServletException {
//
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//		ctx.register(ApplicationConfiguration.class);
//		ctx.setServletContext(container);
//
//		// Manage the lifecycle of the root application context
//		container.addListener(new ContextLoaderListener(ctx));
//
//		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
//
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/");
//
//	}
//
//}