获取config-server中的远程仓库的配置文件
~~~~
spring.application.name=config-client
#指明远程仓库的分支
spring.cloud.config.label=master
spring.cloud.config.profile=dev
# 指明配置服务中心的网址。
spring.cloud.config.uri=http://localhost:8888/
server.port=8881
~~~~


~~~~
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
