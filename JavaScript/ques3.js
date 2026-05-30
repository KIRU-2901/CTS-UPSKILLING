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
