#  Java 17이 설치된 기본 OS 이미지 사용
FROM openjdk:23-jdk-slim

#  작업할 폴더를 만들고 이동
WORKDIR /app

#  JAR 파일을 컨테이너 내부로 복사
COPY build/libs/*.jar app.jar

#  컨테이너 실행 시 실행할 명령어
CMD ["java", "-jar", "app.jar"]

#  컨테이너에서 사용할 포트 (Spring Boot 기본 8080)
EXPOSE 8080