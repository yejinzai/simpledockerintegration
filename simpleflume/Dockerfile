FROM probablyfine/flume

ENV FLUME_AGENT_NAME a1

ENV FLUME_CONF_FILE /var/tmp/flume.conf

ADD simple.conf /var/tmp/flume.conf

VOLUME /opt/flume/source /opt/flume/target

ENTRYPOINT [ "flume-ng", "agent", "-c", "/opt/flume/conf", "-f", "/var/tmp/flume.conf", "-n", "a1", "-Dflume.root.logger=INFO,console" ]
