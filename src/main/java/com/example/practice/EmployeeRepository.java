package com.example.practice;


import org.springframework.data.jpa.repository.JpaRepository;


//這是一個介面 EmployeeRepository，它繼承了 JpaRepository
//擁有泛型參數 <Employee, Long>，代表該介面能操作的實體類別是 Employee而主鍵類型是 Long
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}