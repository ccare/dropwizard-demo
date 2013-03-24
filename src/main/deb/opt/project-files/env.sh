#!/bin/sh
export JAR_FILE=/opt/${project.name}/lib/${project.name}.jar
export LOG_FILE=/var/log/${project.name}/${project.name}.log
export ERROR_LOG_FILE=/var/log/${project.name}/${project.name}.err

export ARGS=server