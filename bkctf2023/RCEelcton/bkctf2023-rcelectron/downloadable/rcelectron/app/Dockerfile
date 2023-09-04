FROM node:slim as builder

RUN apt update && \
    apt install -y gcc 

WORKDIR /build
ADD printflag.c .
RUN gcc -o printflag -static printflag.c 

FROM node:slim

ENV DEBIAN_FRONTEND noninteractive

ENV DISPLAY :99


RUN apt update && \
    apt install -y curl &&\
    # apt install -y --no-install-recommends xauth && \
    apt install -y libnss3-dev libgbm-dev libasound2-dev && \
    apt install -y --no-install-recommends xfce4 xdg-utils xvfb 

COPY --from=builder --chown=root:root /build/printflag /printflag

RUN chmod -rw /printflag && \
    chmod +x /printflag

COPY ./package.json /app/
WORKDIR /app
RUN npm install

COPY ./src/ /app/

RUN chown -R node:node /app/

COPY run.sh /app/

USER node

ENTRYPOINT [ "bash", "./run.sh" ]