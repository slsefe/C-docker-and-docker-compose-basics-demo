# Docker and Docker Compose Basics Demo

Demo fo Docker and Docker Compose Basics

## Demo1:运行一个简单的容器

```bash
docker run ubuntu echo hello docker
```

## Demo1:运行Tomcat服务器

### 1.准备Tomcat镜像

在仓库中搜索镜像
```bash
docker search tomcat
```

下载镜像
```bash
docker pull tomcat
```
    
查看本地镜像
```bash
docker images
```

### 2.启动Tomcat

启动容器
```bash
docker run --name tomcat -p 8080:8080 -d tomcat
```
    
查看运行中的容器
```bash
docker ps
```
此时访问`http://localhost:8080/`报404, 因为Tomcat还没有部署任何Web应用

想容器拷贝文件
```bash
docker cp web/ tomcat:/usr/local/tomcat/webapps/ROOT/
````
此时访问`http://localhost:8080/`，可以看到页面

查看Tomcat日志
```bash
docker logs -f tomcat
```

### 2.停止Tomcat

停止容器
```bash
docker stop tomcat
```

重启停止的容器
```bash
docker restart tomcat
```

查看停止的容器
```bash
docker ps -a
```

删除容器
```bash
docker rm tomcat
```
