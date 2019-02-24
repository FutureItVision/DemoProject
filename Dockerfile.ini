FROM selenium/standalone-chrome:latest

RUN sudo apt-get update \
  && sudo apt-get -y install openjdk-8-jdk

RUN java -version

RUN cd /tmp && wget https://www-us.apache.org/dist/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.tar.gz

RUN cd /opt \
	&& sudo tar -xvzf /tmp/apache-maven-3.6.0-bin.tar.gz

ENV PATH "$PATH:/opt/apache-maven-3.6.0/bin" 
ENV M2_HOME "/opt/apache-maven-3.6.0"

RUN sudo update-alternatives --install "/usr/bin/mvn" "mvn" "/opt/apache-maven-3.6.0/bin/mvn" 0 \
  && sudo update-alternatives --set mvn /opt/apache-maven-3.6.0/bin/mvn

RUN mvn --version

RUN sudo apt-get -y install gconf-service libasound2 libatk1.0-0 libatk-bridge2.0-0 \
libc6 libcairo2 libcups2 libdbus-1-3 libexpat1 libfontconfig1 libgcc1 libgconf-2-4 \
libgdk-pixbuf2.0-0 libglib2.0-0 libgtk-3-0 libnspr4 libpango-1.0-0 libpangocairo-1.0-0 libstdc++6 libx11-6 libx11-xcb1 libxcb1 libxcomposite1 libxcursor1 libxdamage1 \
libxext6 libxfixes3 libxi6 libxrandr2 libxrender1 libxss1 libxtst6 ca-certificates fonts-liberation libappindicator1 libnss3 lsb-release xdg-utils


COPY ./DemoProject /usr/src/DemoProject
WORKDIR /usr/src/DemoProject

EXPOSE 4444

VOLUME /root/.m2

RUN sudo mvn clean install -X