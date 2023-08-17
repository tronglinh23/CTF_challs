#!/bin/bash
docker rm -f csrf-001
docker build --tag=csrf-001 .
docker run -p 1337:1337 --rm --name=csrf-001 csrf-001