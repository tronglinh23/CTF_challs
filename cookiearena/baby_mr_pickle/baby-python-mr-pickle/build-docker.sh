#!/bin/bash
docker rm -f baby-python-mr-pickle
docker build --tag=baby-python-mr-pickle .
docker run -p 1337:1337 --rm --name=baby-python-mr-pickle baby-python-mr-pickle