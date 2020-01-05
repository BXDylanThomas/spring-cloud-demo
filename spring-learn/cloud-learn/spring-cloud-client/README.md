添加读取远程配置刷新
   配置  management.endpoints.web.exposure.include=bus-refresh
   POST请求 http://localhost:8861/actuator/refresh
   在需要value的类上添加@RefreshScope
   
   
> server.application.name=config-client 
> 如果是其他的服务名会报错，待验证


# 重试 （待测试）
~~~properties
 <!--重试操作，针对消息中间件-->
        <dependency>
            <groupId>org.springframework.retry</groupId>
            <artifactId>spring-retry</artifactId>
        </dependency>
~~~~

