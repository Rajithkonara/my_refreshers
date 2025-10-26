package main

import (
	"fmt"
	"time"
)

type Counter struct {
	total         int
	lastUpdatedAt time.Time
}

func (c *Counter) Increment() {
	c.total++
	c.lastUpdatedAt = time.Now()
}

func (c Counter) String() string {
	return fmt.Sprintf("total: %d, lastUpdatedAt: %v", c.total, c.lastUpdatedAt)
}

func main() {
	var c Counter
	fmt.Println(c.String())
	c.Increment()
	fmt.Println(c.String())
}
