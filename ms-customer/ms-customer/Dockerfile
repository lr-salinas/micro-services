FROM  azul/zulu-openjdk:11.0.10
RUN apt update

#COPY target/ms-customer-0.0.2.jar ms-customer-0.0.2.jar

ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENV SERVER_PORT 6945
ENV EUREKA_URI "https://localhost:8762/eureka"

ENTRYPOINT ["java", \
            "-cp",                      \
            "app:app/lib/*",                              \
            "arquitectura.software.mscustomer.MsCustomerApplication"]

