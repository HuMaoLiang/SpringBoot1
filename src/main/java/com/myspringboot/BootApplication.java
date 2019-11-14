package com.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController //构造类型注释
//@EnableAutoConfiguration
@SpringBootApplication 
/**
 * @SpringBootApplication包含三个功能：
 * 	·@EnableAutoConfiguration：启动SpringBoot的自动配置机制
 * 	·@ComponentScan：启动@Component对应用程序所在的软件包的扫描
 * 	·@Configuration：允许在上下文中注册额外的bean或者导入其他配置类
 * 
 * 不是强制必须使用SpringBootApplication，例如不想再应用程序中使用组件扫描或配置属性扫描：
 * 	@Comfihuration（proxyBeanMethods = false）
 * 	@EnableAutoConfiguration
 * 	@Import({Mycofig.class,MyAotherConfig.class})
 */
public class BootApplication {

//	@RequestMapping("/")
//	public  String  home() {
//		return "你好世界";
//	}
//	
	public  static  void  main(String[] args) {
		//下面这行代码就禁止了热部署
		//System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(BootApplication.class, args);
		System.out.println("启动完成");
	}
	
}
