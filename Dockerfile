FROM jboss/wildfly
ADD  ./target/demo-0.0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/demo.war
