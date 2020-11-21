# health-server

因为 mybatis 需要一个数据源，所以配置一个 application.yml

# mysql

spring:
datasource:
#MySQL 配置
driverClassName: com.mysql.cj.jdbc.Driver
url: jdbc:mysql://localhost:3306/healthmanagement?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC
username: root
password: root
mybatis:
mapper-locations: classpath:mapper/\*.xml
type-aliases-package: com.example.demo.model

server:
port: 9000
启动项目：http://localhost:9000
