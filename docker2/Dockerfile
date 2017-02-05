FROM nixos/nix

RUN nix-env -i git

WORKDIR /tmp

RUN git clone https://github.com/scala-native/scala-native.git

WORKDIR /tmp/scala-native

RUN  nix-shell bin/scala-native.nix -A clangEnv --run "sbt ';rtlib/publishLocal ;nscplugin/publishLocal'";
