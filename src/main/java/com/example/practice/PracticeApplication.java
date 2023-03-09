package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication這個註解實際上包含了三個註解：@Configuration
//@EnableAutoConfiguration和@ComponentScan
@SpringBootApplication
public class PracticeApplication {

	//PracticeApplication.class參數指定了包含main方法的類別
	//args參數是可以傳入應用程式的命令列引數的陣列
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}

// @Configuration註解表示這個類別包含了Spring的設定資訊。
// @EnableAutoConfiguration註解讓Spring Boot可以根據類別路徑中的相依性自動設定應用程式。
// @ComponentScan註解告訴Spring去哪裡尋找元件，例如控制器和資料庫存取物件。
