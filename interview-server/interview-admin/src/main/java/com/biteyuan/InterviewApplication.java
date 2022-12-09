package com.biteyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author Jianfreespace
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class InterviewApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(InterviewApplication.class, args);
        System.out.println("\n" +
                "                        \n" +
                "                        \n" +
                "/|        .--.          \n" +
                "||        |__|          \n" +
                "||        .--.     .|   \n" +
                "||  __    |  |   .' |_  \n" +
                "||/'__ '. |  | .'     | \n" +
                "|:/`  '. '|  |'--.  .-' \n" +
                "||     | ||  |   |  |   \n" +
                "||\\    / '|__|   |  |   \n" +
                "|/\\'..' /        |  '.' \n" +
                "'  `'-'`         |   /  \n" +
                "                 `'-'   \n");
    }
}
