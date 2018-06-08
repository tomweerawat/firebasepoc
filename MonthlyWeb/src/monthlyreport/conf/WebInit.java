package monthlyreport.conf;

import javax.servlet.HttpConstraintElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletSecurityElement;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletCtx) throws ServletException {
		AnnotationConfigWebApplicationContext annoCtx = new AnnotationConfigWebApplicationContext();
		annoCtx.register(MvcConfig.class);
		annoCtx.setServletContext(servletCtx);
		ServletRegistration.Dynamic servlet = servletCtx.addServlet("dispatcher", new DispatcherServlet(annoCtx));
		servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
        CharacterEncodingFilter charFilter = new CharacterEncodingFilter();
        charFilter.setEncoding("UTF-8");
        charFilter.setForceEncoding(true); 
        charFilter.setServletContext(servletCtx);
        servletCtx.addFilter("encodingFilter", charFilter).addMappingForUrlPatterns(null, false, "/*");
     /*   HttpConstraintElement httpConstraintElement = new HttpConstraintElement(TransportGuarantee.CONFIDENTIAL,"hotum_role"); 
        ServletSecurityElement servletSecurityElement = new ServletSecurityElement(httpConstraintElement);*/





	}

}
