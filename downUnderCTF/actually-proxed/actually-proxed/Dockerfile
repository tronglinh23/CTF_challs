FROM golang:1.20-alpine3.17

WORKDIR /app

COPY . ./

RUN go build -o out/ ./...
USER 1000:1000
EXPOSE 9000

ENTRYPOINT [ "./docker-entrypoint.sh" ]
