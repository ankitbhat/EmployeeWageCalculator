#!/bin/bash
for file in `find ./ -type f -name "*.class"`
do
      echo $file
done
java -cp ./classes/ com/empapp2/$1

