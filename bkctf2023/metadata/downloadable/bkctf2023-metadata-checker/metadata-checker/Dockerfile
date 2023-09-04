FROM php:8.1-apache

RUN apt-get update && \
    apt-get install -y libjpeg-dev libpng-dev supervisor && \ 
    docker-php-ext-configure gd --with-jpeg && \
    docker-php-ext-install gd exif

COPY challenge /var/www/html

COPY flag.txt /flag.txt

RUN chown -R www-data /var/www/*

RUN sed 's|<VirtualHost *:80>|<VirtualHost *:1337>|g' -i /etc/apache2/sites-enabled/000-default.conf && \
    sed 's|Listen 80|Listen 1337|g' -i /etc/apache2/ports.conf

COPY config/supervisord.conf /etc/supervisor/conf.d/supervisord.conf

EXPOSE 1337

CMD ["/usr/bin/supervisord", "-c", "/etc/supervisor/conf.d/supervisord.conf"]