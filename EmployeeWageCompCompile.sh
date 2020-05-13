#!/bin/bash
function compileJavaFiles(){
	javac -d ./classes/ -cp ./classes/ $1
}
for file in `find ./ -type f -name "*.java"`
do
	echo $file
	compileJavaFiles $file
done
