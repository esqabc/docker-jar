#表示使用 java为基础镜像，如果镜像不存在服务器本地中，请先下载镜像（docker pull java）
FROM java:latest

#MAINTAINER 后面是镜像的描述
MAINTAINER esqabc "www.esqabc.com"

#指定了临时文件目录为/tmp。其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp。改步骤是可选的，如果涉及到文件系统的应用就很有必要了。
#/tmp目录用来持久化到 Docker 数据文件夹，因为 Spring Boot 使用的内嵌 Tomcat 容器默认使用/tmp作为工作目录 
VOLUME /tmp

#将应用jar包复制到app.jar
ADD dockerjar.jar app.jar
RUN bash -c 'touch /app.jar'

#开启内部服务端口
#EXPOSE 8888

#启动服务
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
