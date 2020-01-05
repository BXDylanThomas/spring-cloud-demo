# 获取config-server中的远程仓库的配置文件
~~~~properties
spring.application.name=config-client
#指明远程仓库的分支
spring.cloud.config.label=master
spring.cloud.config.profile=dev
# 指明配置服务中心的网址。
spring.cloud.config.uri=http://localhost:8888/
server.port=8881
~~~~


~~~~properties
spring.application.name=config-server
server.port=8888

#配置git仓库地址
spring.cloud.config.server.git.uri=https://github.com/BXDylanThomas/spring-cloud-demo
#配置仓库路径
spring.cloud.config.server.git.searchPaths=spring-learn/cloud-learn/spring-cloud-config-respo/
#配置仓库的分支
spring.cloud.config.label=master
#私有仓库需要填写
spring.cloud.config.server.git.username=
spring.cloud.config.server.git.password=
~~~~


# 配置高可用的配置中心

> 注意此时需要在bootstrap.properties中配置 
> bootstrap.properties 的优先级高于 application.properties

config-server将信息注册到eureka中，client从其去获取
~~~~properties
spring.application.name=config-client
spring.cloud.config.label=master
spring.cloud.config.profile=dev
#spring.cloud.config.uri= http://localhost:8888/

eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
#配置中心读取文件
spring.cloud.config.discovery.enabled=true
#服务名
spring.cloud.config.discovery.serviceId=config-server
server.port=8881

~~~~
