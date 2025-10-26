package main

import (
	"fmt"
	"log"
	"strings"

	"example.com/greetings"
)

type UserUpdate struct {
	ExternalId string `json:"external_id" validate:"required"`
	Email      string `json:"email" validate:"required"`
}

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
	update1 := UserUpdate{
		ExternalId: "1",
		Email:      "rajithk@gmail.com",
	}
	update2 := UserUpdate{
		ExternalId: "2",
		Email:      "rk@gmail.com",
	}
	update3 := UserUpdate{
		ExternalId: "2",
		Email:      "rkblaegmail.com",
	}

	UserUpdates := []UserUpdate{
		update2, update3, update1,
	}

	maskEmail(&UserUpdates)

	fmt.Println(UserUpdates)

}

func maskEmail(userUpdates *[]UserUpdate) {
	for i := range *userUpdates {

		user := &(*userUpdates)[i] // Get a pointer to the actual element

		atIndex := strings.Index(user.Email, "@")
		if atIndex == -1 {
			continue
		}

		underscores := strings.Repeat("-", atIndex)
		user.Email = underscores + user.Email[atIndex:]
	}
}
