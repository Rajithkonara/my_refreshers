package main

import (
	"example.com/greetings"
	"fmt"
	"log"
)

func main() {

	// Get a greeting message and print it.
	//message := greetings.Hello("Rajithk")
	//fmt.Println(message)

	// Set properties of the predefined Logger, including
	// the log entry prefix and a flag to disable printing
	// the time, source file, and line number.
	log.SetPrefix("greetings: ")
	log.SetFlags(0)

	// Request a greeting message.
	message, err := greetings.HelloWithHandling("Rajith")
	// If an error was returned, print it to the console and
	// exit the program.
	if err != nil {
		log.Fatal(err)
	}

	// If no error was returned, print the returned message
	// to the console.
	fmt.Println(message)

	// initialized array with values
	names := []string{"Jessy", "walter", "soul"}

	messages, err := greetings.Hellos(names)

	if err != nil {
		log.Fatal(err)
	}

	// If no error was returned, print the returned map of
	// messages to the console.
	fmt.Println(messages)
}
