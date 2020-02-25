#!/bin/bash

docker stop sb-app
docker rm sb-app
docker build -t sb-app .
docker run -d -p 8080:8080 --name sb-app sb-app:latest
