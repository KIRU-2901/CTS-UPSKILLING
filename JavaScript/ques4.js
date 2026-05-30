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
