# 基础镜像为java，标签（版本）为8
FROM java:8
# 镜像作者
MAINTAINER zc
# 将mybootch10-3-3-0.0.1-SNAPSHOT.jar添加到镜像中，并重命名为app.jar
ADD mybootch10-3-3-0.0.1-SNAPSHOT.jar app.jar
# 运行镜像的容器，监听8080端口
EXPOSE 8080
# 启动时运行java -jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]