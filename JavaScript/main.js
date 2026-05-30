// Q1 - JavaScript Basics

console.log("Welcome to the Community Portal");

window.onload = function () {
  alert("Page Loaded Successfully");
};

// Q2 - Data Types and Operators

const eventName = "Music Festival";

const eventDate = "2026-06-01";

let seats = 50;

console.log(`${eventName} on ${eventDate} has ${seats} seats`);

seats--;

console.log("Remaining Seats: " + seats);

// Q3 - Conditionals, Loops, Error Handling

const events = [
  { name: "Music Festival", seats: 10 },

  { name: "Workshop", seats: 0 },
];

events.forEach((event) => {
  if (event.seats > 0) {
    console.log(event.name);
  }
});

try {
  let registration = true;

  if (!registration) {
    throw new Error("Registration Failed");
  }
} catch (error) {
  console.log(error.message);
}

// Q4 - Functions and Closures

function addEvent(name) {
  console.log("Added: " + name);
}

function registerUser(user) {
  console.log(user + " Registered");
}

function filterEventsByCategory(category) {
  console.log(category);
}

function registrationCounter() {
  let count = 0;

  return function () {
    count++;

    return count;
  };
}

const counter = registrationCounter();

console.log(counter());
console.log(counter());
