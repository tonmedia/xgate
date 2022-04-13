package com.ton.xgate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@RefreshScope
@SpringBootApplication
public class XgateApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(XgateApplication.class, args);
	}

}
