FROM openjdk:8

ADD target/spring-kubernetes-helm.jar spring-kubernetes-helm.jar

ENTRYPOINT ["java","-jar","spring-kubernetes-helm.jar"]