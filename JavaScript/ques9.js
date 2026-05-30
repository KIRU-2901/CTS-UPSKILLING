fetch(
    "https://jsonplaceholder.typicode.com/users"
)
.then(response => response.json())
.then(data => {
    console.log(data);
})
.catch(error => {
    console.log(error);
});
async function loadEvents() {
    try {
        const response =
            await fetch(
                "https://jsonplaceholder.typicode.com/users"
            );
        const data =
            await response.json();      
        console.log(data);

    }
    catch(error) {

        console.log(error);
    }
}
loadEvents();
