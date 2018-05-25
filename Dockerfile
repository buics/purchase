FROM java:8
VOLUME /tmp
ADD target/ScrumModule*.jar ScrumModule.jar
RUN sh -c 'touch /ScrumModule.jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /ScrumModule.jar"]
