#!/bin/bash
chal="${CHAL:-nosql-injection-001}"
docker rm -f "$chal"
docker build --tag="$chal" .
docker run -p 1337:1337 --rm --name="${chal}" "${chal}"