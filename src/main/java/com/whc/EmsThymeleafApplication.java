package com.whc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.whc.dao") // 扫描com.whc.dao下的所有mapper类作为Mapper映射文件
public class EmsThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsThymeleafApplication.class, args);
	}

}
