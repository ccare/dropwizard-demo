#!/bin/bash
source /opt/${project.name}/env.sh
/usr/bin/java -jar $JAR_FILE $ARGS >$LOG_FILE 2>$ERROR_LOG_FILE &
