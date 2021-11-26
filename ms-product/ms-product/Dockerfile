FROM  azul/zulu-openjdk:11.0.10
RUN apt update
#COPY target/ms-product-0.0.2.jar ms-product-0.0.2.jar

RUN mkdir -p /opt/arquitectura/logs
VOLUME /opt/arquitectura/logs
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app


ENV SERVER_PORT 7878
ENV EUREKA_URI "https://localhost:8762/eureka"


ENTRYPOINT [ "java", \
            "-cp",                      \
            "app:app/lib/*",                              \
            "arquitectura.software.msproduct.MsProductApplication" ]
