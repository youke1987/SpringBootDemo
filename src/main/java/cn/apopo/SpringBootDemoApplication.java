package cn.apopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 应用程序的启动引导类,主要的Spring配置类
// @EnableAutoConfiguration // Spring Boot根据添加的jar依赖猜测如何配置
@SpringBootApplication // 开启Spring的组件扫描和Spring Boot的自动配置功能（@Configuration + @ComponentScan + @EnableAutoConfiguration）
public class SpringBootDemoApplication {

    // main放置在root package
    // 作用是可以在命令行里把该应用程序当做一个可执行的JAR文件来运行
    public static void main(String[] args) {
        // 负责启动引导应用程序
        // 通过run方法,把业务委托给SpringApplication,并引导我们的应用,启动Spring,相应的启动被自动配置的Tomcat
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
