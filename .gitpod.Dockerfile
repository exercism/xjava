FROM gitpod/workspace-full

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh \
    && sdk install java 11.0.7.fx-zulu \
    && mkdir -p /home/gitpod/bin \
    && wget -q -O - 'https://github.com/exercism/configlet/releases/download/v3.9.2/configlet-linux-64bit.tgz' | tar -xzf - -C /home/gitpod/bin \
    && git clone https://github.com/exercism/problem-specifications /home/gitpod/specs"

ENV PATH="${PATH}:/home/gitpod/bin"
