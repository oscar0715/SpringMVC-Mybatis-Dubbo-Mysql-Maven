package demo.service.DemoServiceDemo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/provider.xml" });
		context.start();
		System.out.println("这里是dubbo-provider服务，按任意键退出");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}