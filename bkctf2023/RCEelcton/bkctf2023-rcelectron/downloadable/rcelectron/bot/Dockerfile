FROM python:3-alpine

RUN apk update \
    # Install Docker CLI
    && apk add docker-cli \
    # && apk add --no-cache python3 py3-pip \
    # Install python dependencies
    && pip install flask gunicorn requests

ADD ./src/ /app/
COPY ./config.json /app/
WORKDIR /app/

# VOLUME [ "/var/run/docker.sock" ]
# VOLUME [ "/app/config.json" ]

ENV PORT=5001 BIND_ADDR=0.0.0.0
EXPOSE 5001

ENTRYPOINT gunicorn -b "${BIND_ADDR}:${PORT}" --access-logfile - --error-logfile - app:app