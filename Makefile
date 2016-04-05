all: graphTests

graphTests:
	mkdir -p bin
	javac -d bin ./GraphTests.java 

.PHONY: clean

clean:
	rm -f bin/*