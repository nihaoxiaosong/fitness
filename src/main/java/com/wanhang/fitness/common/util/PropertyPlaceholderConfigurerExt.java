package com.wanhang.fitness.common.util;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.wanhang.common.cipher.CipherHelper;

public class PropertyPlaceholderConfigurerExt extends PropertyPlaceholderConfigurer {
	  @Override 
      protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) 
                      throws BeansException { 
		  
              String password = props.getProperty("jdbc.password"); 
              
              if (password != null) {
                      //解密jdbc.password属性值，并重新设置 
            	  String result = CipherHelper.aesDecryptBase64(password);
                  props.setProperty("jdbc.password", result); 
              } 
              
              super.processProperties(beanFactory, props); 
      } 
	  
	  public static void main(String[] args) {
		  String a = CipherHelper.aesDecryptBase64("ZYxJSZZmcWqjiEID98uq/g==");
		  String b = CipherHelper.aesEncryptBase64("songjie");
		  System.out.println(a);
		  System.out.println(b);
	}
	  
}
