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
											//ע��spring�ļ�������ķ���<ContextRefreshedEvent>
	@Autowired
	CSAService csaService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		//WebApplicationContext����spring������  ������
		WebApplicationContext ac = (WebApplicationContext) event.getApplicationContext();
		//ServletContext����application��web����������������web����������ʼ����
		ServletContext acc = ac.getServletContext();
		if (acc!=null&&ac.getParent()==null) {
			System.out.println(csaService.getProvinces());
		}
	}

}
