#!/bin/bash

# Création du répertoire bin s'il n'existe pas
mkdir -p bin

# Compiler
javac -d bin src/*.java

# Exécuter
java -cp bin App