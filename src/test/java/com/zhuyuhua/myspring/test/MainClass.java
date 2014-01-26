/**
 * @Project:myspring
 * @Package:com.zhuyuhua.myspring.test 
 * @FileName:CallBack.java 
 * @Date:2014-1-16 下午2:06:54 
 * @Version V1.0.0
 * Copyright(c)ShenZhen Expressway Engineering Consultants Co.,Ltd 
 */
package com.zhuyuhua.myspring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuyuhua.myspring.aop.business.IBaseBusiness;
import com.zhuyuhua.myspring.controller.LoginControllerTest;




/** 
 * @ClassName:CallBack 
 * @Desc:TODO
 * @Author:joe
 * @Date:2014-1-16 下午2:06:54 
 * @Since:V 1.0 
 */
public class MainClass
{
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				LoginControllerTest.classPath);

		IBaseBusiness business = (IBaseBusiness) context
				.getBean("businessProxy");
		business.delete("猫");

		// AspectBusiness aspectBusiness = (AspectBusiness) context
		// .getBean("aspectBusiness");
		// aspectBusiness.delete("狗+++++");
	}
}


