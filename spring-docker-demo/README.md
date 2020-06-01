# Spring Docker Demo

从Spring Boot项目构建镜像，Dockerfile的使用

## 1. 构建项目JAR包

```bash
./gradlew bootJar
```

## 2. 在项目根目录下定义Dockerfile文件

## 3. 从Dockerfile构建镜像

```bash
docker build -t spring-docker:1.0 .
```

## 4. 运行镜像

```bash
docker run --name spring-docker -d -p 8080:8080 spring-docker:1.0
```

## 5. 访问应用

```bash
curl http://localhost:8080/hello
```

### 6. 关闭应用

```bash
docker rm --force spring-docker
```
