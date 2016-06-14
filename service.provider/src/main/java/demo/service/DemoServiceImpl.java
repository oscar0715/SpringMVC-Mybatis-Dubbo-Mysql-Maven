package demo.service;

public class DemoServiceImpl implements DemoService {

	public String sayHello() {
		System.out.println("hello dubbo!");
		return "hello dubbo!";
	}

}
