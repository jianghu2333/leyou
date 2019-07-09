package com.laiqio.sellergoods;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("com.laiqio.sellergoods.mapper")
public class SellerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SellerApplication.class,args);
    }
}
