FROM python:3.10-alpine

# Install packages
RUN apk add --update --no-cache supervisor

# Setup app
RUN mkdir -p /app

# Switch working environment
WORKDIR /app

# Install dependencies
COPY requirements.txt ./requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

# Add application
COPY challenge .

# Copy flag
COPY flag.txt /flag.txt

# Setup supervisor
COPY config/supervisord.conf /etc/supervisord.conf

# Expose port the server is reachable on
EXPOSE 1337

# Disable pycache
ENV PYTHONDONTWRITEBYTECODE=1

# Run supervisord
CMD ["/usr/bin/supervisord", "-c", "/etc/supervisord.conf"]