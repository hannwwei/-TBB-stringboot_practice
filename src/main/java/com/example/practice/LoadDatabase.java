package com.example.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//這是一個Spring Boot應用程式的設定檔案，定義了一個名為LoadDatabase的類別
@Configuration
class LoadDatabase {


  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  //初始化資料庫的方法initDatabase，透過@Bean注釋設定
  //此方法接收一個EmployeeRepository物件作為引數
  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    //將Bilbo Baggins和Frodo Baggins的資料插入到資料庫中
    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
    };
  }
}