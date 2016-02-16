all: run

build: src/calculator/Calculator.java
	javac -cp src src/calculator/Calculator.java

run: build
	java -cp src calculator.Calculator
