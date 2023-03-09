package com.example.practice;

class EmployeeNotFoundException extends RuntimeException {

  //這是一個自定義的例外（Exception）
  //當根據傳入的員工 ID 在資料庫中找不到相應的員工時會拋出此例外
  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}