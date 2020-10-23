package com.cyy.listener;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.cyy.service.CSAService;

@Component
public class InitListener implements ApplicationListener<ContextRefreshedEvent> {
											//注意spring的监听器类的泛型<ContextRefreshedEvent>
	@Autowired
	CSAService csaService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		//WebApplicationContext代表spring容器的  上下文
		WebApplicationContext ac = (WebApplicationContext) event.getApplicationContext();
		//ServletContext代表application，web容器中最大的作用域，web创建就它初始化了
		ServletContext acc = ac.getServletContext();
		if (acc!=null&&ac.getParent()==null) {
			System.out.println(csaService.getProvinces());
		}
	}

}
