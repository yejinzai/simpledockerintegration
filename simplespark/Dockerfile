FROM sequenceiq/spark:1.6.0

COPY target/scala-2.11/simple-project_2.11-1.0.jar sparkapplication.jar

COPY bootstrap.sh /etc/bootstrap.sh

VOLUME /opt/spark/source

ENTRYPOINT ["/etc/bootstrap.sh"]
