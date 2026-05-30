let eventList = [

    "Music Event",
    "Workshop",
    "Sports Meet"
];
eventList.push(
    "Baking Workshop"
);
console.log(eventList);
const musicEvents = eventList.filter(
    event => event.includes("Music")
);
console.log(musicEvents);
const cards = eventList.map(
    event => `Event: ${event}`
);
console.log(cards);
